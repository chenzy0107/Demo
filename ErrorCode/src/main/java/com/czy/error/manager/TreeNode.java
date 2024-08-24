package com.czy.error.manager;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode(of = "code")
public class TreeNode {
    int code;
    String name;

    @Setter
    List<TreeNode> nodes;

    public TreeNode(int code, String name){
        this.code = code;
        this.name = name;
    }

}
