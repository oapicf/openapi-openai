package apimodels;

import apimodels.VectorStoreFileObjectChunkingStrategy;
import apimodels.VectorStoreFileObjectLastError;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A list of files attached to a vector store.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VectorStoreFileObject   {
  @JsonProperty("id")
  @NotNull

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

  @JsonProperty("usage_bytes")
  @NotNull

  private Integer usageBytes;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("vector_store_id")
  @NotNull

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

  @JsonProperty("last_error")
  @NotNull
@Valid

  private VectorStoreFileObjectLastError lastError;

  @JsonProperty("chunking_strategy")
  @Valid

  private VectorStoreFileObjectChunkingStrategy chunkingStrategy;

  public VectorStoreFileObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VectorStoreFileObject lastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  public VectorStoreFileObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
  }

  public VectorStoreFileObject chunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

   /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

