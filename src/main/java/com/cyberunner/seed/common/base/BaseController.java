package com.cyberunner.seed.common.base;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AlphaDog on 2018/8/8.
 */
public class BaseController {

    protected Map<String, Object> listPattern(PageInfo<?> pageInfo) {
        Map<String, Object> rspData = new HashMap<>();
        rspData.put("list", pageInfo.getList());
        rspData.put("pageNum", pageInfo.getPageNum());
        rspData.put("pageSize", pageInfo.getPageSize());
        rspData.put("totalNum", pageInfo.getTotal());
        rspData.put("hasNextPage", pageInfo.isHasNextPage());
        return rspData;
    }

}
