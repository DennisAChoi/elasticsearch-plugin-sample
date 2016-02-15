package com.github.jun06t;

import java.util.Collection;

import com.github.jun06t.module.IndexCountModule;
import com.github.jun06t.rest.IndexCountRestAction;
import com.github.jun06t.service.IndexCountService;
import org.elasticsearch.common.collect.Lists;
import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;

public class IndexCountPlugin extends AbstractPlugin {
    @Override
    public String name() {
        return "IndexCountPlugin";
    }

    @Override
    public String description() {
        return "This is a elasticsearch-indexcount plugin.";
    }

    // for Rest API
    public void onModule(final RestModule module) {
        module.addRestAction(IndexCountRestAction.class);
    }

    // for Service
    @Override
    public Collection<Class<? extends Module>> modules() {
        final Collection<Class<? extends Module>> modules = Lists
                .newArrayList();
        modules.add(IndexCountModule.class);
        return modules;
    }

    // for Service
    @SuppressWarnings("rawtypes")
    @Override
    public Collection<Class<? extends LifecycleComponent>> services() {
        final Collection<Class<? extends LifecycleComponent>> services = Lists
                .newArrayList();
        services.add(IndexCountService.class);
        return services;
    }
}
