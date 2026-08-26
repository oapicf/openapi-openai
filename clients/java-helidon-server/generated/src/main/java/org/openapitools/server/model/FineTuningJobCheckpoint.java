package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FineTuningJobCheckpointMetrics;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
public class FineTuningJobCheckpoint   {

    private String id;
    private Integer createdAt;
    private String fineTunedModelCheckpoint;
    private Integer stepNumber;
    private FineTuningJobCheckpointMetrics metrics;
    private String fineTuningJobId;

    /**
    * The object type, which is always \"fine_tuning.job.checkpoint\".
    */
    public enum ObjectEnum {
        FINE_TUNING_JOB_CHECKPOINT("fine_tuning.job.checkpoint");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;

    /**
     * Default constructor.
     */
    public FineTuningJobCheckpoint() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuningJobCheckpoint.
     *
     * @param id The checkpoint identifier, which can be referenced in the API endpoints.
     * @param createdAt The Unix timestamp (in seconds) for when the checkpoint was created.
     * @param fineTunedModelCheckpoint The name of the fine-tuned checkpoint model that is created.
     * @param stepNumber The step number that the checkpoint was created at.
     * @param metrics metrics
     * @param fineTuningJobId The name of the fine-tuning job that this checkpoint was created from.
     * @param _object The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;.
     */
    public FineTuningJobCheckpoint(
        String id, 
        Integer createdAt, 
        String fineTunedModelCheckpoint, 
        Integer stepNumber, 
        FineTuningJobCheckpointMetrics metrics, 
        String fineTuningJobId, 
        ObjectEnum _object
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
        this.stepNumber = stepNumber;
        this.metrics = metrics;
        this.fineTuningJobId = fineTuningJobId;
        this._object = _object;
    }



    /**
     * The checkpoint identifier, which can be referenced in the API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) for when the checkpoint was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The name of the fine-tuned checkpoint model that is created.
     * @return fineTunedModelCheckpoint
     */
    public String getFineTunedModelCheckpoint() {
        return fineTunedModelCheckpoint;
    }

    public void setFineTunedModelCheckpoint(String fineTunedModelCheckpoint) {
        this.fineTunedModelCheckpoint = fineTunedModelCheckpoint;
    }

    /**
     * The step number that the checkpoint was created at.
     * @return stepNumber
     */
    public Integer getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public FineTuningJobCheckpointMetrics getMetrics() {
        return metrics;
    }

    public void setMetrics(FineTuningJobCheckpointMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * The name of the fine-tuning job that this checkpoint was created from.
     * @return fineTuningJobId
     */
    public String getFineTuningJobId() {
        return fineTuningJobId;
    }

    public void setFineTuningJobId(String fineTuningJobId) {
        this.fineTuningJobId = fineTuningJobId;
    }

    /**
     * The object type, which is always \"fine_tuning.job.checkpoint\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuningJobCheckpoint {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    fineTunedModelCheckpoint: ").append(toIndentedString(fineTunedModelCheckpoint)).append("\n");
        sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    fineTuningJobId: ").append(toIndentedString(fineTuningJobId)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

