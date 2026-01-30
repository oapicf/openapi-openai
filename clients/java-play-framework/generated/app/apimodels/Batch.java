package apimodels;

import apimodels.BatchErrors;
import apimodels.BatchRequestCounts;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Batch   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The object type, which is always `batch`.
   */
  public enum ObjectEnum {
    BATCH("batch");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("endpoint")
  @NotNull

  private String endpoint;

  @JsonProperty("errors")
  @Valid

  private BatchErrors errors;

  @JsonProperty("input_file_id")
  @NotNull

  private String inputFileId;

  @JsonProperty("completion_window")
  @NotNull

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

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("status")
  @NotNull

  private StatusEnum status;

  @JsonProperty("output_file_id")
  
  private String outputFileId;

  @JsonProperty("error_file_id")
  
  private String errorFileId;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("in_progress_at")
  
  private Integer inProgressAt;

  @JsonProperty("expires_at")
  
  private Integer expiresAt;

  @JsonProperty("finalizing_at")
  
  private Integer finalizingAt;

  @JsonProperty("completed_at")
  
  private Integer completedAt;

  @JsonProperty("failed_at")
  
  private Integer failedAt;

  @JsonProperty("expired_at")
  
  private Integer expiredAt;

  @JsonProperty("cancelling_at")
  
  private Integer cancellingAt;

  @JsonProperty("cancelled_at")
  
  private Integer cancelledAt;

  @JsonProperty("request_counts")
  @Valid

  private BatchRequestCounts requestCounts;

  @JsonProperty("metadata")
  
  private Object metadata;

  public Batch id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Batch _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `batch`.
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Batch endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The OpenAI API endpoint used by the batch.
   * @return endpoint
  **/
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Batch errors(BatchErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  public BatchErrors getErrors() {
    return errors;
  }

  public void setErrors(BatchErrors errors) {
    this.errors = errors;
  }

  public Batch inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

   /**
   * The ID of the input file for the batch.
   * @return inputFileId
  **/
  public String getInputFileId() {
    return inputFileId;
  }

  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  public Batch completionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

   /**
   * The time frame within which the batch should be processed.
   * @return completionWindow
  **/
  public String getCompletionWindow() {
    return completionWindow;
  }

  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

  public Batch status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the batch.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Batch outputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
    return this;
  }

   /**
   * The ID of the file containing the outputs of successfully executed requests.
   * @return outputFileId
  **/
  public String getOutputFileId() {
    return outputFileId;
  }

  public void setOutputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
  }

  public Batch errorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
    return this;
  }

   /**
   * The ID of the file containing the outputs of requests with errors.
   * @return errorFileId
  **/
  public String getErrorFileId() {
    return errorFileId;
  }

  public void setErrorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
  }

  public Batch createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Batch inProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   * @return inProgressAt
  **/
  public Integer getInProgressAt() {
    return inProgressAt;
  }

  public void setInProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  public Batch expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   * @return expiresAt
  **/
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Batch finalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   * @return finalizingAt
  **/
  public Integer getFinalizingAt() {
    return finalizingAt;
  }

  public void setFinalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  public Batch completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   * @return completedAt
  **/
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public Batch failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch failed.
   * @return failedAt
  **/
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public Batch expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch expired.
   * @return expiredAt
  **/
  public Integer getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  public Batch cancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   * @return cancellingAt
  **/
  public Integer getCancellingAt() {
    return cancellingAt;
  }

  public void setCancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  public Batch cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   * @return cancelledAt
  **/
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public Batch requestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

   /**
   * Get requestCounts
   * @return requestCounts
  **/
  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }

  public void setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  public Batch metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

