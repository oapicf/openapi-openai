package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BatchErrors;
import org.openapitools.vertxweb.server.model.BatchRequestCounts;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public Batch () {

  }

  public Batch (String id, ObjectEnum _object, String endpoint, BatchErrors errors, String inputFileId, String completionWindow, StatusEnum status, String outputFileId, String errorFileId, Integer createdAt, Integer inProgressAt, Integer expiresAt, Integer finalizingAt, Integer completedAt, Integer failedAt, Integer expiredAt, Integer cancellingAt, Integer cancelledAt, BatchRequestCounts requestCounts, Object metadata) {
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

    
  @JsonProperty("errors")
  public BatchErrors getErrors() {
    return errors;
  }
  public void setErrors(BatchErrors errors) {
    this.errors = errors;
  }

    
  @JsonProperty("input_file_id")
  public String getInputFileId() {
    return inputFileId;
  }
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

    
  @JsonProperty("completion_window")
  public String getCompletionWindow() {
    return completionWindow;
  }
  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("output_file_id")
  public String getOutputFileId() {
    return outputFileId;
  }
  public void setOutputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
  }

    
  @JsonProperty("error_file_id")
  public String getErrorFileId() {
    return errorFileId;
  }
  public void setErrorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("in_progress_at")
  public Integer getInProgressAt() {
    return inProgressAt;
  }
  public void setInProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("finalizing_at")
  public Integer getFinalizingAt() {
    return finalizingAt;
  }
  public void setFinalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

    
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

    
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

    
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

    
  @JsonProperty("cancelling_at")
  public Integer getCancellingAt() {
    return cancellingAt;
  }
  public void setCancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

    
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

    
  @JsonProperty("request_counts")
  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }
  public void setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

    
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
