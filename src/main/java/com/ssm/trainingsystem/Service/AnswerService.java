package com.ssm.trainingsystem.Service;

import com.ssm.trainingsystem.Model.Answer;
import com.ssm.trainingsystem.Model.Attendance;

import java.util.List;

public interface AnswerService {

    public int add(Answer answer);

    public int Update(Answer answer);

    public List<Answer> getAll(Answer answer);

    public Answer getOne(int answerid);
}
