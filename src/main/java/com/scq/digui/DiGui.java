package com.scq.digui;

import com.scq.doman.TreeFiles;
import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName DiGui
 * @Description
 * @Author JavaQ
 * @Date 2020/1/14 11:45
 **/
public class DiGui {

    public static void main(String[] args) {
        TreeFiles filens = new DiGui().filens(new File("E:/上传文件夹"),new TreeFiles());
        System.out.println(filens);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }


    // 递归遍历指定目录下的文件夹及文件并构建树结构
    public TreeFiles filens(File file,TreeFiles node) {
//        root.setName(file.getName());
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println(file1.getName());
//            if (file1.isDirectory()) {
//                filens(file1);
//            }
//        }
        node.setTitle(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File file1 : files) {
                TreeFiles child = new TreeFiles();
                child.setTitle(file1.getName());
                if (file1.isFile()) {
                    child.setType(2);
                } else {
                    child.setType(1);
                }
                node.getChildren().add(filens(file1,child));
            }
        }
        return node;
    }

}
