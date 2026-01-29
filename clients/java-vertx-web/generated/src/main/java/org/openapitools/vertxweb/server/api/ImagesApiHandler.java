package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateImageEditRequestModel;
import org.openapitools.vertxweb.server.model.CreateImageRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ImagesResponse;

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

public class ImagesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ImagesApiHandler.class);

    private final ImagesApi api;

    public ImagesApiHandler(ImagesApi api) {
        this.api = api;
    }

    @Deprecated
    public ImagesApiHandler() {
        this(new ImagesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createImage").handler(this::createImage);
        builder.operation("createImageEdit").handler(this::createImageEdit);
        builder.operation("createImageVariation").handler(this::createImageVariation);
    }

    private void createImage(RoutingContext routingContext) {
        logger.info("createImage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateImageRequest createImageRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateImageRequest>(){}) : null;

        logger.debug("Parameter createImageRequest is {}", createImageRequest);

        api.createImage(createImageRequest)
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

    private void createImageEdit(RoutingContext routingContext) {
        logger.info("createImageEdit()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload image = routingContext.fileUploads().iterator().next();
        FileUpload mask = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter image is {}", image);
        logger.debug("Parameter mask is {}", mask);

        api.createImageEdit(image, mask)
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

    private void createImageVariation(RoutingContext routingContext) {
        logger.info("createImageVariation()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload image = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter image is {}", image);

        api.createImageVariation(image)
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
