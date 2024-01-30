package org.sici.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sici.model.process.ProcessType;
import org.sici.service.ProcessTypeService;
import org.sici.mapper.ProcessTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 20148
* @description 针对表【oa_process_type(审批类型)】的数据库操作Service实现
* @createDate 2024-01-30 19:45:08
*/
@Service
public class ProcessTypeServiceImpl extends ServiceImpl<ProcessTypeMapper, ProcessType>
    implements ProcessTypeService {

}




