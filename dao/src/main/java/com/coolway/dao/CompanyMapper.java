package com.coolway.dao;

import com.coolway.entity.Company;
import com.coolway.entity.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int countByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    Company selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKey(Company record);
}