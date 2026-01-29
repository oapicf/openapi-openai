package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuningJobCheckpointMetrics;

@Canonical
class FineTuningJobCheckpoint {
    /* The checkpoint identifier, which can be referenced in the API endpoints. */
    String id
    /* The Unix timestamp (in seconds) for when the checkpoint was created. */
    Integer createdAt
    /* The name of the fine-tuned checkpoint model that is created. */
    String fineTunedModelCheckpoint
    /* The step number that the checkpoint was created at. */
    Integer stepNumber
    
    FineTuningJobCheckpointMetrics metrics
    /* The name of the fine-tuning job that this checkpoint was created from. */
    String fineTuningJobId

    enum ObjectEnum {
    
        FINE_TUNING_JOB_CHECKPOINT("fine_tuning.job.checkpoint")
    
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

    /* The object type, which is always \"fine_tuning.job.checkpoint\". */
    ObjectEnum _object
}
