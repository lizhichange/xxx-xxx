package com.xxx.lz.web.dal.dataobj;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "myBuilder")
public class IfType implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * if_type.id
     *
     * @mbg.generated 2019-08-27 17:25:06
     */
    private Integer id;
    /**
     * if_type.tName
     *
     * @mbg.generated 2019-08-27 17:25:06
     */
    private String tname;
    /**
     * if_type.state
     *
     * @mbg.generated 2019-08-27 17:25:06
     */
    private Integer state;

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