package cn.slienceme.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.slienceme.common.utils.PageUtils;
import cn.slienceme.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author slience_me
 * @email slienceme.cn@gmail.com
 * @date 2025-01-17 21:07:08
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

