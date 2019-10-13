package com.ssm.trainingsystem.Controller;

import com.ssm.trainingsystem.Model.Answer;
import com.ssm.trainingsystem.Service.AnswerService;
import com.ssm.trainingsystem.tool.ResponseMessage;
import com.ssm.trainingsystem.tool.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "Answer")
@RestController
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @CrossOrigin
    @ApiOperation("添加答题信息")
    @RequestMapping(value = "/addAnswer",method = RequestMethod.PUT)
    public ResponseMessage AddAnswer(@RequestBody Answer answer) {
        System.out.println("进入答题添加方法");
        int temp = 0; //失败

        if (answer != null) {
            temp = answerService.add(answer);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation(value = "根据条件取全部学生答题信息")
    @RequestMapping(value = "/getAllAnswer",produces = "application/json;charset=utf-8",method = RequestMethod.PUT)
    public ResponseMessage getAll(@RequestBody Answer answer){
        System.out.println("进入后台接口方法");
        Map<String,List> map = new HashMap<>();
        List<Answer> listAnswer=answerService.getAll(answer);
        map.put("list",listAnswer);
        return Result.success("200", map);
    }

    @CrossOrigin
    @ApiOperation("修改学生答题信息")
    @RequestMapping(value = "/updateAnswer",method = RequestMethod.PUT)
    public ResponseMessage UpdateAnswer(@RequestBody Answer answer) {
        System.out.println("进入学生修改答题方法");
        int temp = 0; //失败

        if (answer != null) {
            temp = answerService.Update(answer);
        }
        System.out.println("返回值为：" + temp);
        if (temp == 1) {
            return Result.success("1", "保存成功");
        }else{
            String str="保存失败";
            return Result.success("0", str);
        }
    }

    @CrossOrigin
    @ApiOperation("根据学生考题主键获取信息")
    @RequestMapping(value = "/getOneAnswer",method = RequestMethod.GET)
    public ResponseMessage getAnswer(@RequestParam Integer answerId) {
        System.out.println("获取学生考题信息");
        Answer answer=null; //失败

        if (answerId != 0) {
            answer=new Answer();
            answer = answerService.getOne(answerId);
            System.out.println("返回值为：" + answer);
        }

        return Result.success("1", answer);

    }


}
