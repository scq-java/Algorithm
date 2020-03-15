package com.scq.doman;

import lombok.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Files
 * @Description
 * @Author JavaQ
 * @Date 2020/1/14 14:02
 **/
@Data
public class TreeFiles {
    private String title;
    private int size;
    private int type;
    private List<TreeFiles> children = new ArrayList<TreeFiles>();


}
