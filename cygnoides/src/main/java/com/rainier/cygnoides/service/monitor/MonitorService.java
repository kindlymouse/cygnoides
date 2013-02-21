package com.rainier.cygnoides.service.monitor;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//Spring Bean的标识.
@Component
//默认将类中的所有public函数纳入事务管理.
@Transactional(readOnly = true)
public class MonitorService {

}
