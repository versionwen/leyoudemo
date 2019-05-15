package com.leyou.item.service;

import com.leyou.cart.pojo.Category;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
public interface CategoryService {
    /**
     * 查询商品分类的方法
     * @param pid
     * @return
     */
    public List<Category> queryCategoryByPid(Long pid);
    /**
     * 根据品牌信息查询商品分类
     * @param bid
     * @return
     */
    public List<Category> queryCategoryByBid(Long bid);

    /**
     * 添加商品分类
     * @param category
     * @return
     */
    @Transactional
    public int addCateGory(Category category);
    /**
     * 修改商品分类
     * @param id
     * @param name
     * @return
     */
    @Transactional
    public int updateCategory(Long id, String name);
    /**
     * 删除商品分类
     * @param id
     * @return
     */
    @Transactional
    public int deleteCateGory(Long id);

    @Transactional
    public void deleteChild(Category category);
    /**
     * 根据多个cids，查询得到一个cname的集合
     * @param cids
     * @return
     */
    public List queryCategoryNameByCids(List cids);
    public List<Category> queryCategoriesByCids(List<Long> cids);
    public List<Category> queryParentByCid3(Long id);
}
