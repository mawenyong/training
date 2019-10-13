package com.ssm.trainingsystem.Controller;

import com.ssm.trainingsystem.Model.Loginperson;
import com.ssm.trainingsystem.Model.Student;
import com.ssm.trainingsystem.Service.LoginPersonService;
import com.ssm.trainingsystem.tool.ResponseMessage;
import com.ssm.trainingsystem.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "loginPerson")
@RestController
public class LoginPersonController {

    @Autowired
    private LoginPersonService loginPersonService;

    @CrossOrigin
    @ApiOperation("登录校验方法")
    @RequestMapping(value = "/login", method = RequestMethod.PUT)
    public ResponseMessage login(@RequestBody Loginperson loginPerson) {
        System.out.println("进入登录校验方法");
        Loginperson loginpersonOne = new Loginperson();
        loginpersonOne = null;
        if (loginPerson != null) {
            loginpersonOne = loginPersonService.isLog(loginPerson);
        }
        System.out.println("返回值为：" + loginpersonOne);
        return Result.success("0", loginpersonOne);
    }

    @CrossOrigin
    @ApiOperation(value = "根据条件获取全部登录信息")
    @RequestMapping(value = "/getLoginPersonAll",produces = "application/json;charset=utf-8",method = RequestMethod.PUT)
    public ResponseMessage getAll(@RequestBody Loginperson loginPerson){
        System.out.println("进入后台登录日志接口方法");
        Map<String,List> map = new HashMap<>();
        List<Loginperson> listLoginPerson=loginPersonService.getAll(loginPerson);
        map.put("list",listLoginPerson);
        return Result.success("200", map);
    }


}
