package com.ssm.trainingsystem.Service.imp;

import com.ssm.trainingsystem.Dao.AnswerMapper;
import com.ssm.trainingsystem.Model.Answer;
import com.ssm.trainingsystem.Service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImp implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    /**
     * 添加每次答题后的总成绩
     * @param answer  答题信息添加
     * @return 是否添加成功
     */
    @Override
    public int add(Answer answer) {
        int temp=0 ;    //保存失败
        if (answer.getPersonnelid()==0){
            temp=-1;   //答题人必须进行填写
        }else{
            temp=answerMapper.insertSelective(answer);
        }
        return temp;
    }

    @Override
    public int Update(Answer answer) {
        return answerMapper.updateByPrimaryKeySelective(answer);
    }

    @Override
    public List<Answer> getAll(Answer answer) {
        return answerMapper.selectAll(answer);
    }

    /**
     * 获取要修改考试成绩信息
     * @param answerid 要修改考试成绩主键
     * @return 需要修改的考试成绩信息
     */
    @Override
    public Answer getOne(int answerid) {
        Answer answer=new Answer();
        answer=null;
        if (answerid!=0){
            answer=answerMapper.selectOne(answerid);
        }
        return answer;
    }
}
