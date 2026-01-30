package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */

@Schema(name = "VectorStoreObject", description = "A vector store is a collection of processed files can be used by the `file_search` tool.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreObject {

  private String id;

  /**
   * The object type, which is always `vector_store`.
   */
  public enum ObjectEnum {
    VECTOR_STORE("vector_store");

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

  private Integer createdAt;

  private String name;

  private Integer usageBytes;

  private VectorStoreObjectFileCounts fileCounts;

  /**
   * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
   */
  public enum StatusEnum {
    EXPIRED("expired"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed");

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

  private VectorStoreExpirationAfter expiresAfter;

  private JsonNullable<Integer> expiresAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> lastActiveAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public VectorStoreObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VectorStoreObject(String id, ObjectEnum _object, Integer createdAt, String name, Integer usageBytes, VectorStoreObjectFileCounts fileCounts, StatusEnum status, Integer lastActiveAt, Object metadata) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.name = name;
    this.usageBytes = usageBytes;
    this.fileCounts = fileCounts;
    this.status = status;
    this.lastActiveAt = JsonNullable.of(lastActiveAt);
    this.metadata = JsonNullable.of(metadata);
  }

  public VectorStoreObject id(String id) {
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

  public VectorStoreObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `vector_store`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `vector_store`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the vector store was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
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
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the vector store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @NotNull 
  @Schema(name = "usage_bytes", description = "The total number of bytes used by the files in the vector store.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usage_bytes")
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
   */
  @NotNull @Valid 
  @Schema(name = "file_counts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_counts")
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
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
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
   */
  @Valid 
  @Schema(name = "expires_after", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public VectorStoreObject expiresAt(Integer expiresAt) {
    this.expiresAt = JsonNullable.of(expiresAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store will expire.
   * @return expiresAt
   */
  
  @Schema(name = "expires_at", description = "The Unix timestamp (in seconds) for when the vector store will expire.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public JsonNullable<Integer> getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(JsonNullable<Integer> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public VectorStoreObject lastActiveAt(Integer lastActiveAt) {
    this.lastActiveAt = JsonNullable.of(lastActiveAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store was last active.
   * @return lastActiveAt
   */
  @NotNull 
  @Schema(name = "last_active_at", description = "The Unix timestamp (in seconds) for when the vector store was last active.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_active_at")
  public JsonNullable<Integer> getLastActiveAt() {
    return lastActiveAt;
  }

  public void setLastActiveAt(JsonNullable<Integer> lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  public VectorStoreObject metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  @NotNull 
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
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
        equalsNullable(this.expiresAt, vectorStoreObject.expiresAt) &&
        Objects.equals(this.lastActiveAt, vectorStoreObject.lastActiveAt) &&
        Objects.equals(this.metadata, vectorStoreObject.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, name, usageBytes, fileCounts, status, expiresAfter, hashCodeNullable(expiresAt), lastActiveAt, metadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

