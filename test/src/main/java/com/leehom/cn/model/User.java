package com.leehom.cn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

/**
 * @Author: Leehom
 * @Description:
 * @Date: Created in 17:43 2020/1/2
 * @Modified By:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String id;

    private String name;

    private String userName;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private String note;
}
