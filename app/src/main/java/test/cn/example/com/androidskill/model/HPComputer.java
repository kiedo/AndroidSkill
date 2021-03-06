package test.cn.example.com.androidskill.model;

/**
 * Created by xgxg on 2017/7/19.
 */

public class HPComputer {
    private String bd,os,display;

    private HPComputer(Builder builder){
        this.bd = builder.baord;
        this.os = builder.os;
        this.display = builder.display;
    }

    public static class Builder{
        private String baord,os,display;
        public Builder board(String board){
            this.baord = board;
            return this;
        }

        public Builder os(){
            this.os = "window 8 企业版";
            return this;
        }

        public Builder display(String display){
            this.display = display;
            return this;
        }

        public HPComputer create(){
            return new HPComputer(this);
        }
    }

    @Override
    public String toString() {
        return bd+"---"+os+"---"+display;
    }
}
