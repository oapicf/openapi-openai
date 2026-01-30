package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.VectorStoreFileBatchObjectFileCounts;

/**
 * A batch of files attached to a vector store.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VectorStoreFileBatchObject   {
  
  private String id;


  public enum ObjectEnum {
    VECTOR_STORE_FILES_BATCH("vector_store.files_batch");

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
  private VectorStoreFileBatchObjectFileCounts fileCounts;

  public VectorStoreFileBatchObject () {

  }

  public VectorStoreFileBatchObject (String id, ObjectEnum _object, Integer createdAt, String vectorStoreId, StatusEnum status, VectorStoreFileBatchObjectFileCounts fileCounts) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.vectorStoreId = vectorStoreId;
    this.status = status;
    this.fileCounts = fileCounts;
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
