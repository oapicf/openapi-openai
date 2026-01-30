package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.model.VectorStoreFileObjectLastError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of files attached to a vector store.
 */
@ApiModel(description="A list of files attached to a vector store.")

public class VectorStoreFileObject  {
  
 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")

  private String id;

public enum ObjectEnum {

VECTOR_STORE_FILE(String.valueOf("vector_store.file"));


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
  * The object type, which is always `vector_store.file`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store.file`.")

  private ObjectEnum _object;

 /**
  * The total vector store usage in bytes. Note that this may be different from the original file size.
  */
  @ApiModelProperty(required = true, value = "The total vector store usage in bytes. Note that this may be different from the original file size.")

  private Integer usageBytes;

 /**
  * The Unix timestamp (in seconds) for when the vector store file was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store file was created.")

  private Integer createdAt;

 /**
  * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  */
  @ApiModelProperty(required = true, value = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")

  private String vectorStoreId;

public enum StatusEnum {

IN_PROGRESS(String.valueOf("in_progress")), COMPLETED(String.valueOf("completed")), CANCELLED(String.valueOf("cancelled")), FAILED(String.valueOf("failed"));


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
  * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  */
  @ApiModelProperty(required = true, value = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.")

  private StatusEnum status;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VectorStoreFileObjectLastError lastError;

  @ApiModelProperty(value = "")

  @Valid

  private VectorStoreFileObjectChunkingStrategy chunkingStrategy;
 /**
   * The identifier, which can be referenced in API endpoints.
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

  public VectorStoreFileObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;vector_store.file&#x60;.
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

  public VectorStoreFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The total vector store usage in bytes. Note that this may be different from the original file size.
   * @return usageBytes
  **/
  @JsonProperty("usage_bytes")
  @NotNull
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public VectorStoreFileObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the vector store file was created.
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

  public VectorStoreFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   * @return vectorStoreId
  **/
  @JsonProperty("vector_store_id")
  @NotNull
  public String getVectorStoreId() {
    return vectorStoreId;
  }

  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  public VectorStoreFileObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

 /**
   * The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use.
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

  public VectorStoreFileObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get lastError
   * @return lastError
  **/
  @JsonProperty("last_error")
  @NotNull
  public VectorStoreFileObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
  }

  public VectorStoreFileObject lastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

 /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
  @JsonProperty("chunking_strategy")
  public VectorStoreFileObjectChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public VectorStoreFileObject chunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
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
    VectorStoreFileObject vectorStoreFileObject = (VectorStoreFileObject) o;
    return Objects.equals(this.id, vectorStoreFileObject.id) &&
        Objects.equals(this._object, vectorStoreFileObject._object) &&
        Objects.equals(this.usageBytes, vectorStoreFileObject.usageBytes) &&
        Objects.equals(this.createdAt, vectorStoreFileObject.createdAt) &&
        Objects.equals(this.vectorStoreId, vectorStoreFileObject.vectorStoreId) &&
        Objects.equals(this.status, vectorStoreFileObject.status) &&
        Objects.equals(this.lastError, vectorStoreFileObject.lastError) &&
        Objects.equals(this.chunkingStrategy, vectorStoreFileObject.chunkingStrategy);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

