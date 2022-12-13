package com.test.service;

import com.test.mapper.TreeNodeMapper;
import com.test.model.TreeNode;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TreeNodeServiceImpl implements ITreeNodeService {
    @Autowired
    private TreeNodeMapper treeNodeMapper;
    @Override
    public List<TreeNode> creatMenu() {
        List<TreeNode> parent=treeNodeMapper.creatMenu(null);
        if(null!=parent&&parent.size()>0)
        {
            for(TreeNode t:parent)
            {
                List<TreeNode> child=treeNodeMapper.creatMenu(t.getId());
                t.setChildren(child);

            }
        }
        return parent;

    }
}
