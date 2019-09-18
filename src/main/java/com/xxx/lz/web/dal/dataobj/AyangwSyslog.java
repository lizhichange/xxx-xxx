package com.xxx.lz.web.dal.dataobj;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder(builderMethodName = "myBuilder")
public class AyangwSyslog implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ayangw_syslog.id
     *
     * @mbg.generated 2019-08-27 17:24:20
     */
    private Integer id;
    /**
     * ayangw_syslog.log_name
     *
     * @mbg.generated 2019-08-27 17:24:20
     */
    private String logName;
    /**
     * ayangw_syslog.log_time
     *
     * @mbg.generated 2019-08-27 17:24:20
     */
    private Date logTime;
    /**
     * ayangw_syslog.log_txt
     *
     * @mbg.generated 2019-08-27 17:24:20
     */
    private String logTxt;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logName=").append(logName);
        sb.append(", logTime=").append(logTime);
        sb.append(", logTxt=").append(logTxt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}