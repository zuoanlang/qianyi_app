package com.qianyi.microservice.manager.controller;

import com.qianyi.microservice.manager.pojo.EasyUITreeNode;
import com.qianyi.microservice.manager.service.CategoryService;
import com.qianyi.microservice.manager.utils.E3Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 内容分类管理Controller
 * <p>Title: CatController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryServiceImpl;
	
	@RequestMapping("/category/list")
	@ResponseBody
	public List<EasyUITreeNode> getCatList(
			@RequestParam(name="id", defaultValue="0")Long parentId) {
		List<EasyUITreeNode> list = categoryServiceImpl.getContentCatList(parentId);
		return list;
	}
	
	/**
	 * 添加分类节点
	 */
	@RequestMapping(value="/category/create", method=RequestMethod.POST)
	@ResponseBody
	public E3Result createCategory(Long parentId, String name) {
		//调用服务添加节点
		E3Result e3Result = categoryServiceImpl.addContentCategory(parentId, name);
		return e3Result;
	}
	
	
}
