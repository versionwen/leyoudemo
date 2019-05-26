package com.leyou.item.mapper;

import com.leyou.cart.pojo.Sku;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;


public interface SkuMapper extends Mapper<Sku>,DeleteByIdsMapper<Sku> {
}
