package com.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
    private Integer id;

    private String nodename;

    private String parentid;

    private List<TreeNode> children;


}