package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateFineTuningJobRequest;
import org.openapitools.server.api.model.FineTuningJob;
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse;
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class FineTuningApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(FineTuningApiVerticle.class);

    static final String CANCELFINETUNINGJOB_SERVICE_ID = "cancelFineTuningJob";
    static final String CREATEFINETUNINGJOB_SERVICE_ID = "createFineTuningJob";
    static final String LISTFINETUNINGEVENTS_SERVICE_ID = "listFineTuningEvents";
    static final String LISTFINETUNINGJOBCHECKPOINTS_SERVICE_ID = "listFineTuningJobCheckpoints";
    static final String LISTPAGINATEDFINETUNINGJOBS_SERVICE_ID = "listPaginatedFineTuningJobs";
    static final String RETRIEVEFINETUNINGJOB_SERVICE_ID = "retrieveFineTuningJob";
    
    final FineTuningApi service;

    public FineTuningApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FineTuningApiImpl");
            service = (FineTuningApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FineTuningApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for cancelFineTuningJob
        vertx.eventBus().<JsonObject> consumer(CANCELFINETUNINGJOB_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelFineTuningJob";
                String fineTuningJobIdParam = message.body().getString("fine_tuning_job_id");
                if(fineTuningJobIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tuning_job_id is required"), serviceId);
                    return;
                }
                String fineTuningJobId = fineTuningJobIdParam;
                service.cancelFineTuningJob(fineTuningJobId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelFineTuningJob");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelFineTuningJob", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createFineTuningJob
        vertx.eventBus().<JsonObject> consumer(CREATEFINETUNINGJOB_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createFineTuningJob";
                JsonObject createFineTuningJobRequestParam = message.body().getJsonObject("CreateFineTuningJobRequest");
                if (createFineTuningJobRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateFineTuningJobRequest is required"), serviceId);
                    return;
                }
                CreateFineTuningJobRequest createFineTuningJobRequest = Json.mapper.readValue(createFineTuningJobRequestParam.encode(), CreateFineTuningJobRequest.class);
                service.createFineTuningJob(createFineTuningJobRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createFineTuningJob");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createFineTuningJob", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listFineTuningEvents
        vertx.eventBus().<JsonObject> consumer(LISTFINETUNINGEVENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listFineTuningEvents";
                String fineTuningJobIdParam = message.body().getString("fine_tuning_job_id");
                if(fineTuningJobIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tuning_job_id is required"), serviceId);
                    return;
                }
                String fineTuningJobId = fineTuningJobIdParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                service.listFineTuningEvents(fineTuningJobId, after, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listFineTuningEvents");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listFineTuningEvents", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listFineTuningJobCheckpoints
        vertx.eventBus().<JsonObject> consumer(LISTFINETUNINGJOBCHECKPOINTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listFineTuningJobCheckpoints";
                String fineTuningJobIdParam = message.body().getString("fine_tuning_job_id");
                if(fineTuningJobIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tuning_job_id is required"), serviceId);
                    return;
                }
                String fineTuningJobId = fineTuningJobIdParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 10 : Json.mapper.readValue(limitParam, Integer.class);
                service.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listFineTuningJobCheckpoints");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listFineTuningJobCheckpoints", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listPaginatedFineTuningJobs
        vertx.eventBus().<JsonObject> consumer(LISTPAGINATEDFINETUNINGJOBS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listPaginatedFineTuningJobs";
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                service.listPaginatedFineTuningJobs(after, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listPaginatedFineTuningJobs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listPaginatedFineTuningJobs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for retrieveFineTuningJob
        vertx.eventBus().<JsonObject> consumer(RETRIEVEFINETUNINGJOB_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "retrieveFineTuningJob";
                String fineTuningJobIdParam = message.body().getString("fine_tuning_job_id");
                if(fineTuningJobIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tuning_job_id is required"), serviceId);
                    return;
                }
                String fineTuningJobId = fineTuningJobIdParam;
                service.retrieveFineTuningJob(fineTuningJobId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "retrieveFineTuningJob");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("retrieveFineTuningJob", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
