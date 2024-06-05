package ReducTiem;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.net.SocketImpl;
import java.util.List;


public class PertTable{
    private SimpleIntegerProperty code;
    private SimpleStringProperty task_name;
    private SimpleStringProperty predecessors;
    private SimpleIntegerProperty ot;
    private SimpleIntegerProperty  mt;
    private SimpleIntegerProperty  pt;
    private SimpleIntegerProperty  et;
    private SimpleIntegerProperty  es;
    private SimpleIntegerProperty  ef;
    private SimpleIntegerProperty  ls;
    private SimpleIntegerProperty  lf;
    private SimpleIntegerProperty  sl;

    public PertTable(int code, String task_name, String predecessors, int ot, int mt, int pt, int et, int es, int ef, int ls, int lf, int sl) {
        this.code = new SimpleIntegerProperty(code);
        this.task_name = new SimpleStringProperty(task_name);
        this.predecessors = new SimpleStringProperty(predecessors);
        this.ot = new SimpleIntegerProperty(ot);
        this.mt = new SimpleIntegerProperty(mt);
        this.pt = new SimpleIntegerProperty(pt);
        this.et = new SimpleIntegerProperty(et);
        this.es = new SimpleIntegerProperty(es);
        this.ef = new SimpleIntegerProperty(ef);
        this.ls = new SimpleIntegerProperty(ls);
        this.lf = new SimpleIntegerProperty(lf);
        this.sl = new SimpleIntegerProperty(sl);
    }

    public int getCode() {
        return code.get();
    }

    public void setCode(int code) {
        this.code = new SimpleIntegerProperty(code);
    }

    public String getTask_name() {
        return task_name.get();
    }

    public void setTask_name(String task_name) {
        this.task_name = new SimpleStringProperty(task_name);
    }

    public String getPredecessors() {
        return predecessors.get();
    }

    public void setPredecessors(String predecessors) {
        this.predecessors = new SimpleStringProperty(predecessors);
    }

    public int getOt() {
        return ot.get();
    }

    public void setOt(int ot) {
        this.ot = new SimpleIntegerProperty(ot);
    }

    public int getMt() {
        return mt.get();
    }

    public void setMt(int mt) {
        this.mt = new SimpleIntegerProperty(mt);
    }

    public int getPt() {
        return pt.get();
    }

    public void setPt(int pt) {
        this.pt = new SimpleIntegerProperty(pt);
    }

    public int getEt() {
        return et.get();
    }

    public void setEt(int et) {
        this.et = new SimpleIntegerProperty(et);
}

    public int getEs() {
        return es.get();
    }

    public void setEs(int es) {
        this.es = new SimpleIntegerProperty(es);
    }

    public int getEf() {
        return ef.get();
    }

    public void setEf(int ef) {
        this.ef = new SimpleIntegerProperty(ef);
    }

    public int getLs() {
        return ls.get();
    }

    public void setLs(int ls) {
        this.ls = new SimpleIntegerProperty(ls);
    }

    public int getLf() {
        return lf.get();
    }

    public void setLf(int lf) {
        this.lf = new SimpleIntegerProperty(lf);
    }

    public int getSl() {
        return sl.get();
    }

    public void setSl(int sl) {
        this.sl = new SimpleIntegerProperty(sl);
    }
}
