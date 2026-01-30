package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.vertxweb.server.model.VectorStoreFileObjectLastError;

/**
 * A list of files attached to a vector store.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public VectorStoreFileObject () {

  }

  public VectorStoreFileObject (String id, ObjectEnum _object, Integer usageBytes, Integer createdAt, String vectorStoreId, StatusEnum status, VectorStoreFileObjectLastError lastError, VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
    this.id = id;
    this._object = _object;
    this.usageBytes = usageBytes;
    this.createdAt = createdAt;
    this.vectorStoreId = vectorStoreId;
    this.status = status;
    this.lastError = lastError;
    this.chunkingStrategy = chunkingStrategy;
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

    
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("vector_store_id")
  public String getVectorStoreId() {
    return vectorStoreId;
  }
  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("last_error")
  public VectorStoreFileObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(VectorStoreFileObjectLastError lastError) {
    this.lastError = lastError;
  }

    
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
