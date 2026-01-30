package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 */
@ApiModel(description="A vector store is a collection of processed files can be used by the `file_search` tool.")

public class VectorStoreObject  {
  
 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")

  private String id;

public enum ObjectEnum {

VECTOR_STORE(String.valueOf("vector_store"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The object type, which is always `vector_store`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store`.")

  private ObjectEnum _object;

 /**
  * The Unix timestamp (in seconds) for when the vector store was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was created.")

  private Integer createdAt;

 /**
  * The name of the vector store.
  */
  @ApiModelProperty(required = true, value = "The name of the vector store.")

  private String name;

 /**
  * The total number of bytes used by the files in the vector store.
  */
  @ApiModelProperty(required = true, value = "The total number of bytes used by the files in the vector store.")

  private Integer usageBytes;

  @ApiModelProperty(required = true, value = "")

  private VectorStoreObjectFileCounts fileCounts;

public enum StatusEnum {

EXPIRED(String.valueOf("expired")), IN_PROGRESS(String.valueOf("in_progress")), COMPLETED(String.valueOf("completed"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  */
  @ApiModelProperty(required = true, value = "The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.")

  private StatusEnum status;

  @ApiModelProperty(value = "")

  private VectorStoreExpirationAfter expiresAfter;

 /**
  * The Unix timestamp (in seconds) for when the vector store will expire.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the vector store will expire.")

  private Integer expiresAt;

 /**
  * The Unix timestamp (in seconds) for when the vector store was last active.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was last active.")

  private Integer lastActiveAt;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;
 /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VectorStoreObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;vector_store&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public VectorStoreObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the vector store was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The name of the vector store.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VectorStoreObject name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The total number of bytes used by the files in the vector store.
   * @return usageBytes
  **/
  @JsonProperty("usage_bytes")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public VectorStoreObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

 /**
   * Get fileCounts
   * @return fileCounts
  **/
  @JsonProperty("file_counts")
  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }

  public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  public VectorStoreObject fileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
    return this;
  }

 /**
   * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VectorStoreObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get expiresAfter
   * @return expiresAfter
  **/
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public VectorStoreObject expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the vector store will expire.
   * @return expiresAt
  **/
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VectorStoreObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the vector store was last active.
   * @return lastActiveAt
  **/
  @JsonProperty("last_active_at")
  public Integer getLastActiveAt() {
    return lastActiveAt;
  }

  public void setLastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  public VectorStoreObject lastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public VectorStoreObject metadata(Object metadata) {
    this.metadata = metadata;
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
    VectorStoreObject vectorStoreObject = (VectorStoreObject) o;
    return Objects.equals(this.id, vectorStoreObject.id) &&
        Objects.equals(this._object, vectorStoreObject._object) &&
        Objects.equals(this.createdAt, vectorStoreObject.createdAt) &&
        Objects.equals(this.name, vectorStoreObject.name) &&
        Objects.equals(this.usageBytes, vectorStoreObject.usageBytes) &&
        Objects.equals(this.fileCounts, vectorStoreObject.fileCounts) &&
        Objects.equals(this.status, vectorStoreObject.status) &&
        Objects.equals(this.expiresAfter, vectorStoreObject.expiresAfter) &&
        Objects.equals(this.expiresAt, vectorStoreObject.expiresAt) &&
        Objects.equals(this.lastActiveAt, vectorStoreObject.lastActiveAt) &&
        Objects.equals(this.metadata, vectorStoreObject.metadata);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

