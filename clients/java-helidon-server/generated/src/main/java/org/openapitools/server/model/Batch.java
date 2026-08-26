package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BatchErrors;
import org.openapitools.server.model.BatchRequestCounts;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Batch   {

    private String id;

    /**
    * The object type, which is always `batch`.
    */
    public enum ObjectEnum {
        BATCH("batch");

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
    private String endpoint;
    private BatchErrors errors;
    private String inputFileId;
    private String completionWindow;

    /**
    * The current status of the batch.
    */
    public enum StatusEnum {
        VALIDATING("validating"),
        FAILED("failed"),
        IN_PROGRESS("in_progress"),
        FINALIZING("finalizing"),
        COMPLETED("completed"),
        EXPIRED("expired"),
        CANCELLING("cancelling"),
        CANCELLED("cancelled");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;
    private String outputFileId;
    private String errorFileId;
    private Integer createdAt;
    private Integer inProgressAt;
    private Integer expiresAt;
    private Integer finalizingAt;
    private Integer completedAt;
    private Integer failedAt;
    private Integer expiredAt;
    private Integer cancellingAt;
    private Integer cancelledAt;
    private BatchRequestCounts requestCounts;
    private Object metadata;

    /**
     * Default constructor.
     */
    public Batch() {
    // JSON-B / Jackson
    }

    /**
     * Create Batch.
     *
     * @param id id
     * @param _object The object type, which is always &#x60;batch&#x60;.
     * @param endpoint The OpenAI API endpoint used by the batch.
     * @param errors errors
     * @param inputFileId The ID of the input file for the batch.
     * @param completionWindow The time frame within which the batch should be processed.
     * @param status The current status of the batch.
     * @param outputFileId The ID of the file containing the outputs of successfully executed requests.
     * @param errorFileId The ID of the file containing the outputs of requests with errors.
     * @param createdAt The Unix timestamp (in seconds) for when the batch was created.
     * @param inProgressAt The Unix timestamp (in seconds) for when the batch started processing.
     * @param expiresAt The Unix timestamp (in seconds) for when the batch will expire.
     * @param finalizingAt The Unix timestamp (in seconds) for when the batch started finalizing.
     * @param completedAt The Unix timestamp (in seconds) for when the batch was completed.
     * @param failedAt The Unix timestamp (in seconds) for when the batch failed.
     * @param expiredAt The Unix timestamp (in seconds) for when the batch expired.
     * @param cancellingAt The Unix timestamp (in seconds) for when the batch started cancelling.
     * @param cancelledAt The Unix timestamp (in seconds) for when the batch was cancelled.
     * @param requestCounts requestCounts
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public Batch(
        String id, 
        ObjectEnum _object, 
        String endpoint, 
        BatchErrors errors, 
        String inputFileId, 
        String completionWindow, 
        StatusEnum status, 
        String outputFileId, 
        String errorFileId, 
        Integer createdAt, 
        Integer inProgressAt, 
        Integer expiresAt, 
        Integer finalizingAt, 
        Integer completedAt, 
        Integer failedAt, 
        Integer expiredAt, 
        Integer cancellingAt, 
        Integer cancelledAt, 
        BatchRequestCounts requestCounts, 
        Object metadata
    ) {
        this.id = id;
        this._object = _object;
        this.endpoint = endpoint;
        this.errors = errors;
        this.inputFileId = inputFileId;
        this.completionWindow = completionWindow;
        this.status = status;
        this.outputFileId = outputFileId;
        this.errorFileId = errorFileId;
        this.createdAt = createdAt;
        this.inProgressAt = inProgressAt;
        this.expiresAt = expiresAt;
        this.finalizingAt = finalizingAt;
        this.completedAt = completedAt;
        this.failedAt = failedAt;
        this.expiredAt = expiredAt;
        this.cancellingAt = cancellingAt;
        this.cancelledAt = cancelledAt;
        this.requestCounts = requestCounts;
        this.metadata = metadata;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `batch`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The OpenAI API endpoint used by the batch.
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Get errors
     * @return errors
     */
    public BatchErrors getErrors() {
        return errors;
    }

    public void setErrors(BatchErrors errors) {
        this.errors = errors;
    }

    /**
     * The ID of the input file for the batch.
     * @return inputFileId
     */
    public String getInputFileId() {
        return inputFileId;
    }

    public void setInputFileId(String inputFileId) {
        this.inputFileId = inputFileId;
    }

    /**
     * The time frame within which the batch should be processed.
     * @return completionWindow
     */
    public String getCompletionWindow() {
        return completionWindow;
    }

    public void setCompletionWindow(String completionWindow) {
        this.completionWindow = completionWindow;
    }

    /**
     * The current status of the batch.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * The ID of the file containing the outputs of successfully executed requests.
     * @return outputFileId
     */
    public String getOutputFileId() {
        return outputFileId;
    }

    public void setOutputFileId(String outputFileId) {
        this.outputFileId = outputFileId;
    }

    /**
     * The ID of the file containing the outputs of requests with errors.
     * @return errorFileId
     */
    public String getErrorFileId() {
        return errorFileId;
    }

    public void setErrorFileId(String errorFileId) {
        this.errorFileId = errorFileId;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch started processing.
     * @return inProgressAt
     */
    public Integer getInProgressAt() {
        return inProgressAt;
    }

    public void setInProgressAt(Integer inProgressAt) {
        this.inProgressAt = inProgressAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch will expire.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch started finalizing.
     * @return finalizingAt
     */
    public Integer getFinalizingAt() {
        return finalizingAt;
    }

    public void setFinalizingAt(Integer finalizingAt) {
        this.finalizingAt = finalizingAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch was completed.
     * @return completedAt
     */
    public Integer getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch failed.
     * @return failedAt
     */
    public Integer getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(Integer failedAt) {
        this.failedAt = failedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch expired.
     * @return expiredAt
     */
    public Integer getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Integer expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch started cancelling.
     * @return cancellingAt
     */
    public Integer getCancellingAt() {
        return cancellingAt;
    }

    public void setCancellingAt(Integer cancellingAt) {
        this.cancellingAt = cancellingAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the batch was cancelled.
     * @return cancelledAt
     */
    public Integer getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Integer cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    /**
     * Get requestCounts
     * @return requestCounts
     */
    public BatchRequestCounts getRequestCounts() {
        return requestCounts;
    }

    public void setRequestCounts(BatchRequestCounts requestCounts) {
        this.requestCounts = requestCounts;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Batch {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    inputFileId: ").append(toIndentedString(inputFileId)).append("\n");
        sb.append("    completionWindow: ").append(toIndentedString(completionWindow)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    outputFileId: ").append(toIndentedString(outputFileId)).append("\n");
        sb.append("    errorFileId: ").append(toIndentedString(errorFileId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    inProgressAt: ").append(toIndentedString(inProgressAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    finalizingAt: ").append(toIndentedString(finalizingAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
        sb.append("    cancellingAt: ").append(toIndentedString(cancellingAt)).append("\n");
        sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
        sb.append("    requestCounts: ").append(toIndentedString(requestCounts)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

