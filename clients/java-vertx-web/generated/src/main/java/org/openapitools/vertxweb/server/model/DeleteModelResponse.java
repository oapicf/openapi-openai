package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteModelResponse   {
  
  private String id;
  private String _object;
  private Boolean deleted;

  public DeleteModelResponse () {

  }

  public DeleteModelResponse (String id, String _object, Boolean deleted) {
    this.id = id;
    this._object = _object;
    this.deleted = deleted;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteModelResponse deleteModelResponse = (DeleteModelResponse) o;
    return Objects.equals(id, deleteModelResponse.id) &&
        Objects.equals(_object, deleteModelResponse._object) &&
        Objects.equals(deleted, deleteModelResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteModelResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
