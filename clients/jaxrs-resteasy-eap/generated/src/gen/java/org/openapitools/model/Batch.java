package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Batch   {
  
  private String id;

  /**
   * The object type, which is always &#x60;batch&#x60;.
   */
  public enum ObjectEnum {
    BATCH("batch");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;batch&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `batch`.")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The OpenAI API endpoint used by the batch.
   **/
  
  @ApiModelProperty(required = true, value = "The OpenAI API endpoint used by the batch.")
  @JsonProperty("endpoint")
  @NotNull
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the input file for the batch.")
  @JsonProperty("input_file_id")
  @NotNull
  public String getInputFileId() {
    return inputFileId;
  }
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  /**
   * The time frame within which the batch should be processed.
   **/
  
  @ApiModelProperty(required = true, value = "The time frame within which the batch should be processed.")
  @JsonProperty("completion_window")
  @NotNull
  public String getCompletionWindow() {
    return completionWindow;
  }
  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

  /**
   * The current status of the batch.
   **/
  
  @ApiModelProperty(required = true, value = "The current status of the batch.")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the batch was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was cancelled.")
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   **/
  
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
   **/
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

