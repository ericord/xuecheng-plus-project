package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author chaonianye
 * @description
 * @date 2023/5/12
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {
    private Long pageNo=1L;
    private Long pageSize=10L;

}
