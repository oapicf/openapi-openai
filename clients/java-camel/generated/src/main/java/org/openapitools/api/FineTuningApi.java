/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class FineTuningApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel : Immediately cancel a fine-tune job. 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/fine_tuning/jobs/{fine_tuning_job_id}/cancel")
                .description("Immediately cancel a fine-tune job. ")
                .id("cancelFineTuningJobApi")
                .produces("application/json")
                .outType(FineTuningJob.class)
                .param()
                    .name("fineTuningJobId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("The ID of the fine-tuning job to cancel. ")
                .endParam()
                .to("direct:cancelFineTuningJob");
        

        /**
        POST /fine_tuning/jobs : Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .post("/fine_tuning/jobs")
                .description("Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ")
                .id("createFineTuningJobApi")
                .produces("application/json")
                .outType(FineTuningJob.class)
                .consumes("application/json")
                .type(CreateFineTuningJobRequest.class)
                
                .param()
                    .name("createFineTuningJobRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:createFineTuningJob");
        

        /**
        GET /fine_tuning/jobs/{fine_tuning_job_id}/events : Get status updates for a fine-tuning job. 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .get("/fine_tuning/jobs/{fine_tuning_job_id}/events")
                .description("Get status updates for a fine-tuning job. ")
                .id("listFineTuningEventsApi")
                .produces("application/json")
                .outType(ListFineTuningJobEventsResponse.class)
                .param()
                    .name("fineTuningJobId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("The ID of the fine-tuning job to get events for. ")
                .endParam()
                .param()
                    .name("after")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Identifier for the last event from the previous pagination request.")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of events to retrieve.")
                .endParam()
                .to("direct:listFineTuningEvents");
        

        /**
        GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints : List checkpoints for a fine-tuning job. 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .get("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints")
                .description("List checkpoints for a fine-tuning job. ")
                .id("listFineTuningJobCheckpointsApi")
                .produces("application/json")
                .outType(ListFineTuningJobCheckpointsResponse.class)
                .param()
                    .name("fineTuningJobId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("The ID of the fine-tuning job to get checkpoints for. ")
                .endParam()
                .param()
                    .name("after")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Identifier for the last checkpoint ID from the previous pagination request.")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of checkpoints to retrieve.")
                .endParam()
                .to("direct:listFineTuningJobCheckpoints");
        

        /**
        GET /fine_tuning/jobs : List your organization&#39;s fine-tuning jobs 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .get("/fine_tuning/jobs")
                .description("List your organization's fine-tuning jobs ")
                .id("listPaginatedFineTuningJobsApi")
                .produces("application/json")
                .outType(ListPaginatedFineTuningJobsResponse.class)
                .param()
                    .name("after")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Identifier for the last job from the previous pagination request.")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of fine-tuning jobs to retrieve.")
                .endParam()
                .to("direct:listPaginatedFineTuningJobs");
        

        /**
        GET /fine_tuning/jobs/{fine_tuning_job_id} : Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
        **/
        rest()
            .securityDefinitions()
                .bearerToken("ApiKeyAuth").end()
            .get("/fine_tuning/jobs/{fine_tuning_job_id}")
                .description("Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ")
                .id("retrieveFineTuningJobApi")
                .produces("application/json")
                .outType(FineTuningJob.class)
                .param()
                    .name("fineTuningJobId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("The ID of the fine-tuning job. ")
                .endParam()
                .to("direct:retrieveFineTuningJob");
        
    }
}
