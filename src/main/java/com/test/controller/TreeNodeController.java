package com.test.controller;

import com.test.model.TreeNode;
import com.test.service.ITreeNodeService;
import com.test.util.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/menu")
public class TreeNodeController {
    @Autowired
    private ITreeNodeService treeNodeService;
    @RequestMapping("/treeNode")
    List<TreeNode> creatTree(TreeNode treeNode)
    {

        return treeNodeService.creatMenu();
    }

}
