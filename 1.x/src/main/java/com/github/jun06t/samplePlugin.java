package com.github.jun06t;

import java.util.Collection;

import com.github.jun06t.rest.sampleRestAction;
import org.elasticsearch.plugins.AbstractPlugin;
import org.elasticsearch.rest.RestModule;

public class samplePlugin extends AbstractPlugin {
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
