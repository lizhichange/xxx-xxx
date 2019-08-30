package com.xxx.lz.web.controller;


import com.xxx.lz.web.dal.dao.IfConfigMapper;
import com.xxx.lz.web.dal.dataobj.IfConfig;
import com.xxx.lz.web.dal.dataobj.IfConfigExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("other")
public class PayController {

    @GetMapping("/submit")
    String submit(

            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "money", required = false) String money,
            @RequestParam(value = "number", required = false) String number,
            @RequestParam(value = "out_trade_no", required = false) String out_trade_no,
            @RequestParam(value = "gid", required = false) String gid

    ) {
        IfConfigExample example = new IfConfigExample();
        example.createCriteria().andIfKEqualTo("epay_id");
        List<IfConfig> ifConfigs = ifConfigMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(ifConfigs)) {
            return "";
        }
        IfConfig ifConfig = ifConfigs.get(0);
        return "other/submit";
    }

    @Autowired
    private IfConfigMapper ifConfigMapper;

}
