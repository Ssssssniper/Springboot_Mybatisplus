package com.hu;

import com.hu.bean.User;
import com.hu.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectAll() {
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
    }
    @Test
    void updatebyID() {
        User user = new User();
        user.setId(1L);     // 索引依据
        user.setName("更改");         //  更改内容
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    void deletebyID() {
        int i = userMapper.deleteById(1L);
        System.out.println(i);
    }

    @Test
    void insertForFieldFill() {
        User user = new User();
        user.setAge(1);
        user.setName("自动填充");
        user.setEmail("测试");
        int res = userMapper.insert(user);
        System.out.println(res);
    }


}
