package com.XJDream.mapper;

import com.XJDream.pojo.TbContentCategory;
import com.XJDream.pojo.TbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int countByExample(TbContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int deleteByExample(TbContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int insert(TbContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int insertSelective(TbContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    TbContentCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int updateByPrimaryKeySelective(TbContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Sun Sep 10 18:07:08 CST 2017
     */
    int updateByPrimaryKey(TbContentCategory record);
}