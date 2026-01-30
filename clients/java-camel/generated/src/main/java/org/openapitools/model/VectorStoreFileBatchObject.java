package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.VectorStoreFileBatchObjectFileCounts;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A batch of files attached to a vector store.
 */

@Schema(name = "VectorStoreFileBatchObject", description = "A batch of files attached to a vector store.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileBatchObject {

  private String id;

  /**
   * The object type, which is always `vector_store.file_batch`.
   */
  public enum ObjectEnum {
    VECTOR_STORE_FILES_BATCH("vector_store.files_batch");

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

  private String vectorStoreId;

  /**
   * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
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

  private VectorStoreFileBatchObjectFileCounts fileCounts;

  public VectorStoreFileBatchObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VectorStoreFileBatchObject(String id, ObjectEnum _object, Integer createdAt, String vectorStoreId, StatusEnum status, VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.vectorStoreId = vectorStoreId;
    this.status = status;
    this.fileCounts = fileCounts;
  }

  public VectorStoreFileBatchObject id(String id) {
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

  public VectorStoreFileBatchObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `vector_store.file_batch`.
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `vector_store.file_batch`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public VectorStoreFileBatchObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store files batch was created.
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the vector store files batch was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreFileBatchObject vectorStoreId(String vectorStoreId) {
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

  public VectorStoreFileBatchObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VectorStoreFileBatchObject fileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
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
  public VectorStoreFileBatchObjectFileCounts getFileCounts() {
    return fileCounts;
  }

  public void setFileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreFileBatchObject vectorStoreFileBatchObject = (VectorStoreFileBatchObject) o;
    return Objects.equals(this.id, vectorStoreFileBatchObject.id) &&
        Objects.equals(this._object, vectorStoreFileBatchObject._object) &&
        Objects.equals(this.createdAt, vectorStoreFileBatchObject.createdAt) &&
        Objects.equals(this.vectorStoreId, vectorStoreFileBatchObject.vectorStoreId) &&
        Objects.equals(this.status, vectorStoreFileBatchObject.status) &&
        Objects.equals(this.fileCounts, vectorStoreFileBatchObject.fileCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, vectorStoreId, status, fileCounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VectorStoreFileBatchObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    vectorStoreId: ").append(toIndentedString(vectorStoreId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileCounts: ").append(toIndentedString(fileCounts)).append("\n");
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

