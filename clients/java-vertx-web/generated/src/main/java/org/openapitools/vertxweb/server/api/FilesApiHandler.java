package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteFileResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ListFilesResponse;
import org.openapitools.vertxweb.server.model.OpenAIFile;

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

public class FilesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(FilesApiHandler.class);

    private final FilesApi api;

    public FilesApiHandler(FilesApi api) {
        this.api = api;
    }

    @Deprecated
    public FilesApiHandler() {
        this(new FilesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createFile").handler(this::createFile);
        builder.operation("deleteFile").handler(this::deleteFile);
        builder.operation("downloadFile").handler(this::downloadFile);
        builder.operation("listFiles").handler(this::listFiles);
        builder.operation("retrieveFile").handler(this::retrieveFile);
    }

    private void createFile(RoutingContext routingContext) {
        logger.info("createFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload _file = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter _file is {}", _file);

        api.createFile(_file)
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

    private void deleteFile(RoutingContext routingContext) {
        logger.info("deleteFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fileId = requestParameters.pathParameter("file_id") != null ? requestParameters.pathParameter("file_id").getString() : null;

        logger.debug("Parameter fileId is {}", fileId);

        api.deleteFile(fileId)
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

    private void downloadFile(RoutingContext routingContext) {
        logger.info("downloadFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fileId = requestParameters.pathParameter("file_id") != null ? requestParameters.pathParameter("file_id").getString() : null;

        logger.debug("Parameter fileId is {}", fileId);

        api.downloadFile(fileId)
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

    private void listFiles(RoutingContext routingContext) {
        logger.info("listFiles()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String purpose = requestParameters.queryParameter("purpose") != null ? requestParameters.queryParameter("purpose").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 10000;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter purpose is {}", purpose);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);

        api.listFiles(purpose, limit, order, after)
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

    private void retrieveFile(RoutingContext routingContext) {
        logger.info("retrieveFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fileId = requestParameters.pathParameter("file_id") != null ? requestParameters.pathParameter("file_id").getString() : null;

        logger.debug("Parameter fileId is {}", fileId);

        api.retrieveFile(fileId)
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
