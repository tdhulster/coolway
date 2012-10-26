package com.coolway.dao;

import com.coolway.entity.Invite;
import com.coolway.entity.InviteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InviteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int countByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insert(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insertSelective(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    List<Invite> selectByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    Invite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExampleSelective(@Param("record") Invite record, @Param("example") InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExample(@Param("record") Invite record, @Param("example") InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKeySelective(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invite
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKey(Invite record);
}