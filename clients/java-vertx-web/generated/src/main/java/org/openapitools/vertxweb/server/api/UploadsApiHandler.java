package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CompleteUploadRequest;
import org.openapitools.vertxweb.server.model.CreateUploadRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.Upload;
import org.openapitools.vertxweb.server.model.UploadPart;

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

public class UploadsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UploadsApiHandler.class);

    private final UploadsApi api;

    public UploadsApiHandler(UploadsApi api) {
        this.api = api;
    }

    @Deprecated
    public UploadsApiHandler() {
        this(new UploadsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addUploadPart").handler(this::addUploadPart);
        builder.operation("cancelUpload").handler(this::cancelUpload);
        builder.operation("completeUpload").handler(this::completeUpload);
        builder.operation("createUpload").handler(this::createUpload);
    }

    private void addUploadPart(RoutingContext routingContext) {
        logger.info("addUploadPart()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String uploadId = requestParameters.pathParameter("upload_id") != null ? requestParameters.pathParameter("upload_id").getString() : null;
        FileUpload data = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter uploadId is {}", uploadId);
        logger.debug("Parameter data is {}", data);

        api.addUploadPart(uploadId, data)
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

    private void cancelUpload(RoutingContext routingContext) {
        logger.info("cancelUpload()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String uploadId = requestParameters.pathParameter("upload_id") != null ? requestParameters.pathParameter("upload_id").getString() : null;

        logger.debug("Parameter uploadId is {}", uploadId);

        api.cancelUpload(uploadId)
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

    private void completeUpload(RoutingContext routingContext) {
        logger.info("completeUpload()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String uploadId = requestParameters.pathParameter("upload_id") != null ? requestParameters.pathParameter("upload_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CompleteUploadRequest completeUploadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CompleteUploadRequest>(){}) : null;

        logger.debug("Parameter uploadId is {}", uploadId);
        logger.debug("Parameter completeUploadRequest is {}", completeUploadRequest);

        api.completeUpload(uploadId, completeUploadRequest)
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

    private void createUpload(RoutingContext routingContext) {
        logger.info("createUpload()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateUploadRequest createUploadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateUploadRequest>(){}) : null;

        logger.debug("Parameter createUploadRequest is {}", createUploadRequest);

        api.createUpload(createUploadRequest)
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
