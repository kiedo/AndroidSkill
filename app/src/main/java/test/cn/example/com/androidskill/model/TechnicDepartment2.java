package test.cn.example.com.androidskill.model;

import test.cn.example.com.androidskill.inter.CompanyInter2;
import test.cn.example.com.util.LogUtil;

/**
 * Created by xgxg on 2017/7/20.
 */

public class TechnicDepartment2 implements CompanyInter2 {
    @Override
    public void operator() {
        LogUtil.i("技术部");
    }
}
