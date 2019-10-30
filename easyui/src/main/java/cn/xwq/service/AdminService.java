package cn.xwq.service;

import cn.xwq.vo.DataGridResult;

public interface AdminService {

    DataGridResult findAdminByPage(int index,int size);
}
