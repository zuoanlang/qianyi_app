package com.qianyi.microservice.manager.service;

import com.qianyi.microservice.manager.pojo.EasyUITreeNode;
import com.qianyi.microservice.manager.utils.E3Result;

import java.util.List;

public interface CategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);

	/**
	 * 修改节点名称
	 * @param parentId
	 * @param name
	 * @return
	 */
	public boolean editCategory(long id, String name);

	/**
	 * 删除节点
	 * @param parentId
	 * @param name
	 * @return
	 */
	public boolean deleteCategory(long id);
}
