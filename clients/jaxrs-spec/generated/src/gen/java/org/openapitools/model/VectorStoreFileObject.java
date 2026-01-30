package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.model.VectorStoreFileObjectLastError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A list of files attached to a vector store.
 **/
@ApiModel(description = "A list of files attached to a vector store.")
@JsonTypeName("VectorStoreFileObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileObject   {
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
  private Integer usageBytes;
  private Integer createdAt;
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
  private VectorStoreFileObjectLastError lastError;
  private VectorStoreFileObjectChunkingStrategy chunkingStrategy;

  public VectorStoreFileObject() {
  }

  @JsonCreator
  public VectorStoreFileObject(
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "usage_bytes") Integer usageBytes,
    @JsonProperty(required = true, value = "created_at") Integer createdAt,
    @JsonProperty(required = true, value = "vector_store_id") String vectorStoreId,
    @JsonProperty(required = true, value = "status") StatusEnum status,
    @JsonProperty(required = true, value = "last_error") VectorStoreFileObjectLastError lastError
  ) {
    this.id = id;
    this._object = _object;
    this.usageBytes = usageBytes;
    this.createdAt = createdAt;
    this.vectorStoreId = vectorStoreId;
    this.status = status;
    this.lastError = lastError;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public VectorStoreFileObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;vector_store.file&#x60;.
   **/
  public VectorStoreFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store.file`.")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The total vector store usage in bytes. Note that this may be different from the original file size.
   **/
  public VectorStoreFileObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The total vector store usage in bytes. Note that this may be different from the original file size.")
  @JsonProperty(required = true, value = "usage_bytes")
  @NotNull public Integer getUsageBytes() {
    return usageBytes;
  }

  @JsonProperty(required = true, value = "usage_bytes")
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store file was created.
   **/
  public VectorStoreFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store file was created.")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   **/
  public VectorStoreFileObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
  @JsonProperty(required = true, value = "vector_store_id")
  @NotNull public String getVectorStoreId() {
    return vectorStoreId;
  }

  @JsonProperty(required = true, value = "vector_store_id")
  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  /**
   * The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use.
   **/
  public VectorStoreFileObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.")
  @JsonProperty(required = true, value = "status")
  @NotNull public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  public VectorStoreFileObject lastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "last_error")
  @NotNull @Valid public VectorStoreFileObjectLastError getLastError() {
    return lastError;
  }

  @JsonProperty(required = true, value = "last_error")
  public void setLastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   **/
  public VectorStoreFileObject chunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chunking_strategy")
  @Valid public VectorStoreFileObjectChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  @JsonProperty("chunking_strategy")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

