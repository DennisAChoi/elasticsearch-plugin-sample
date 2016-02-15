package com.github.jun06t.service;

import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.common.component.AbstractLifecycleComponent;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;

public class IndexCountService extends AbstractLifecycleComponent<IndexCountService> {

    @Inject
    public IndexCountService(final Settings settings) {
        super(settings);
        logger.info("CREATE IndexCountService");

        // TODO Your code..
    }

    @Override
    protected void doStart() throws ElasticsearchException {
        logger.info("START IndexCountService");

        // TODO Your code..
    }

    @Override
    protected void doStop() throws ElasticsearchException {
        logger.info("STOP IndexCountService");

        // TODO Your code..
    }

    @Override
    protected void doClose() throws ElasticsearchException {
        logger.info("CLOSE IndexCountService");

        // TODO Your code..
    }

}
