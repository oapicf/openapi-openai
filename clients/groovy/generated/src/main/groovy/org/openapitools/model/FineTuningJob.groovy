package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FineTuneMethod;
import org.openapitools.model.FineTuningJobError;
import org.openapitools.model.FineTuningJobHyperparameters;
import org.openapitools.model.FineTuningJobIntegrationsInner;

@Canonical
class FineTuningJob {
    /* The object identifier, which can be referenced in the API endpoints. */
    String id
    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    Integer createdAt
    
    FineTuningJobError error
    /* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    String fineTunedModel
    /* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    Integer finishedAt
    
    FineTuningJobHyperparameters hyperparameters
    /* The base model that is being fine-tuned. */
    String model

    enum ObjectEnum {
    
        FINE_TUNING_JOB("fine_tuning.job")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type, which is always \"fine_tuning.job\". */
    ObjectEnum _object
    /* The organization that owns the fine-tuning job. */
    String organizationId
    /* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    List<String> resultFiles = new ArrayList<>()

    enum StatusEnum {
    
        VALIDATING_FILES("validating_files"),
        
        QUEUED("queued"),
        
        RUNNING("running"),
        
        SUCCEEDED("succeeded"),
        
        FAILED("failed"),
        
        CANCELLED("cancelled")
    
        private final String value
    
        StatusEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
    StatusEnum status
    /* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    Integer trainedTokens
    /* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    String trainingFile
    /* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    String validationFile
    /* A list of integrations to enable for this fine-tuning job. */
    List<FineTuningJobIntegrationsInner> integrations
    /* The seed used for the fine-tuning job. */
    Integer seed
    /* The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. */
    Integer estimatedFinish
    
    FineTuneMethod method
}
