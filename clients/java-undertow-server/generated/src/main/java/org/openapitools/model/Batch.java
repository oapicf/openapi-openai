/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Batch   {
  
  private String id;


  public enum ObjectEnum {
    BATCH("batch");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private String endpoint;
  private BatchErrors errors;
  private String inputFileId;
  private String completionWindow;


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

    @Override
    @JsonValue
    public String toString() {
      return value;
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
   */
  public Batch id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `batch`.
   */
  public Batch _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `batch`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The OpenAI API endpoint used by the batch.
   */
  public Batch endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The OpenAI API endpoint used by the batch.")
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   */
  public Batch errors(BatchErrors errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public BatchErrors getErrors() {
    return errors;
  }
  public void setErrors(BatchErrors errors) {
    this.errors = errors;
  }

  /**
   * The ID of the input file for the batch.
   */
  public Batch inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the input file for the batch.")
  @JsonProperty("input_file_id")
  public String getInputFileId() {
    return inputFileId;
  }
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  /**
   * The time frame within which the batch should be processed.
   */
  public Batch completionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The time frame within which the batch should be processed.")
  @JsonProperty("completion_window")
  public String getCompletionWindow() {
    return completionWindow;
  }
  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

  /**
   * The current status of the batch.
   */
  public Batch status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The current status of the batch.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   */
  public Batch outputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the file containing the outputs of successfully executed requests.")
  @JsonProperty("output_file_id")
  public String getOutputFileId() {
    return outputFileId;
  }
  public void setOutputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
  }

  /**
   * The ID of the file containing the outputs of requests with errors.
   */
  public Batch errorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the file containing the outputs of requests with errors.")
  @JsonProperty("error_file_id")
  public String getErrorFileId() {
    return errorFileId;
  }
  public void setErrorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was created.
   */
  public Batch createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the batch was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   */
  public Batch inProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started processing.")
  @JsonProperty("in_progress_at")
  public Integer getInProgressAt() {
    return inProgressAt;
  }
  public void setInProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   */
  public Batch expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch will expire.")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   */
  public Batch finalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started finalizing.")
  @JsonProperty("finalizing_at")
  public Integer getFinalizingAt() {
    return finalizingAt;
  }
  public void setFinalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   */
  public Batch completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was completed.")
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch failed.
   */
  public Batch failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch failed.")
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch expired.
   */
  public Batch expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch expired.")
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   */
  public Batch cancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started cancelling.")
  @JsonProperty("cancelling_at")
  public Integer getCancellingAt() {
    return cancellingAt;
  }
  public void setCancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   */
  public Batch cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was cancelled.")
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   */
  public Batch requestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request_counts")
  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }
  public void setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  public Batch metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
    return Objects.equals(id, batch.id) &&
        Objects.equals(_object, batch._object) &&
        Objects.equals(endpoint, batch.endpoint) &&
        Objects.equals(errors, batch.errors) &&
        Objects.equals(inputFileId, batch.inputFileId) &&
        Objects.equals(completionWindow, batch.completionWindow) &&
        Objects.equals(status, batch.status) &&
        Objects.equals(outputFileId, batch.outputFileId) &&
        Objects.equals(errorFileId, batch.errorFileId) &&
        Objects.equals(createdAt, batch.createdAt) &&
        Objects.equals(inProgressAt, batch.inProgressAt) &&
        Objects.equals(expiresAt, batch.expiresAt) &&
        Objects.equals(finalizingAt, batch.finalizingAt) &&
        Objects.equals(completedAt, batch.completedAt) &&
        Objects.equals(failedAt, batch.failedAt) &&
        Objects.equals(expiredAt, batch.expiredAt) &&
        Objects.equals(cancellingAt, batch.cancellingAt) &&
        Objects.equals(cancelledAt, batch.cancelledAt) &&
        Objects.equals(requestCounts, batch.requestCounts) &&
        Objects.equals(metadata, batch.metadata);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

