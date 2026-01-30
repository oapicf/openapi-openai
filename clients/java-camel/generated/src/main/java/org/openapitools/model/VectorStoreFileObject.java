package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.model.VectorStoreFileObjectLastError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of files attached to a vector store.
 */

@Schema(name = "VectorStoreFileObject", description = "A list of files attached to a vector store.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileObject {

  private String id;

  /**
   * The object type, which is always `vector_store.file`.
   */
  public enum ObjectEnum {
    VECTOR_STORE_FILE("vector_store.file");

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

  private Integer usageBytes;

  private Integer createdAt;

  private String vectorStoreId;

  /**
   * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
   */
  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed");

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

  private JsonNullable<VectorStoreFileObjectLastError> lastError = JsonNullable.<VectorStoreFileObjectLastError>undefined();

  private VectorStoreFileObjectChunkingStrategy chunkingStrategy;

  public VectorStoreFileObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VectorStoreFileObject(String id, ObjectEnum _object, Integer usageBytes, Integer createdAt, String vectorStoreId, StatusEnum status, VectorStoreFileObjectLastError lastError) {
    this.id = id;
    this._object = _object;
    this.usageBytes = usageBytes;
    this.createdAt = createdAt;
    this.vectorStoreId = vectorStoreId;
    this.status = status;
    this.lastError = JsonNullable.of(lastError);
  }

  public VectorStoreFileObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VectorStoreFileObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `vector_store.file`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `vector_store.file`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public VectorStoreFileObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

  /**
   * The total vector store usage in bytes. Note that this may be different from the original file size.
   * @return usageBytes
   */
  @NotNull 
  @Schema(name = "usage_bytes", description = "The total vector store usage in bytes. Note that this may be different from the original file size.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public VectorStoreFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store file was created.
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the vector store file was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreFileObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

  /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   * @return vectorStoreId
   */
  @NotNull 
  @Schema(name = "vector_store_id", description = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vector_store_id")
  public String getVectorStoreId() {
    return vectorStoreId;
  }

  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  public VectorStoreFileObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VectorStoreFileObject lastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = JsonNullable.of(lastError);
    return this;
  }

  /**
   * Get lastError
   * @return lastError
   */
  @NotNull @Valid 
  @Schema(name = "last_error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_error")
  public JsonNullable<VectorStoreFileObjectLastError> getLastError() {
    return lastError;
  }

  public void setLastError(JsonNullable<VectorStoreFileObjectLastError> lastError) {
    this.lastError = lastError;
  }

  public VectorStoreFileObject chunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  /**
   * Get chunkingStrategy
   * @return chunkingStrategy
   */
  @Valid 
  @Schema(name = "chunking_strategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

