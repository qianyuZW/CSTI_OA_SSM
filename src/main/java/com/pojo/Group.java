package com.pojo;

import java.util.Date;

public class Group {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csti_group.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csti_group.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csti_group.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column csti_group.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csti_group.id
     *
     * @return the value of csti_group.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csti_group.id
     *
     * @param id the value for csti_group.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csti_group.group_name
     *
     * @return the value of csti_group.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csti_group.group_name
     *
     * @param groupName the value for csti_group.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csti_group.gmt_create
     *
     * @return the value of csti_group.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csti_group.gmt_create
     *
     * @param gmtCreate the value for csti_group.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column csti_group.gmt_modified
     *
     * @return the value of csti_group.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column csti_group.gmt_modified
     *
     * @param gmtModified the value for csti_group.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}