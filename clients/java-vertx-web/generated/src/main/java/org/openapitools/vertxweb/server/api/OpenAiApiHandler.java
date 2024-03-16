package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponse;
import org.openapitools.vertxweb.server.model.CreateCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateCompletionResponse;
import org.openapitools.vertxweb.server.model.CreateEditRequest;
import org.openapitools.vertxweb.server.model.CreateEditResponse;
import org.openapitools.vertxweb.server.model.CreateEmbeddingRequest;
import org.openapitools.vertxweb.server.model.CreateEmbeddingResponse;
import org.openapitools.vertxweb.server.model.CreateFineTuneRequest;
import org.openapitools.vertxweb.server.model.CreateImageRequest;
import org.openapitools.vertxweb.server.model.CreateModerationRequest;
import org.openapitools.vertxweb.server.model.CreateModerationResponse;
import org.openapitools.vertxweb.server.model.CreateTranscriptionRequestModel;
import org.openapitools.vertxweb.server.model.CreateTranscriptionResponse;
import org.openapitools.vertxweb.server.model.CreateTranslationResponse;
import org.openapitools.vertxweb.server.model.DeleteFileResponse;
import org.openapitools.vertxweb.server.model.DeleteModelResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.FineTune;
import org.openapitools.vertxweb.server.model.ImagesResponse;
import org.openapitools.vertxweb.server.model.ListFilesResponse;
import org.openapitools.vertxweb.server.model.ListFineTuneEventsResponse;
import org.openapitools.vertxweb.server.model.ListFineTunesResponse;
import org.openapitools.vertxweb.server.model.ListModelsResponse;
import org.openapitools.vertxweb.server.model.Model;
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

public class OpenAiApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(OpenAiApiHandler.class);

    private final OpenAiApi api;

    public OpenAiApiHandler(OpenAiApi api) {
        this.api = api;
    }

    @Deprecated
    public OpenAiApiHandler() {
        this(new OpenAiApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("cancelFineTune").handler(this::cancelFineTune);
        builder.operation("createChatCompletion").handler(this::createChatCompletion);
        builder.operation("createCompletion").handler(this::createCompletion);
        builder.operation("createEdit").handler(this::createEdit);
        builder.operation("createEmbedding").handler(this::createEmbedding);
        builder.operation("createFile").handler(this::createFile);
        builder.operation("createFineTune").handler(this::createFineTune);
        builder.operation("createImage").handler(this::createImage);
        builder.operation("createImageEdit").handler(this::createImageEdit);
        builder.operation("createImageVariation").handler(this::createImageVariation);
        builder.operation("createModeration").handler(this::createModeration);
        builder.operation("createTranscription").handler(this::createTranscription);
        builder.operation("createTranslation").handler(this::createTranslation);
        builder.operation("deleteFile").handler(this::deleteFile);
        builder.operation("deleteModel").handler(this::deleteModel);
        builder.operation("downloadFile").handler(this::downloadFile);
        builder.operation("listFiles").handler(this::listFiles);
        builder.operation("listFineTuneEvents").handler(this::listFineTuneEvents);
        builder.operation("listFineTunes").handler(this::listFineTunes);
        builder.operation("listModels").handler(this::listModels);
        builder.operation("retrieveFile").handler(this::retrieveFile);
        builder.operation("retrieveFineTune").handler(this::retrieveFineTune);
        builder.operation("retrieveModel").handler(this::retrieveModel);
    }

    private void cancelFineTune(RoutingContext routingContext) {
        logger.info("cancelFineTune()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuneId = requestParameters.pathParameter("fine_tune_id") != null ? requestParameters.pathParameter("fine_tune_id").getString() : null;

        logger.debug("Parameter fineTuneId is {}", fineTuneId);

        api.cancelFineTune(fineTuneId)
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

    private void createChatCompletion(RoutingContext routingContext) {
        logger.info("createChatCompletion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateChatCompletionRequest createChatCompletionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateChatCompletionRequest>(){}) : null;

        logger.debug("Parameter createChatCompletionRequest is {}", createChatCompletionRequest);

        api.createChatCompletion(createChatCompletionRequest)
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

    private void createCompletion(RoutingContext routingContext) {
        logger.info("createCompletion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateCompletionRequest createCompletionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateCompletionRequest>(){}) : null;

        logger.debug("Parameter createCompletionRequest is {}", createCompletionRequest);

        api.createCompletion(createCompletionRequest)
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

    private void createEdit(RoutingContext routingContext) {
        logger.info("createEdit()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateEditRequest createEditRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateEditRequest>(){}) : null;

        logger.debug("Parameter createEditRequest is {}", createEditRequest);

        api.createEdit(createEditRequest)
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

    private void createEmbedding(RoutingContext routingContext) {
        logger.info("createEmbedding()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateEmbeddingRequest createEmbeddingRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateEmbeddingRequest>(){}) : null;

        logger.debug("Parameter createEmbeddingRequest is {}", createEmbeddingRequest);

        api.createEmbedding(createEmbeddingRequest)
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

    private void createFineTune(RoutingContext routingContext) {
        logger.info("createFineTune()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateFineTuneRequest createFineTuneRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateFineTuneRequest>(){}) : null;

        logger.debug("Parameter createFineTuneRequest is {}", createFineTuneRequest);

        api.createFineTune(createFineTuneRequest)
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

    private void createModeration(RoutingContext routingContext) {
        logger.info("createModeration()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateModerationRequest createModerationRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateModerationRequest>(){}) : null;

        logger.debug("Parameter createModerationRequest is {}", createModerationRequest);

        api.createModeration(createModerationRequest)
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

    private void deleteModel(RoutingContext routingContext) {
        logger.info("deleteModel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String model = requestParameters.pathParameter("model") != null ? requestParameters.pathParameter("model").getString() : null;

        logger.debug("Parameter model is {}", model);

        api.deleteModel(model)
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



        api.listFiles()
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

    private void listFineTuneEvents(RoutingContext routingContext) {
        logger.info("listFineTuneEvents()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuneId = requestParameters.pathParameter("fine_tune_id") != null ? requestParameters.pathParameter("fine_tune_id").getString() : null;
        Boolean stream = requestParameters.queryParameter("stream") != null ? requestParameters.queryParameter("stream").getBoolean() : false;

        logger.debug("Parameter fineTuneId is {}", fineTuneId);
        logger.debug("Parameter stream is {}", stream);

        api.listFineTuneEvents(fineTuneId, stream)
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

    private void listFineTunes(RoutingContext routingContext) {
        logger.info("listFineTunes()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.listFineTunes()
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

    private void listModels(RoutingContext routingContext) {
        logger.info("listModels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.listModels()
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

    private void retrieveFineTune(RoutingContext routingContext) {
        logger.info("retrieveFineTune()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuneId = requestParameters.pathParameter("fine_tune_id") != null ? requestParameters.pathParameter("fine_tune_id").getString() : null;

        logger.debug("Parameter fineTuneId is {}", fineTuneId);

        api.retrieveFineTune(fineTuneId)
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

    private void retrieveModel(RoutingContext routingContext) {
        logger.info("retrieveModel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String model = requestParameters.pathParameter("model") != null ? requestParameters.pathParameter("model").getString() : null;

        logger.debug("Parameter model is {}", model);

        api.retrieveModel(model)
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
