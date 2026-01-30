package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Batch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Batch {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private String endpoint;

  private @Nullable BatchErrors errors;

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

    private final String value;

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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private @Nullable String outputFileId;

  private @Nullable String errorFileId;

  private Integer createdAt;

  private @Nullable Integer inProgressAt;

  private @Nullable Integer expiresAt;

  private @Nullable Integer finalizingAt;

  private @Nullable Integer completedAt;

  private @Nullable Integer failedAt;

  private @Nullable Integer expiredAt;

  private @Nullable Integer cancellingAt;

  private @Nullable Integer cancelledAt;

  private @Nullable BatchRequestCounts requestCounts;

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public Batch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Batch(String id, ObjectEnum _object, String endpoint, String inputFileId, String completionWindow, StatusEnum status, Integer createdAt) {
    this.id = id;
    this._object = _object;
    this.endpoint = endpoint;
    this.inputFileId = inputFileId;
    this.completionWindow = completionWindow;
    this.status = status;
    this.createdAt = createdAt;
  }

  public Batch id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `batch`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
   */
  @NotNull 
  @Schema(name = "endpoint", description = "The OpenAI API endpoint used by the batch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public Batch errors(@Nullable BatchErrors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public @Nullable BatchErrors getErrors() {
    return errors;
  }

  public void setErrors(@Nullable BatchErrors errors) {
    this.errors = errors;
  }

  public Batch inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

  /**
   * The ID of the input file for the batch.
   * @return inputFileId
   */
  @NotNull 
  @Schema(name = "input_file_id", description = "The ID of the input file for the batch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input_file_id")
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
   */
  @NotNull 
  @Schema(name = "completion_window", description = "The time frame within which the batch should be processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completion_window")
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
   */
  @NotNull 
  @Schema(name = "status", description = "The current status of the batch.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Batch outputFileId(@Nullable String outputFileId) {
    this.outputFileId = outputFileId;
    return this;
  }

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   * @return outputFileId
   */
  
  @Schema(name = "output_file_id", description = "The ID of the file containing the outputs of successfully executed requests.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_file_id")
  public @Nullable String getOutputFileId() {
    return outputFileId;
  }

  public void setOutputFileId(@Nullable String outputFileId) {
    this.outputFileId = outputFileId;
  }

  public Batch errorFileId(@Nullable String errorFileId) {
    this.errorFileId = errorFileId;
    return this;
  }

  /**
   * The ID of the file containing the outputs of requests with errors.
   * @return errorFileId
   */
  
  @Schema(name = "error_file_id", description = "The ID of the file containing the outputs of requests with errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_file_id")
  public @Nullable String getErrorFileId() {
    return errorFileId;
  }

  public void setErrorFileId(@Nullable String errorFileId) {
    this.errorFileId = errorFileId;
  }

  public Batch createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was created.
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the batch was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Batch inProgressAt(@Nullable Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   * @return inProgressAt
   */
  
  @Schema(name = "in_progress_at", description = "The Unix timestamp (in seconds) for when the batch started processing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_progress_at")
  public @Nullable Integer getInProgressAt() {
    return inProgressAt;
  }

  public void setInProgressAt(@Nullable Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  public Batch expiresAt(@Nullable Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   * @return expiresAt
   */
  
  @Schema(name = "expires_at", description = "The Unix timestamp (in seconds) for when the batch will expire.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public @Nullable Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(@Nullable Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Batch finalizingAt(@Nullable Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   * @return finalizingAt
   */
  
  @Schema(name = "finalizing_at", description = "The Unix timestamp (in seconds) for when the batch started finalizing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finalizing_at")
  public @Nullable Integer getFinalizingAt() {
    return finalizingAt;
  }

  public void setFinalizingAt(@Nullable Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  public Batch completedAt(@Nullable Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   * @return completedAt
   */
  
  @Schema(name = "completed_at", description = "The Unix timestamp (in seconds) for when the batch was completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_at")
  public @Nullable Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(@Nullable Integer completedAt) {
    this.completedAt = completedAt;
  }

  public Batch failedAt(@Nullable Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch failed.
   * @return failedAt
   */
  
  @Schema(name = "failed_at", description = "The Unix timestamp (in seconds) for when the batch failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failed_at")
  public @Nullable Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(@Nullable Integer failedAt) {
    this.failedAt = failedAt;
  }

  public Batch expiredAt(@Nullable Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch expired.
   * @return expiredAt
   */
  
  @Schema(name = "expired_at", description = "The Unix timestamp (in seconds) for when the batch expired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expired_at")
  public @Nullable Integer getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(@Nullable Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  public Batch cancellingAt(@Nullable Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   * @return cancellingAt
   */
  
  @Schema(name = "cancelling_at", description = "The Unix timestamp (in seconds) for when the batch started cancelling.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelling_at")
  public @Nullable Integer getCancellingAt() {
    return cancellingAt;
  }

  public void setCancellingAt(@Nullable Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  public Batch cancelledAt(@Nullable Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   * @return cancelledAt
   */
  
  @Schema(name = "cancelled_at", description = "The Unix timestamp (in seconds) for when the batch was cancelled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelled_at")
  public @Nullable Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(@Nullable Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public Batch requestCounts(@Nullable BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

  /**
   * Get requestCounts
   * @return requestCounts
   */
  @Valid 
  @Schema(name = "request_counts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request_counts")
  public @Nullable BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }

  public void setRequestCounts(@Nullable BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  public Batch metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
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
        equalsNullable(this.metadata, batch.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, endpoint, errors, inputFileId, completionWindow, status, outputFileId, errorFileId, createdAt, inProgressAt, expiresAt, finalizingAt, completedAt, failedAt, expiredAt, cancellingAt, cancelledAt, requestCounts, hashCodeNullable(metadata));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

