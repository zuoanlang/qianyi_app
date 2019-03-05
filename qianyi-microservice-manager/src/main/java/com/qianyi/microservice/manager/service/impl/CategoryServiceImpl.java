package com.qianyi.microservice.manager.service.impl;

import com.qianyi.microservice.manager.mapper.TbCategoryMapper;
import com.qianyi.microservice.manager.pojo.EasyUITreeNode;
import com.qianyi.microservice.manager.pojo.TbCategory;
import com.qianyi.microservice.manager.pojo.TbCategoryExample;
import com.qianyi.microservice.manager.service.CategoryService;
import com.qianyi.microservice.manager.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * 数据字典管理Service
 * <p>Title: CategoryServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private TbCategoryMapper CategoryMapper;
	
	@Override
	public List<EasyUITreeNode> getContentCatList(long parentId) {
		// 根据parentid查询子节点列表
		TbCategoryExample example = new TbCategoryExample();
		TbCategoryExample.Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andParentIdEqualTo(parentId).andStatusEqualTo(1);
		//执行查询
		List<TbCategory> catList = CategoryMapper.selectByExample(example);
		//转换成EasyUITreeNode的列表
		List<EasyUITreeNode> nodeList = new ArrayList<>();
		for (TbCategory tbCategory : catList) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbCategory.getId());
			node.setText(tbCategory.getName());
			node.setState(tbCategory.getIsParent()?"closed":"open");
			//添加到列表
			nodeList.add(node);
		}
		return nodeList;
	}

	@Override
	public E3Result addContentCategory(long parentId, String name) {
		//创建一个tb__category表对应的pojo对象
		TbCategory Category = new TbCategory();
		//设置pojo的属性
		Category.setParentId(parentId);
		Category.setName(name);
		//1(正常),2(删除)
		Category.setStatus(1);
		//排序
		Category.setSortOrder(getNodeNumOfParent(parentId)+1);
		//新添加的节点一定是叶子节点
		Category.setIsParent(false);
		Category.setCreated(new Date());
		Category.setUpdated(new Date());
		//插入到数据库
		CategoryMapper.insert(Category);
		//判断父节点的isparent属性。如果不是true改为true
		//根据parentid查询父节点
		TbCategory parent = CategoryMapper.selectByPrimaryKey(parentId);
		if (!parent.getIsParent()) {
			parent.setIsParent(true);
			//更新到数数据库
			CategoryMapper.updateByPrimaryKey(parent);
		}
		//返回结果，返回E3Result，包含pojo
		return E3Result.ok(Category);
	}

	@Override
	public boolean editCategory(long id, String name) {
		//1. 根据id查询节点
		TbCategory tbCategory = CategoryMapper.selectByPrimaryKey(id);
		//2. 设置更新条件
		tbCategory.setUpdated(new Date());
		tbCategory.setName(name);
		//3. 跟新节点
		TbCategoryExample example = new TbCategoryExample();
		int i = CategoryMapper.updateByPrimaryKeySelective(tbCategory);
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCategory(long id) {
		// 根据parentid查询子节点列表
		TbCategoryExample example = new TbCategoryExample();
		//设置删除条件(逻辑删除)
		//1. 根据id查询节点
		TbCategory tbCategory = CategoryMapper.selectByPrimaryKey(id);
		tbCategory.setStatus(0);
		int i = CategoryMapper.updateByPrimaryKeySelective(tbCategory);
		if(i>0){
			return true;
		}
		return false;
	}

	/**
	 * 查询当前节点的下的子节点数目
	 * @return int
	 */
	private int getNodeNumOfParent(Long parentId){
		// 根据parentid查询子节点列表
		TbCategoryExample example = new TbCategoryExample();
		TbCategoryExample.Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbCategory> catList = CategoryMapper.selectByExample(example);

		return catList.size();
	}
}
