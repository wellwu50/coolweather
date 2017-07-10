package org.well.coolwearher.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zz on 2017/7/10.
 */

public class Province extends DataSupport{
    // 实体类字段
    private int id;
    // 省的名字
    private String provinceName;
    // 省的代码
    private int provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
