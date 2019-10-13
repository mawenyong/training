package com.ssm.trainingsystem.Service;

import com.ssm.trainingsystem.Model.Loginperson;

import java.util.List;

public interface LoginPersonService {

    public Loginperson isLog(Loginperson loginperson);

    public int add(Loginperson loginperson);

    public int Update(Loginperson loginperson);

    public List<Loginperson> getAll(Loginperson loginperson);

    public Loginperson getOne(int loginpersonid);
}
