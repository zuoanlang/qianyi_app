package com.qianyi.microservice.manager.service;

import com.qianyi.microservice.manager.pojo.EasyUITreeNode;
import com.qianyi.microservice.manager.utils.E3Result;

import java.util.List;

public interface CategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	E3Result addContentCategory(long parentId, String name);
}
