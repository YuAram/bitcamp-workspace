package com.eomcs.pms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
    value="com.eomcs.pms",
    excludeFilters = {
        @Filter(type = FilterType.REGEX, pattern = "com.eomcs.pms.web.*")
    })
public class RootConfig {

}
