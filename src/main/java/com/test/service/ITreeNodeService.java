package com.test.service;

import com.test.model.TreeNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITreeNodeService {
    List<TreeNode> creatMenu();
}
