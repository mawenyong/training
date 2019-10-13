package com.ssm.trainingsystem.Service.imp;

import com.ssm.trainingsystem.Dao.LoginpersonMapper;
import com.ssm.trainingsystem.Model.Loginperson;
import com.ssm.trainingsystem.Service.LoginPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginPersonServiceImp implements LoginPersonService {

    @Autowired
    private LoginpersonMapper loginpersonMapper;

    /**
     * 登录时的校验
     * @param loginperson  登录实体
     * @return 查询的结果级
     */
    @Override
    public Loginperson isLog(Loginperson loginperson) {
        if (!loginperson.getLoginname().equals("") && !loginperson.getLoginpwd().equals("")) {
            return loginpersonMapper.isLog(loginperson);
        }else{
            return null ;
        }
    }

    @Override
    public int add(Loginperson loginperson) {
        int temp=0;  //失败
        //1.判断所有主要信息不能为空
        if(loginperson.getLoginname().equals("") || loginperson.getLoginname().equals(null)) {
            temp= -2;   //登录账号不能为空
        }
        else if(loginperson.getLoginpwd().equals("")|| loginperson.getLoginpwd().equals(null)){
            temp= -4;   //登录密码不能为空
        }else{
            //2.判断登录账号不能重复
            int count=loginpersonMapper.selectLoginPersonName(loginperson.getLoginname());
            System.out.println("相同的账号总数为："+count);
            if (count==0){
                //添加数据
                temp=loginpersonMapper.insertSelective(loginperson);
            }else{
                //编号重复
                temp= -1;
            }
        }
        return temp;
    }

    @Override
    public int Update(Loginperson loginperson) {
        return 0;
    }

    @Override
    public List<Loginperson> getAll(Loginperson loginperson) {
        return loginpersonMapper.selectAll(loginperson);
    }

    @Override
    public Loginperson getOne(int loginpersonid) {
        return null;
    }
}
