package com.ssm.trainingsystem.Model;

public class Answerspaper {
    private Integer answerspaperid;

    private Integer answerid;

    private Integer examinationpapersid;

    private String iscorrect;

    private String answerresults;

    public Integer getAnswerspaperid() {
        return answerspaperid;
    }

    public void setAnswerspaperid(Integer answerspaperid) {
        this.answerspaperid = answerspaperid;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getExaminationpapersid() {
        return examinationpapersid;
    }

    public void setExaminationpapersid(Integer examinationpapersid) {
        this.examinationpapersid = examinationpapersid;
    }

    public String getIscorrect() {
        return iscorrect;
    }

    public void setIscorrect(String iscorrect) {
        this.iscorrect = iscorrect == null ? null : iscorrect.trim();
    }

    public String getAnswerresults() {
        return answerresults;
    }

    public void setAnswerresults(String answerresults) {
        this.answerresults = answerresults == null ? null : answerresults.trim();
    }
}