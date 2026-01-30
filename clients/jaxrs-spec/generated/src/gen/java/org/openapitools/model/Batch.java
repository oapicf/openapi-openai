package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Batch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Batch   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private BatchErrors errors;
  private String inputFileId;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  public Batch() {
  }

  @JsonCreator
  public Batch(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "endpoint") String endpoint,
    @JsonProperty(required = true, value = "input_file_id") String inputFileId,
    @JsonProperty(required = true, value = "completion_window") String completionWindow,
    @JsonProperty(required = true, value = "status") StatusEnum status,
    @JsonProperty(required = true, value = "created_at") Integer createdAt
  ) {
    this.id = id;
    this._object = _object;
    this.endpoint = endpoint;
    this.inputFileId = inputFileId;
    this.completionWindow = completionWindow;
    this.status = status;
    this.createdAt = createdAt;
  }

  /**
   **/
  public Batch id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;batch&#x60;.
   **/
  public Batch _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `batch`.")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The OpenAI API endpoint used by the batch.
   **/
  public Batch endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The OpenAI API endpoint used by the batch.")
  @JsonProperty(required = true, value = "endpoint")
  @NotNull public String getEndpoint() {
    return endpoint;
  }

  @JsonProperty(required = true, value = "endpoint")
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  public Batch errors(BatchErrors errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  @Valid public BatchErrors getErrors() {
    return errors;
  }

  @JsonProperty("errors")
  public void setErrors(BatchErrors errors) {
    this.errors = errors;
  }

  /**
   * The ID of the input file for the batch.
   **/
  public Batch inputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the input file for the batch.")
  @JsonProperty(required = true, value = "input_file_id")
  @NotNull public String getInputFileId() {
    return inputFileId;
  }

  @JsonProperty(required = true, value = "input_file_id")
  public void setInputFileId(String inputFileId) {
    this.inputFileId = inputFileId;
  }

  /**
   * The time frame within which the batch should be processed.
   **/
  public Batch completionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The time frame within which the batch should be processed.")
  @JsonProperty(required = true, value = "completion_window")
  @NotNull public String getCompletionWindow() {
    return completionWindow;
  }

  @JsonProperty(required = true, value = "completion_window")
  public void setCompletionWindow(String completionWindow) {
    this.completionWindow = completionWindow;
  }

  /**
   * The current status of the batch.
   **/
  public Batch status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The current status of the batch.")
  @JsonProperty(required = true, value = "status")
  @NotNull public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   **/
  public Batch outputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the file containing the outputs of successfully executed requests.")
  @JsonProperty("output_file_id")
  public String getOutputFileId() {
    return outputFileId;
  }

  @JsonProperty("output_file_id")
  public void setOutputFileId(String outputFileId) {
    this.outputFileId = outputFileId;
  }

  /**
   * The ID of the file containing the outputs of requests with errors.
   **/
  public Batch errorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the file containing the outputs of requests with errors.")
  @JsonProperty("error_file_id")
  public String getErrorFileId() {
    return errorFileId;
  }

  @JsonProperty("error_file_id")
  public void setErrorFileId(String errorFileId) {
    this.errorFileId = errorFileId;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was created.
   **/
  public Batch createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the batch was created.")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   **/
  public Batch inProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started processing.")
  @JsonProperty("in_progress_at")
  public Integer getInProgressAt() {
    return inProgressAt;
  }

  @JsonProperty("in_progress_at")
  public void setInProgressAt(Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   **/
  public Batch expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch will expire.")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty("expires_at")
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   **/
  public Batch finalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started finalizing.")
  @JsonProperty("finalizing_at")
  public Integer getFinalizingAt() {
    return finalizingAt;
  }

  @JsonProperty("finalizing_at")
  public void setFinalizingAt(Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   **/
  public Batch completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was completed.")
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }

  @JsonProperty("completed_at")
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch failed.
   **/
  public Batch failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch failed.")
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }

  @JsonProperty("failed_at")
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch expired.
   **/
  public Batch expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch expired.")
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }

  @JsonProperty("expired_at")
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   **/
  public Batch cancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch started cancelling.")
  @JsonProperty("cancelling_at")
  public Integer getCancellingAt() {
    return cancellingAt;
  }

  @JsonProperty("cancelling_at")
  public void setCancellingAt(Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   **/
  public Batch cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the batch was cancelled.")
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  @JsonProperty("cancelled_at")
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   **/
  public Batch requestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request_counts")
  @Valid public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }

  @JsonProperty("request_counts")
  public void setRequestCounts(BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public Batch metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
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

