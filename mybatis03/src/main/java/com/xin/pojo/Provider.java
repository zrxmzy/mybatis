package com.xin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 供应商
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:08
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    private String id;
    private String proCode;
    private String proName;
    private String proDesc;
    private String proContact;
    private String proPhone;
    private String proAddress;
    private String proFax;
    private String createdBy;
    private Date creationDate;
    private String modifyBy;
    private Date modifyDate;
}
