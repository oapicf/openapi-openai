package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CreateSpeechRequest;
import org.openapitools.vertxweb.server.model.CreateTranscription200Response;
import org.openapitools.vertxweb.server.model.CreateTranscriptionRequestModel;
import org.openapitools.vertxweb.server.model.CreateTranslation200Response;
import io.vertx.ext.web.FileUpload;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class AudioApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AudioApiHandler.class);

    private final AudioApi api;

    public AudioApiHandler(AudioApi api) {
        this.api = api;
    }

    @Deprecated
    public AudioApiHandler() {
        this(new AudioApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createSpeech").handler(this::createSpeech);
        builder.operation("createTranscription").handler(this::createTranscription);
        builder.operation("createTranslation").handler(this::createTranslation);
    }

    private void createSpeech(RoutingContext routingContext) {
        logger.info("createSpeech()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateSpeechRequest createSpeechRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateSpeechRequest>(){}) : null;

        logger.debug("Parameter createSpeechRequest is {}", createSpeechRequest);

        api.createSpeech(createSpeechRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createTranscription(RoutingContext routingContext) {
        logger.info("createTranscription()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter _file is {}", _file);

        api.createTranscription(_file)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createTranslation(RoutingContext routingContext) {
        logger.info("createTranslation()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter _file is {}", _file);

        api.createTranslation(_file)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
