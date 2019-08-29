package com.xxx.lz.web.controller;

import com.xxx.lz.web.dal.dao.IfConfigMapper;
import com.xxx.lz.web.dal.dao.IfTypeMapper;
import com.xxx.lz.web.dal.dataobj.IfConfig;
import com.xxx.lz.web.dal.dataobj.IfConfigExample;
import com.xxx.lz.web.dal.dataobj.IfType;
import com.xxx.lz.web.dal.dataobj.IfTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lizhi
 * @date 2018-7-5
 */
@Controller
@RequestMapping("zongzi")
public class ZongZiController {


    private final IfTypeMapper ifTypeMapper;

    @Autowired
    public ZongZiController(IfTypeMapper ifTypeMapper) {
        this.ifTypeMapper = ifTypeMapper;
    }

    @Autowired
    private IfConfigMapper ifConfigMapper;


    @GetMapping("/index")
    String index(ModelMap modelMap) {
        List<IfType> typeList = ifTypeMapper.selectByExample(new IfTypeExample());
        modelMap.addAttribute("typeList", typeList);


        IfConfigExample ifConfigExample = new IfConfigExample();
        List<IfConfig> ifConfigs = ifConfigMapper.selectByExampleWithBLOBs(ifConfigExample);

        if (!CollectionUtils.isEmpty(ifConfigs)) {
            for (IfConfig ifConfig : ifConfigs) {
                modelMap.addAttribute(ifConfig.getIfK(), ifConfig.getIfV());
            }
        }
        return "zongzi/index";
    }


}
