package org.openapitools.model;

import org.openapitools.model.VectorStoreFileBatchObjectFileCounts;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A batch of files attached to a vector store.
 */
@ApiModel(description="A batch of files attached to a vector store.")

public class VectorStoreFileBatchObject  {
  
 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")

  private String id;

public enum ObjectEnum {

VECTOR_STORE_FILES_BATCH(String.valueOf("vector_store.files_batch"));


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
  * The object type, which is always `vector_store.file_batch`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `vector_store.file_batch`.")

  private ObjectEnum _object;

 /**
  * The Unix timestamp (in seconds) for when the vector store files batch was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the vector store files batch was created.")

  private Integer createdAt;

 /**
  * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  */
  @ApiModelProperty(required = true, value = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")

  private String vectorStoreId;

public enum StatusEnum {

IN_PROGRESS(String.valueOf("in_progress")), COMPLETED(String.valueOf("completed")), CANCELLED(String.valueOf("cancelled")), FAILED(String.valueOf("failed"));


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
  * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  */
  @ApiModelProperty(required = true, value = "The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.")

  private StatusEnum status;

  @ApiModelProperty(required = true, value = "")

  private VectorStoreFileBatchObjectFileCounts fileCounts;
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

  public VectorStoreFileBatchObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;vector_store.file_batch&#x60;.
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

  public VectorStoreFileBatchObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the vector store files batch was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreFileBatchObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
   * @return vectorStoreId
  **/
  @JsonProperty("vector_store_id")
  public String getVectorStoreId() {
    return vectorStoreId;
  }

  public void setVectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
  }

  public VectorStoreFileBatchObject vectorStoreId(String vectorStoreId) {
    this.vectorStoreId = vectorStoreId;
    return this;
  }

 /**
   * The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;.
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

  public VectorStoreFileBatchObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get fileCounts
   * @return fileCounts
  **/
  @JsonProperty("file_counts")
  public VectorStoreFileBatchObjectFileCounts getFileCounts() {
    return fileCounts;
  }

  public void setFileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  public VectorStoreFileBatchObject fileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

