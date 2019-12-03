package com.atguigu.gmall.gmallusermanage.controller;

import com.atguigu.gmall.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall.gmallusermanage.service.UserManageService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.List;

@RestController
public class UserManageController {
    @Autowired
    private UserManageService userManageService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll() {
        return userManageService.findAll();
    }

    @RequestMapping("findByUserInfo")
    public List<UserInfo> findByUserInfo(UserInfo userInfo) {
        return userManageService.findUserInfo(userInfo);
    }

    @RequestMapping("findUserInfoByName")
    public List<UserInfo> findUserInfoByName(UserInfo userInfo) {
        return userManageService.findUserInfoByName(userInfo);
    }

    @RequestMapping("findUserInfoByNickName")
    public List<UserInfo> findUserInfoByNickName(UserInfo userInfo) {
        return userManageService.findUserInfoByNickName(userInfo);
    }

    @RequestMapping("findOneUserInfoById")
    public UserInfo findOneUserInfoById(UserInfo userInfo) {
        return userManageService.findOneUserInfoById(userInfo);
    }

    @RequestMapping("addUserInfo")
    public void addUserInfo(UserInfo userInfo) {
        userManageService.addUserInfo(userInfo);
    }

    @RequestMapping("updateUserInfoByPrimaryKey")
    public void updateUserInfoByPrimaryKey(UserInfo userInfo) {
        userManageService.updateUserInfoByPrimaryKey(userInfo);
    }

    @RequestMapping("updateUserInfoByName")
    public void updateUserInfoByName(UserInfo userInfo) {
        userManageService.updateUserInfoByName(userInfo);
    }

    @RequestMapping("delete")
    public void delete(UserInfo userInfo) {
        userManageService.delete(userInfo);
    }
    //deleteByPrimaryKey
    @RequestMapping("deleteByExample")
    public void deleteByExample(UserInfo userInfo) {
        userManageService.deleteByExample(userInfo);
    }

    @RequestMapping("deleteByPrimaryKey")
    public void deleteByPrimaryKey(String id) {
        userManageService.deleteByPrimaryKey(id);
    }
}
