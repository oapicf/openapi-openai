/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-14T13:54:16.789070334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "Fine-tuning", description = "Manage fine-tuning jobs to tailor a model to your specific training data.")
public interface FineTuningApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel : Immediately cancel a fine-tune job. 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "cancelFineTuningJob",
        summary = "Immediately cancel a fine-tune job. ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FineTuningJob.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
        produces = { "application/json" }
    )
    
    default ResponseEntity<FineTuningJob> cancelFineTuningJob(
        @Parameter(name = "fine_tuning_job_id", description = "The ID of the fine-tuning job to cancel. ", required = true, in = ParameterIn.PATH) @PathVariable("fine_tuning_job_id") String fineTuningJobId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"training_file\" : \"training_file\", \"result_files\" : [ \"file-abc123\", \"file-abc123\" ], \"finished_at\" : 6, \"seed\" : 5, \"fine_tuned_model\" : \"fine_tuned_model\", \"validation_file\" : \"validation_file\", \"created_at\" : 0, \"error\" : { \"code\" : \"code\", \"param\" : \"param\", \"message\" : \"message\" }, \"organization_id\" : \"organization_id\", \"hyperparameters\" : { \"n_epochs\" : \"auto\" }, \"model\" : \"model\", \"id\" : \"id\", \"trained_tokens\" : 1, \"integrations\" : [ { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" } ], \"object\" : \"fine_tuning.job\", \"status\" : \"validating_files\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /fine_tuning/jobs : Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * @param createFineTuningJobRequest  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createFineTuningJob",
        summary = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FineTuningJob.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fine_tuning/jobs",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<FineTuningJob> createFineTuningJob(
        @Parameter(name = "CreateFineTuningJobRequest", description = "", required = true) @Valid @RequestBody CreateFineTuningJobRequest createFineTuningJobRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"training_file\" : \"training_file\", \"result_files\" : [ \"file-abc123\", \"file-abc123\" ], \"finished_at\" : 6, \"seed\" : 5, \"fine_tuned_model\" : \"fine_tuned_model\", \"validation_file\" : \"validation_file\", \"created_at\" : 0, \"error\" : { \"code\" : \"code\", \"param\" : \"param\", \"message\" : \"message\" }, \"organization_id\" : \"organization_id\", \"hyperparameters\" : { \"n_epochs\" : \"auto\" }, \"model\" : \"model\", \"id\" : \"id\", \"trained_tokens\" : 1, \"integrations\" : [ { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" } ], \"object\" : \"fine_tuning.job\", \"status\" : \"validating_files\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id}/events : Get status updates for a fine-tuning job. 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "listFineTuningEvents",
        summary = "Get status updates for a fine-tuning job. ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListFineTuningJobEventsResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fine_tuning/jobs/{fine_tuning_job_id}/events",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListFineTuningJobEventsResponse> listFineTuningEvents(
        @Parameter(name = "fine_tuning_job_id", description = "The ID of the fine-tuning job to get events for. ", required = true, in = ParameterIn.PATH) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @Parameter(name = "after", description = "Identifier for the last event from the previous pagination request.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "after", required = false) String after,
        @Parameter(name = "limit", description = "Number of events to retrieve.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"level\" : \"info\", \"created_at\" : 0, \"id\" : \"id\", \"message\" : \"message\", \"object\" : \"fine_tuning.job.event\" }, { \"level\" : \"info\", \"created_at\" : 0, \"id\" : \"id\", \"message\" : \"message\", \"object\" : \"fine_tuning.job.event\" } ], \"object\" : \"list\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints : List checkpoints for a fine-tuning job. 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  (required)
     * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "listFineTuningJobCheckpoints",
        summary = "List checkpoints for a fine-tuning job. ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListFineTuningJobCheckpointsResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListFineTuningJobCheckpointsResponse> listFineTuningJobCheckpoints(
        @Parameter(name = "fine_tuning_job_id", description = "The ID of the fine-tuning job to get checkpoints for. ", required = true, in = ParameterIn.PATH) @PathVariable("fine_tuning_job_id") String fineTuningJobId,
        @Parameter(name = "after", description = "Identifier for the last checkpoint ID from the previous pagination request.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "after", required = false) String after,
        @Parameter(name = "limit", description = "Number of checkpoints to retrieve.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"first_id\" : \"first_id\", \"data\" : [ { \"step_number\" : 6, \"created_at\" : 0, \"fine_tuning_job_id\" : \"fine_tuning_job_id\", \"id\" : \"id\", \"metrics\" : { \"full_valid_mean_token_accuracy\" : 3.616076749251911, \"valid_loss\" : 2.3021358869347655, \"full_valid_loss\" : 9.301444243932576, \"train_mean_token_accuracy\" : 5.637376656633329, \"valid_mean_token_accuracy\" : 7.061401241503109, \"train_loss\" : 5.962133916683182, \"step\" : 1.4658129805029452 }, \"fine_tuned_model_checkpoint\" : \"fine_tuned_model_checkpoint\", \"object\" : \"fine_tuning.job.checkpoint\" }, { \"step_number\" : 6, \"created_at\" : 0, \"fine_tuning_job_id\" : \"fine_tuning_job_id\", \"id\" : \"id\", \"metrics\" : { \"full_valid_mean_token_accuracy\" : 3.616076749251911, \"valid_loss\" : 2.3021358869347655, \"full_valid_loss\" : 9.301444243932576, \"train_mean_token_accuracy\" : 5.637376656633329, \"valid_mean_token_accuracy\" : 7.061401241503109, \"train_loss\" : 5.962133916683182, \"step\" : 1.4658129805029452 }, \"fine_tuned_model_checkpoint\" : \"fine_tuned_model_checkpoint\", \"object\" : \"fine_tuning.job.checkpoint\" } ], \"last_id\" : \"last_id\", \"has_more\" : true, \"object\" : \"list\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fine_tuning/jobs : List your organization&#39;s fine-tuning jobs 
     *
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "listPaginatedFineTuningJobs",
        summary = "List your organization's fine-tuning jobs ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListPaginatedFineTuningJobsResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fine_tuning/jobs",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListPaginatedFineTuningJobsResponse> listPaginatedFineTuningJobs(
        @Parameter(name = "after", description = "Identifier for the last job from the previous pagination request.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "after", required = false) String after,
        @Parameter(name = "limit", description = "Number of fine-tuning jobs to retrieve.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"training_file\" : \"training_file\", \"result_files\" : [ \"file-abc123\", \"file-abc123\" ], \"finished_at\" : 6, \"seed\" : 5, \"fine_tuned_model\" : \"fine_tuned_model\", \"validation_file\" : \"validation_file\", \"created_at\" : 0, \"error\" : { \"code\" : \"code\", \"param\" : \"param\", \"message\" : \"message\" }, \"organization_id\" : \"organization_id\", \"hyperparameters\" : { \"n_epochs\" : \"auto\" }, \"model\" : \"model\", \"id\" : \"id\", \"trained_tokens\" : 1, \"integrations\" : [ { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" } ], \"object\" : \"fine_tuning.job\", \"status\" : \"validating_files\" }, { \"training_file\" : \"training_file\", \"result_files\" : [ \"file-abc123\", \"file-abc123\" ], \"finished_at\" : 6, \"seed\" : 5, \"fine_tuned_model\" : \"fine_tuned_model\", \"validation_file\" : \"validation_file\", \"created_at\" : 0, \"error\" : { \"code\" : \"code\", \"param\" : \"param\", \"message\" : \"message\" }, \"organization_id\" : \"organization_id\", \"hyperparameters\" : { \"n_epochs\" : \"auto\" }, \"model\" : \"model\", \"id\" : \"id\", \"trained_tokens\" : 1, \"integrations\" : [ { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" } ], \"object\" : \"fine_tuning.job\", \"status\" : \"validating_files\" } ], \"has_more\" : true, \"object\" : \"list\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id} : Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "retrieveFineTuningJob",
        summary = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
        tags = { "Fine-tuning" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FineTuningJob.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fine_tuning/jobs/{fine_tuning_job_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<FineTuningJob> retrieveFineTuningJob(
        @Parameter(name = "fine_tuning_job_id", description = "The ID of the fine-tuning job. ", required = true, in = ParameterIn.PATH) @PathVariable("fine_tuning_job_id") String fineTuningJobId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"training_file\" : \"training_file\", \"result_files\" : [ \"file-abc123\", \"file-abc123\" ], \"finished_at\" : 6, \"seed\" : 5, \"fine_tuned_model\" : \"fine_tuned_model\", \"validation_file\" : \"validation_file\", \"created_at\" : 0, \"error\" : { \"code\" : \"code\", \"param\" : \"param\", \"message\" : \"message\" }, \"organization_id\" : \"organization_id\", \"hyperparameters\" : { \"n_epochs\" : \"auto\" }, \"model\" : \"model\", \"id\" : \"id\", \"trained_tokens\" : 1, \"integrations\" : [ { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" }, { \"wandb\" : { \"name\" : \"name\", \"project\" : \"my-wandb-project\", \"entity\" : \"entity\", \"tags\" : [ \"custom-tag\", \"custom-tag\" ] }, \"type\" : \"wandb\" } ], \"object\" : \"fine_tuning.job\", \"status\" : \"validating_files\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}