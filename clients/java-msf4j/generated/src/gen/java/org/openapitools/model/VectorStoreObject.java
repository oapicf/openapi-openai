package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;

/**
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */
@ApiModel(description = "A vector store is a collection of processed files can be used by the `file_search` tool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `vector_store`.
   */
  public enum ObjectEnum {
    VECTOR_STORE("vector_store");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("name")
  private String name;

  @JsonProperty("usage_bytes")
  private Integer usageBytes;

  @JsonProperty("file_counts")
  private VectorStoreObjectFileCounts fileCounts;

  /**
   * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("expires_after")
  private VectorStoreExpirationAfter expiresAfter;

  @JsonProperty("expires_at")
  private Integer expiresAt;

  @JsonProperty("last_active_at")
  private Integer lastActiveAt;

  @JsonProperty("metadata")
  private Object metadata;

  public VectorStoreObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VectorStoreObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `vector_store`.
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public VectorStoreObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the vector store was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the vector store.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the vector store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VectorStoreObject usageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
    return this;
  }

   /**
   * The total number of bytes used by the files in the vector store.
   * @return usageBytes
  **/
  @ApiModelProperty(required = true, value = "The total number of bytes used by the files in the vector store.")
  public Integer getUsageBytes() {
    return usageBytes;
  }

  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public VectorStoreObject fileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
    return this;
  }

   /**
   * Get fileCounts
   * @return fileCounts
  **/
  @ApiModelProperty(required = true, value = "")
  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }

  public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  public VectorStoreObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VectorStoreObject expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

   /**
   * Get expiresAfter
   * @return expiresAfter
  **/
  @ApiModelProperty(value = "")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public VectorStoreObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the vector store will expire.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the vector store will expire.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VectorStoreObject lastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the vector store was last active.
   * @return lastActiveAt
  **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was last active.")
  public Integer getLastActiveAt() {
    return lastActiveAt;
  }

  public void setLastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  public VectorStoreObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

