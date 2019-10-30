package cn.xwq.service.impl;

import cn.xwq.pojo.Admin;
import cn.xwq.repostory.AdminRepostory;
import cn.xwq.service.AdminService;
import cn.xwq.vo.DataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepostory adminRepostory;

    @Override
    public DataGridResult findAdminByPage(int index, int size) {
        DataGridResult result = new DataGridResult();

        int start = (index-1)*size;
        List<Admin> admins = adminRepostory.findByPage(start, size);
        long count = adminRepostory.count();
        result.setTotal(count);
        result.setRows(admins);
        return result;
    }
}





















