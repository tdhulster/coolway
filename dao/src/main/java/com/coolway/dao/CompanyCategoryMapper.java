package com.coolway.dao;

import com.coolway.entity.CompanyCategory;
import com.coolway.entity.CompanyCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int countByExample(CompanyCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByExample(CompanyCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insert(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int insertSelective(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    List<CompanyCategory> selectByExample(CompanyCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    CompanyCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExampleSelective(@Param("record") CompanyCategory record, @Param("example") CompanyCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByExample(@Param("record") CompanyCategory record, @Param("example") CompanyCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKeySelective(CompanyCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_category
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    int updateByPrimaryKey(CompanyCategory record);
}