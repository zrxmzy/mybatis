package com.xin.pojo;

/**
 * java类简单作用描述
 *
 * @Author: zhang
 * @CreateDate: 2020/9/28 14:35
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2020</p>
 */
public class Role {
    private String id;
    private String roleCode;
    private String roleName;
    public Role(){};
    public Role(String id, String roleCode, String roleName) {
        this.id = id;
        this.roleCode = roleCode;
        this.roleName = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
