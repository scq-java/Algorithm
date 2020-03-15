package com.scq.digui.controller;

import com.scq.digui.DiGui;
import com.scq.doman.TreeFiles;
import com.scq.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FileMenuController
 * @Description
 * @Author JavaQ
 * @Date 2020/1/14 21:48
 **/
@RestController
public class FileMenuController {
    @GetMapping("/api/menu")
    public Result fileList() {
        List<TreeFiles> l = new ArrayList<>();
        TreeFiles filens = new DiGui().filens(new File("E:/上传文件夹"),new TreeFiles());
        l.add(filens);
        return Result.ok(l);
    }
}
