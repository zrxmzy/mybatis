package com.xin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 13:30
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private String id;
    private String billCode;
    private String productName;
    private String productDesc;
    private String productUnit;
    private String productCount;
    private String totalPrice;
    private String isPayment;
    private String createdBy;
    private Date creationDate;
    private String modifyBy;
    private Date modifyDate;
    private String providerId;
}
