package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonProperty("vector_store") VECTOR_STORE(String.valueOf("vector_store"));

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
  @Valid
  private VectorStoreObjectFileCounts fileCounts;

public enum StatusEnum {

    @JsonProperty("expired") EXPIRED(String.valueOf("expired")),
    @JsonProperty("in_progress") IN_PROGRESS(String.valueOf("in_progress")),
    @JsonProperty("completed") COMPLETED(String.valueOf("completed"));

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
  @Valid
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
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public VectorStoreObject id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;vector_store&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public VectorStoreObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the vector store was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public VectorStoreObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The name of the vector store.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public VectorStoreObject name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The total number of bytes used by the files in the vector store.
  * @return usageBytes
  */
  @JsonProperty("usage_bytes")
  @NotNull
  public Integer getUsageBytes() {
    return usageBytes;
  }

  /**
   * Sets the <code>usageBytes</code> property.
   */
 public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   * Sets the <code>usageBytes</code> property.
   */
  public VectorStoreObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

 /**
  * Get fileCounts
  * @return fileCounts
  */
  @JsonProperty("file_counts")
  @NotNull
  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }

  /**
   * Sets the <code>fileCounts</code> property.
   */
 public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  /**
   * Sets the <code>fileCounts</code> property.
   */
  public VectorStoreObject fileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
    return this;
  }

 /**
  * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public VectorStoreObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Get expiresAfter
  * @return expiresAfter
  */
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  /**
   * Sets the <code>expiresAfter</code> property.
   */
 public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  /**
   * Sets the <code>expiresAfter</code> property.
   */
  public VectorStoreObject expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the vector store will expire.
  * @return expiresAt
  */
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
 public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
  public VectorStoreObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the vector store was last active.
  * @return lastActiveAt
  */
  @JsonProperty("last_active_at")
  @NotNull
  public Integer getLastActiveAt() {
    return lastActiveAt;
  }

  /**
   * Sets the <code>lastActiveAt</code> property.
   */
 public void setLastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  /**
   * Sets the <code>lastActiveAt</code> property.
   */
  public VectorStoreObject lastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
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

