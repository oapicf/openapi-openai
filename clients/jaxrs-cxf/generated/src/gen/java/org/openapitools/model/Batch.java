package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Batch  {
  
  @ApiModelProperty(required = true, value = "")

  private String id;

public enum ObjectEnum {

BATCH(String.valueOf("batch"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always `batch`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `batch`.")

  private ObjectEnum _object;

 /**
  * The OpenAI API endpoint used by the batch.
  */
  @ApiModelProperty(required = true, value = "The OpenAI API endpoint used by the batch.")

  private String endpoint;

  @ApiModelProperty(value = "")

  @Valid

  private BatchErrors errors;

 /**
  * The ID of the input file for the batch.
  */
  @ApiModelProperty(required = true, value = "The ID of the input file for the batch.")

  private String inputFileId;

 /**
  * The time frame within which the batch should be processed.
  */
  @ApiModelProperty(required = true, value = "The time frame within which the batch should be processed.")

  private String completionWindow;

public enum StatusEnum {

VALIDATING(String.valueOf("validating")), FAILED(String.valueOf("failed")), IN_PROGRESS(String.valueOf("in_progress")), FINALIZING(String.valueOf("finalizing")), COMPLETED(String.valueOf("completed")), EXPIRED(String.valueOf("expired")), CANCELLING(String.valueOf("cancelling")), CANCELLED(String.valueOf("cancelled"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The current status of the batch.
  */
  @ApiModelProperty(required = true, value = "The current status of the batch.")

  private StatusEnum status;

 /**
  * The ID of the file containing the outputs of successfully executed requests.
  */
  @ApiModelProperty(value = "The ID of the file containing the outputs of successfully executed requests.")

  private String outputFileId;

 /**
  * The ID of the file containing the outputs of requests with errors.
  */
  @ApiModelProperty(value = "The ID of the file containing the outputs of requests with errors.")

  private String errorFileId;

 /**
  * The Unix timestamp (in seconds) for when the batch was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the batch was created.")

  private Integer createdAt;

 /**
  * The Unix timestamp (in seconds) for when the batch started processing.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started processing.")

  private Integer inProgressAt;

 /**
  * The Unix timestamp (in seconds) for when the batch will expire.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch will expire.")

  private Integer expiresAt;

 /**
  * The Unix timestamp (in seconds) for when the batch started finalizing.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started finalizing.")

  private Integer finalizingAt;

 /**
  * The Unix timestamp (in seconds) for when the batch was completed.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was completed.")

  private Integer completedAt;

 /**
  * The Unix timestamp (in seconds) for when the batch failed.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch failed.")

  private Integer failedAt;

 /**
  * The Unix timestamp (in seconds) for when the batch expired.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch expired.")

  private Integer expiredAt;

 /**
  * The Unix timestamp (in seconds) for when the batch started cancelling.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started cancelling.")

  private Integer cancellingAt;

 /**
  * The Unix timestamp (in seconds) for when the batch was cancelled.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was cancelled.")

  private Integer cancelledAt;

  @ApiModelProperty(value = "")

  @Valid

  private BatchRequestCounts requestCounts;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Batch id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;batch&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Batch _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The OpenAI API endpoint used by the batch.
   * @return endpoint
  **/
  @JsonProperty("endpoint")
  @NotNull
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Batch endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

 /**
   * Get errors
   * @return errors
  **/
  @JsonProperty("errors")
  public BatchErrors getErrors() {
    return errors;
  }

  public void setErrors(BatchErrors errors) {
    this.errors = errors;
  }

  public Batch errors(BatchErrors errors) {
    this.errors = errors;
    return this;
  }

 /**
   * The ID of the input file for the batch.
   * @return inputFileId
  **/
  @JsonProperty("input_file_id")
  @NotNull
  public String getInputFileId() {
    return inputFileId;
  }

  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  public Batch inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

 /**
   * The time frame within which the batch should be processed.
   * @return completionWindow
  **/
  @JsonProperty("completion_window")
  @NotNull
  public String getCompletionWindow() {
    return completionWindow;
  }

  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

  public Batch completionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

 /**
   * The current status of the batch.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Batch status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The ID of the file containing the outputs of successfully executed requests.
   * @return outputFileId
  **/
  @JsonProperty("output_file_id")
  public String getOutputFileId() {
    return outputFileId;
  }

  public void setOutputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
  }

  public Batch outputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
    return this;
  }

 /**
   * The ID of the file containing the outputs of requests with errors.
   * @return errorFileId
  **/
  @JsonProperty("error_file_id")
  public String getErrorFileId() {
    return errorFileId;
  }

  public void setErrorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
  }

  public Batch errorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Batch createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   * @return inProgressAt
  **/
  @JsonProperty("in_progress_at")
  public Integer getInProgressAt() {
    return inProgressAt;
  }

  public void setInProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  public Batch inProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   * @return expiresAt
  **/
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Batch expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   * @return finalizingAt
  **/
  @JsonProperty("finalizing_at")
  public Integer getFinalizingAt() {
    return finalizingAt;
  }

  public void setFinalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  public Batch finalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   * @return completedAt
  **/
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public Batch completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch failed.
   * @return failedAt
  **/
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public Batch failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch expired.
   * @return expiredAt
  **/
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  public Batch expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   * @return cancellingAt
  **/
  @JsonProperty("cancelling_at")
  public Integer getCancellingAt() {
    return cancellingAt;
  }

  public void setCancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  public Batch cancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   * @return cancelledAt
  **/
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public Batch cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

 /**
   * Get requestCounts
   * @return requestCounts
  **/
  @JsonProperty("request_counts")
  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }

  public void setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  public Batch requestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Batch metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.id, batch.id) &&
        Objects.equals(this._object, batch._object) &&
        Objects.equals(this.endpoint, batch.endpoint) &&
        Objects.equals(this.errors, batch.errors) &&
        Objects.equals(this.inputFileId, batch.inputFileId) &&
        Objects.equals(this.completionWindow, batch.completionWindow) &&
        Objects.equals(this.status, batch.status) &&
        Objects.equals(this.outputFileId, batch.outputFileId) &&
        Objects.equals(this.errorFileId, batch.errorFileId) &&
        Objects.equals(this.createdAt, batch.createdAt) &&
        Objects.equals(this.inProgressAt, batch.inProgressAt) &&
        Objects.equals(this.expiresAt, batch.expiresAt) &&
        Objects.equals(this.finalizingAt, batch.finalizingAt) &&
        Objects.equals(this.completedAt, batch.completedAt) &&
        Objects.equals(this.failedAt, batch.failedAt) &&
        Objects.equals(this.expiredAt, batch.expiredAt) &&
        Objects.equals(this.cancellingAt, batch.cancellingAt) &&
        Objects.equals(this.cancelledAt, batch.cancelledAt) &&
        Objects.equals(this.requestCounts, batch.requestCounts) &&
        Objects.equals(this.metadata, batch.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, endpoint, errors, inputFileId, completionWindow, status, outputFileId, errorFileId, createdAt, inProgressAt, expiresAt, finalizingAt, completedAt, failedAt, expiredAt, cancellingAt, cancelledAt, requestCounts, metadata);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

