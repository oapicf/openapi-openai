package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="A vector store is a collection of processed files can be used by the `file_search` tool.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreObject   {
  
  private String id;

  /**
   * The object type, which is always &#x60;vector_store&#x60;.
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
  }

  private ObjectEnum _object;
  private Integer createdAt;
  private String name;
  private Integer usageBytes;
  private VectorStoreObjectFileCounts fileCounts;

  /**
   * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
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
  }

  private StatusEnum status;
  private VectorStoreExpirationAfter expiresAfter;
  private Integer expiresAt;
  private Integer lastActiveAt;
  private Object metadata;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;vector_store&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store`.")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store was created.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The name of the vector store.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the vector store.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The total number of bytes used by the files in the vector store.
   **/
  
  @ApiModelProperty(required = true, value = "The total number of bytes used by the files in the vector store.")
  @JsonProperty("usage_bytes")
  @NotNull
  public Integer getUsageBytes() {
    return usageBytes;
  }
  public void setUsageBytes(Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_counts")
  @NotNull
  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }
  public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  /**
   * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
   **/
  
  @ApiModelProperty(required = true, value = "The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }
  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store will expire.
   **/
  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) for when the vector store will expire.")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store was last active.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store was last active.")
  @JsonProperty("last_active_at")
  @NotNull
  public Integer getLastActiveAt() {
    return lastActiveAt;
  }
  public void setLastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  @NotNull
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

