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
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.model.VectorStoreFileObjectLastError;



/**
 * A list of files attached to a vector store.
 */

@ApiModel(description = "A list of files attached to a vector store.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileObject   {
  
  private String id;


  public enum ObjectEnum {
    VECTOR_STORE_FILE("vector_store.file");

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
  private Integer usageBytes;
  private Integer createdAt;
  private String vectorStoreId;


  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    FAILED("failed");

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
  private VectorStoreFileObjectLastError lastError;
  private VectorStoreFileObjectChunkingStrategy chunkingStrategy;

  /**
   * The identifier, which can be referenced in API endpoints.
   */
  public VectorStoreFileObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `vector_store.file`.
   */
  public VectorStoreFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store.file`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The total vector store usage in bytes. Note that this may be different from the original file size.
   */
  public VectorStoreFileObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total vector store usage in bytes. Note that this may be different from the original file size.")
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store file was created.
   */
  public VectorStoreFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store file was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   */
  public VectorStoreFileObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
  @JsonProperty("vector_store_id")
  public String getVectorStoreId() {
    return vectorStoreId;
  }
  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  /**
   * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
   */
  public VectorStoreFileObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   */
  public VectorStoreFileObject lastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("last_error")
  public VectorStoreFileObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   */
  public VectorStoreFileObject chunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chunking_strategy")
  public VectorStoreFileObjectChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }
  public void setChunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreFileObject vectorStoreFileObject = (VectorStoreFileObject) o;
    return Objects.equals(id, vectorStoreFileObject.id) &&
        Objects.equals(_object, vectorStoreFileObject._object) &&
        Objects.equals(usageBytes, vectorStoreFileObject.usageBytes) &&
        Objects.equals(createdAt, vectorStoreFileObject.createdAt) &&
        Objects.equals(vectorStoreId, vectorStoreFileObject.vectorStoreId) &&
        Objects.equals(status, vectorStoreFileObject.status) &&
        Objects.equals(lastError, vectorStoreFileObject.lastError) &&
        Objects.equals(chunkingStrategy, vectorStoreFileObject.chunkingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, usageBytes, createdAt, vectorStoreId, status, lastError, chunkingStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreFileObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    vectorStoreId: ").append(toIndentedString(vectorStoreId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
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

