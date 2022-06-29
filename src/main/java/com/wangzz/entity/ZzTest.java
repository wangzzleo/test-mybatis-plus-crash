package com.wangzz.entity;

import java.io.Serializable;
import java.util.Date;

public class ZzTest implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Date test;

    /**
     * 
     */
    private String testVarchar;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public Date getTest() {
        return test;
    }

    /**
     * 
     */
    public void setTest(Date test) {
        this.test = test;
    }

    /**
     * 
     */
    public String getTestVarchar() {
        return testVarchar;
    }

    /**
     * 
     */
    public void setTestVarchar(String testVarchar) {
        this.testVarchar = testVarchar;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ZzTest other = (ZzTest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTest() == null ? other.getTest() == null : this.getTest().equals(other.getTest()))
            && (this.getTestVarchar() == null ? other.getTestVarchar() == null : this.getTestVarchar().equals(other.getTestVarchar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTest() == null) ? 0 : getTest().hashCode());
        result = prime * result + ((getTestVarchar() == null) ? 0 : getTestVarchar().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", test=").append(test);
        sb.append(", testVarchar=").append(testVarchar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}