package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Batch implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;batch&#x60;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The OpenAI API endpoint used by the batch.
   */
  @JsonProperty("endpoint")
  private String endpoint;

  @JsonProperty("errors")
  private BatchErrors errors;

  /**
   * The ID of the input file for the batch.
   */
  @JsonProperty("input_file_id")
  private String inputFileId;

  /**
   * The time frame within which the batch should be processed.
   */
  @JsonProperty("completion_window")
  private String completionWindow;

  /**
   * The current status of the batch.
   */
  @JsonProperty("status")
  private String status;

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   */
  @JsonProperty("output_file_id")
  private String outputFileId;

  /**
   * The ID of the file containing the outputs of requests with errors.
   */
  @JsonProperty("error_file_id")
  private String errorFileId;

  /**
   * The Unix timestamp (in seconds) for when the batch was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   */
  @JsonProperty("in_progress_at")
  private Integer inProgressAt;

  /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   */
  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   */
  @JsonProperty("finalizing_at")
  private Integer finalizingAt;

  /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   */
  @JsonProperty("completed_at")
  private Integer completedAt;

  /**
   * The Unix timestamp (in seconds) for when the batch failed.
   */
  @JsonProperty("failed_at")
  private Integer failedAt;

  /**
   * The Unix timestamp (in seconds) for when the batch expired.
   */
  @JsonProperty("expired_at")
  private Integer expiredAt;

  /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   */
  @JsonProperty("cancelling_at")
  private Integer cancellingAt;

  /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   */
  @JsonProperty("cancelled_at")
  private Integer cancelledAt;

  @JsonProperty("request_counts")
  private BatchRequestCounts requestCounts;

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  @JsonProperty("metadata")
  private Object metadata;

  /**
   * 
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;batch&#x60;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
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
   * 
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
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
   * 
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
