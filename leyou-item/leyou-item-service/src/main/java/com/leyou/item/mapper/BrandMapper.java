package com.leyou.item.mapper;

import com.leyou.cart.pojo.Brand;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<Brand>,SelectByIdListMapper<Brand,Long> {

    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) VALUES (#{cid},#{bid})")
    void insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);

    @Update("UPDATE tb_category_brand SET category_id = #{cid} where brand_id = #{bid}" )
    void updateCategoryBrand(@Param("cid") Long categoryId, @Param("bid") Long id);

    @Delete("DELETE from tb_category_brand where brand_id = #{bid}")
    void deleteCategoryBrandByBid(@Param("bid") Long bid);

    @Select("SELECT brand_id from tb_category_brand where category_id = #{cid}")
    List<Long> selectBrandIdsByCategoryId(@Param("cid") Long cid);
}
