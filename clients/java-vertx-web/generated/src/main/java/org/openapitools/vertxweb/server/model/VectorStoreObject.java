package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.VectorStoreExpirationAfter;
import org.openapitools.vertxweb.server.model.VectorStoreObjectFileCounts;

/**
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VectorStoreObject   {
  
  private String id;


  public enum ObjectEnum {
    VECTOR_STORE("vector_store");

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
  private Integer createdAt;
  private String name;
  private Integer usageBytes;
  private VectorStoreObjectFileCounts fileCounts;


  public enum StatusEnum {
    EXPIRED("expired"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed");

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
  private VectorStoreExpirationAfter expiresAfter;
  private Integer expiresAt;
  private Integer lastActiveAt;
  private Object metadata;

  public VectorStoreObject () {

  }

  public VectorStoreObject (String id, ObjectEnum _object, Integer createdAt, String name, Integer usageBytes, VectorStoreObjectFileCounts fileCounts, StatusEnum status, VectorStoreExpirationAfter expiresAfter, Integer expiresAt, Integer lastActiveAt, Object metadata) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.name = name;
    this.usageBytes = usageBytes;
    this.fileCounts = fileCounts;
    this.status = status;
    this.expiresAfter = expiresAfter;
    this.expiresAt = expiresAt;
    this.lastActiveAt = lastActiveAt;
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

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

    
  @JsonProperty("file_counts")
  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }
  public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }
  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("last_active_at")
  public Integer getLastActiveAt() {
    return lastActiveAt;
  }
  public void setLastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
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
    VectorStoreObject vectorStoreObject = (VectorStoreObject) o;
    return Objects.equals(id, vectorStoreObject.id) &&
        Objects.equals(_object, vectorStoreObject._object) &&
        Objects.equals(createdAt, vectorStoreObject.createdAt) &&
        Objects.equals(name, vectorStoreObject.name) &&
        Objects.equals(usageBytes, vectorStoreObject.usageBytes) &&
        Objects.equals(fileCounts, vectorStoreObject.fileCounts) &&
        Objects.equals(status, vectorStoreObject.status) &&
        Objects.equals(expiresAfter, vectorStoreObject.expiresAfter) &&
        Objects.equals(expiresAt, vectorStoreObject.expiresAt) &&
        Objects.equals(lastActiveAt, vectorStoreObject.lastActiveAt) &&
        Objects.equals(metadata, vectorStoreObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, name, usageBytes, fileCounts, status, expiresAfter, expiresAt, lastActiveAt, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
    sb.append("    fileCounts: ").append(toIndentedString(fileCounts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    lastActiveAt: ").append(toIndentedString(lastActiveAt)).append("\n");
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
