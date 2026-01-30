package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.vertxweb.server.model.CreateVectorStoreFileRequest;
import org.openapitools.vertxweb.server.model.CreateVectorStoreRequest;
import org.openapitools.vertxweb.server.model.DeleteVectorStoreFileResponse;
import org.openapitools.vertxweb.server.model.DeleteVectorStoreResponse;
import org.openapitools.vertxweb.server.model.ListVectorStoreFilesResponse;
import org.openapitools.vertxweb.server.model.ListVectorStoresResponse;
import org.openapitools.vertxweb.server.model.UpdateVectorStoreRequest;
import org.openapitools.vertxweb.server.model.VectorStoreFileBatchObject;
import org.openapitools.vertxweb.server.model.VectorStoreFileObject;
import org.openapitools.vertxweb.server.model.VectorStoreObject;

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

public class VectorStoresApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(VectorStoresApiHandler.class);

    private final VectorStoresApi api;

    public VectorStoresApiHandler(VectorStoresApi api) {
        this.api = api;
    }

    @Deprecated
    public VectorStoresApiHandler() {
        this(new VectorStoresApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("cancelVectorStoreFileBatch").handler(this::cancelVectorStoreFileBatch);
        builder.operation("createVectorStore").handler(this::createVectorStore);
        builder.operation("createVectorStoreFile").handler(this::createVectorStoreFile);
        builder.operation("createVectorStoreFileBatch").handler(this::createVectorStoreFileBatch);
        builder.operation("deleteVectorStore").handler(this::deleteVectorStore);
        builder.operation("deleteVectorStoreFile").handler(this::deleteVectorStoreFile);
        builder.operation("getVectorStore").handler(this::getVectorStore);
        builder.operation("getVectorStoreFile").handler(this::getVectorStoreFile);
        builder.operation("getVectorStoreFileBatch").handler(this::getVectorStoreFileBatch);
        builder.operation("listFilesInVectorStoreBatch").handler(this::listFilesInVectorStoreBatch);
        builder.operation("listVectorStoreFiles").handler(this::listVectorStoreFiles);
        builder.operation("listVectorStores").handler(this::listVectorStores);
        builder.operation("modifyVectorStore").handler(this::modifyVectorStore);
    }

    private void cancelVectorStoreFileBatch(RoutingContext routingContext) {
        logger.info("cancelVectorStoreFileBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter batchId is {}", batchId);

        api.cancelVectorStoreFileBatch(vectorStoreId, batchId)
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

    private void createVectorStore(RoutingContext routingContext) {
        logger.info("createVectorStore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateVectorStoreRequest createVectorStoreRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateVectorStoreRequest>(){}) : null;

        logger.debug("Parameter createVectorStoreRequest is {}", createVectorStoreRequest);

        api.createVectorStore(createVectorStoreRequest)
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

    private void createVectorStoreFile(RoutingContext routingContext) {
        logger.info("createVectorStoreFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateVectorStoreFileRequest createVectorStoreFileRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateVectorStoreFileRequest>(){}) : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter createVectorStoreFileRequest is {}", createVectorStoreFileRequest);

        api.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)
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

    private void createVectorStoreFileBatch(RoutingContext routingContext) {
        logger.info("createVectorStoreFileBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateVectorStoreFileBatchRequest>(){}) : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter createVectorStoreFileBatchRequest is {}", createVectorStoreFileBatchRequest);

        api.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)
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

    private void deleteVectorStore(RoutingContext routingContext) {
        logger.info("deleteVectorStore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);

        api.deleteVectorStore(vectorStoreId)
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

    private void deleteVectorStoreFile(RoutingContext routingContext) {
        logger.info("deleteVectorStoreFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        String fileId = requestParameters.pathParameter("file_id") != null ? requestParameters.pathParameter("file_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter fileId is {}", fileId);

        api.deleteVectorStoreFile(vectorStoreId, fileId)
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

    private void getVectorStore(RoutingContext routingContext) {
        logger.info("getVectorStore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);

        api.getVectorStore(vectorStoreId)
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

    private void getVectorStoreFile(RoutingContext routingContext) {
        logger.info("getVectorStoreFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        String fileId = requestParameters.pathParameter("file_id") != null ? requestParameters.pathParameter("file_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter fileId is {}", fileId);

        api.getVectorStoreFile(vectorStoreId, fileId)
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

    private void getVectorStoreFileBatch(RoutingContext routingContext) {
        logger.info("getVectorStoreFileBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter batchId is {}", batchId);

        api.getVectorStoreFileBatch(vectorStoreId, batchId)
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

    private void listFilesInVectorStoreBatch(RoutingContext routingContext) {
        logger.info("listFilesInVectorStoreBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;
        String filter = requestParameters.queryParameter("filter") != null ? requestParameters.queryParameter("filter").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter batchId is {}", batchId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);
        logger.debug("Parameter filter is {}", filter);

        api.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)
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

    private void listVectorStoreFiles(RoutingContext routingContext) {
        logger.info("listVectorStoreFiles()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;
        String filter = requestParameters.queryParameter("filter") != null ? requestParameters.queryParameter("filter").getString() : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);
        logger.debug("Parameter filter is {}", filter);

        api.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)
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

    private void listVectorStores(RoutingContext routingContext) {
        logger.info("listVectorStores()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);

        api.listVectorStores(limit, order, after, before)
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

    private void modifyVectorStore(RoutingContext routingContext) {
        logger.info("modifyVectorStore()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String vectorStoreId = requestParameters.pathParameter("vector_store_id") != null ? requestParameters.pathParameter("vector_store_id").getString() : null;
        RequestParameter body = requestParameters.body();
        UpdateVectorStoreRequest updateVectorStoreRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UpdateVectorStoreRequest>(){}) : null;

        logger.debug("Parameter vectorStoreId is {}", vectorStoreId);
        logger.debug("Parameter updateVectorStoreRequest is {}", updateVectorStoreRequest);

        api.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)
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
