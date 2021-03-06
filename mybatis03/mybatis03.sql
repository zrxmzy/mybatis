CREATE DATABASE smbms;
CREATE TABLE SMBMS_PROVIDER(
    ID VARCHAR(50) NOT NULL ,
    PROCODE VARCHAR(50) DEFAULT NULL COMMENT '供应商编号',
    PRONAME VARCHAR(50) DEFAULT NULL COMMENT '供应商名称',
    PRODESC VARCHAR(50) DEFAULT NULL COMMENT '供应商描述',
    PROCONTACT VARCHAR(50) DEFAULT NULL COMMENT '',
    PROPHONE VARCHAR(20) DEFAULT NULL COMMENT '供应商电话',
    PROADDRESS VARCHAR(50) DEFAULT NULL COMMENT '供应商地址',
    PROFAX VARCHAR(20) DEFAULT NULL COMMENT '供应商传真',
    CREATEDBY VARCHAR(20) DEFAULT NULL COMMENT '创建人',
    CREATIONDATE DATETIME DEFAULT NULL COMMENT '创建时间',
    MODIFYDATE DATETIME DEFAULT NULL COMMENT '修改时间',
    MODIFYBY VARCHAR(20) DEFAULT NULL COMMENT '修改人',
    PRIMARY KEY (ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;

CREATE TABLE SMBMS_BILL(
  ID VARCHAR(50) NOT NULL ,
  BILLCODE VARCHAR(50) DEFAULT NULL COMMENT '订单编号',
  PRODUCTNAME VARCHAR(50) DEFAULT NULL COMMENT '',
  PRODUCTDESC VARCHAR(50) DEFAULT NULL COMMENT '',
  PRODUCTUNIT VARCHAR(20) DEFAULT NULL COMMENT '',
  PRODUCTCOUNT VARCHAR(20) DEFAULT NULL COMMENT '',
  TOTALPRICE VARCHAR(20) DEFAULT NULL COMMENT '总价',
  ISPAYMENT VARCHAR(10) DEFAULT NULL COMMENT '',
  CREATEDBY VARCHAR(20) DEFAULT NULL COMMENT '创建人',
  CREATIONDATE DATETIME DEFAULT NULL COMMENT '创建时间',
  MODIFYBY VARCHAR(20) DEFAULT NULL COMMENT '修改人',
  MODIFYDATE DATETIME DEFAULT NULL COMMENT '修改时间',
  PROVIDERID VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (ID),
  CONSTRAINT fk_ProBill FOREIGN KEY (PROVIDERID) REFERENCES SMBMS_PROVIDER (ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;
CREATE TABLE SMBMS_USER(
    ID VARCHAR(50) NOT NULL,
    USERCODE VARCHAR(50) DEFAULT NULL COMMENT '用户编号',
    USERNAME VARCHAR(50) DEFAULT NULL COMMENT '用户名',
    USERPASSWORD VARCHAR(50) DEFAULT NULL COMMENT '用户密码',
    GENDER VARCHAR(50) DEFAULT NULL COMMENT '性别',
    BIRTHDAY VARCHAR(20) DEFAULT NULL COMMENT '生日',
    PHONE VARCHAR(20) DEFAULT NULL COMMENT '电话',
    ADDRESS VARCHAR(50) DEFAULT NULL COMMENT '地址',
    USERROLE VARCHAR(50) DEFAULT NULL COMMENT '角色',
    CREATEBY VARCHAR(20) DEFAULT NULL COMMENT '创建人',
    CREATIONDATE DATETIME DEFAULT NULL COMMENT '创建时间',
    MODIFYBY VARCHAR(20) DEFAULT NULL COMMENT '修改人',
    MODIFYDATE DATETIME DEFAULT NULL COMMENT '修改时间',
    PRIMARY KEY (ID)
) ENGINE = INNODB DEFAULT CHARSET = UTF8;
CREATE TABLE SMBMS_ROLE(
    ID VARCHAR(50) NOT NULL ,
    ROLECODE VARCHAR(50) DEFAULT NULL COMMENT '角色编号',
    ROLENAME VARCHAR(50) DEFAULT NULL COMMENT '角色名称',
    PRIMARY KEY (ID)
)ENGINE = INNODB DEFAULT CHARSET = UTF8;
