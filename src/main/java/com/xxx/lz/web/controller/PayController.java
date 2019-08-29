package com.xxx.lz.web.controller;


import com.xxx.lz.web.dal.dao.IfConfigMapper;
import com.xxx.lz.web.dal.dataobj.IfConfig;
import com.xxx.lz.web.dal.dataobj.IfConfigExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("other")
public class PayController {

    @GetMapping("/submit")
    String submit() {
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
