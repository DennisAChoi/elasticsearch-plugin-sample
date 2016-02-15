package com.github.jun06t;

import java.util.Collection;

import com.github.jun06t.rest.sampleRestAction;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.rest.RestModule;

public class samplePlugin extends Plugin {
    @Override
    public String name() {
        return "samplePlugin";
    }

    @Override
    public String description() {
        return "This is a elasticsearch-sample plugin.";
    }

    // for Rest API
    public void onModule(final RestModule module) {
        module.addRestAction(sampleRestAction.class);
    }
}
