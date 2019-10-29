package cn.xwq.repostory;

import cn.xwq.pojo.Admin;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepostory extends PagingAndSortingRepository<Admin,Long> {

    @Query("SELECT * FROM tb_admin LIMIT :start,:size")
    public List<Admin> findByPage(@Param("start") int start, @Param("size") int size);
}
