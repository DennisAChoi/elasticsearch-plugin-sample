package com.github.jun06t.module;

import com.github.jun06t.service.IndexCountService;
import org.elasticsearch.common.inject.AbstractModule;

public class IndexCountModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IndexCountService.class).asEagerSingleton();
    }
}