package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VectorStoreFileBatchObjectFileCounts;



/**
 * A batch of files attached to a vector store.
 **/

@ApiModel(description = "A batch of files attached to a vector store.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoreFileBatchObject   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `vector_store.file_batch`.
   */
  public enum ObjectEnum {
    VECTOR_STORE_FILES_BATCH("vector_store.files_batch");

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

  @JsonProperty("vector_store_id")
  private String vectorStoreId;

  /**
   * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
   */
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

  @JsonProperty("file_counts")
  private VectorStoreFileBatchObjectFileCounts fileCounts;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public VectorStoreFileBatchObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `vector_store.file_batch`.
   **/
  public VectorStoreFileBatchObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store.file_batch`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store files batch was created.
   **/
  public VectorStoreFileBatchObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store files batch was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   **/
  public VectorStoreFileBatchObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
  @JsonProperty("vector_store_id")
  public String getVectorStoreId() {
    return vectorStoreId;
  }
  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  /**
   * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
   **/
  public VectorStoreFileBatchObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  public VectorStoreFileBatchObject fileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(id, vectorStoreFileBatchObject.id) &&
        Objects.equals(_object, vectorStoreFileBatchObject._object) &&
        Objects.equals(createdAt, vectorStoreFileBatchObject.createdAt) &&
        Objects.equals(vectorStoreId, vectorStoreFileBatchObject.vectorStoreId) &&
        Objects.equals(status, vectorStoreFileBatchObject.status) &&
        Objects.equals(fileCounts, vectorStoreFileBatchObject.fileCounts);
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

