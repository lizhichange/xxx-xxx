﻿<?php

define('SYSTEM_ROOT_E', dirname(__FILE__) . '/');
include '../if/common.php';
function showalert($msg,$status,$orderid=null){
    global $ereturn;
    echo '<meta charset="utf-8"/><script>window.location.href="'.$ereturn.$orderid.'";</script>';
}

$_POST = $_GET;
ksort($_POST); //排序post参数
reset($_POST); //内部指针指向数组中的第一个元素
$sign = '';
foreach ($_POST AS $key => $val) {
    if ($val == '') continue;
    if ($key != 'sign') {
        if ($sign != '') {
            $sign .= "&";
            $urls .= "&";
        }
        $sign .= "$key=$val"; //拼接为url参数形式
        $urls .= "$key=" . urlencode($val); //拼接为url参数形式
    }
}
if (!$_POST['pay_no'] || md5($sign . $conf['epay_key']) != $_POST['sign']) { //不合法的数据 KEY密钥为你的密钥
    showalert('验证失败！', 4, '订单回调验证失败！');
} else { //合法的数据
    $trade_no = $_POST['pay_no'];
    $out_trade_no = $_POST['param'];
    $sql = "SELECT * FROM if_order WHERE out_trade_no='{$out_trade_no}' limit 1";
    $res = $DB->query($sql);
    $srow = $DB->fetch($res);
    /*if($srow['sta']!=1){
         $sql = "update if_order set sta = 1, trade_no = '{$trade_no}' ,endTime = now() where out_trade_no = '{$out_trade_no}'";
            $sql2 = "UPDATE if_km set endTime = now(),out_trade_no = '{$out_trade_no}',trade_no='{$trade_no}',rel ='{$srow['rel']}',stat = 1
                where gid = {$srow['gid']} and stat = 0
                limit  1";
            $DB->query($sql);
            $DB->query($sql2);

    }
   showalert('您所购买的商品已付款成功，感谢购买！', 1, $out_trade_no);*/
   if($srow['sta']==0){
            /*if(!srow || $srow['money'] != $_GET['money']){
               showalert('验证失败！',4,'订单回调验证失败！');
            }*/
            $number = $srow['number'];
          
            $ok = 0;
            for($i=1;$i<=$number;$i++){
                $sql2 = "UPDATE if_km "
                        . "set endTime = now(),out_trade_no = '{$out_trade_no}',trade_no='{$trade_no}',rel ='{$srow['rel']}',stat = 1
                           where gid = {$srow['gid']} and stat = 0
                           limit  1";
                if($DB->query($sql2)){
                    $ok++; 
                }
            } 
        $sql = "update if_order set sta = 1, trade_no = '{$trade_no}' ,endTime = now() where out_trade_no = '{$out_trade_no}'";
                    
                 $DB->query($sql);
                          wsyslog("交易成功！[回调处理]","订单编号：".$out_trade_no.";数量：".$number.";成功提取数量：".$ok."");
            showalert('您所购买的商品已付款成功，感谢购买！',1,$out_trade_no);
        }else{
            showalert('您所购买的商品已付款成功，感谢购买！',1,$out_trade_no);
        }
   
}
?>