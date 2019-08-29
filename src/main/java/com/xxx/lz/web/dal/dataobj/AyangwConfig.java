package com.xxx.lz.web.dal.dataobj;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder")
public class AyangwConfig implements Serializable {
    /**
    *
    *
    * ayangw_config.ayangw_k
    
     *
     * @mbg.generated 2019-08-27 17:23:43
     */
    private String ayangwK;

    /**
    *
    *
    * ayangw_config.ayangw_v
    
     *
     * @mbg.generated 2019-08-27 17:23:43
     */
    private String ayangwV;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ayangwK=").append(ayangwK);
        sb.append(", ayangwV=").append(ayangwV);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}