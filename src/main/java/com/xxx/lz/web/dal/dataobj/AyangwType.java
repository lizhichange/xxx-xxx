package com.xxx.lz.web.dal.dataobj;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder")
public class AyangwType implements Serializable {
    /**
    *
    *
    * ayangw_type.id
    
     *
     * @mbg.generated 2019-08-27 17:24:26
     */
    private Integer id;

    /**
    *
    *
    * ayangw_type.tName
    
     *
     * @mbg.generated 2019-08-27 17:24:26
     */
    private String tname;

    /**
    *
    *
    * ayangw_type.state
    
     *
     * @mbg.generated 2019-08-27 17:24:26
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tname=").append(tname);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}