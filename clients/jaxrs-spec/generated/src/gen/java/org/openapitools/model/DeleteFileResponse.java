package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeleteFileResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeleteFileResponse   {
  private @Valid String id;
  private @Valid String _object;
  private @Valid Boolean deleted;

  /**
   **/
  public DeleteFileResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public DeleteFileResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   **/
  public DeleteFileResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("deleted")
  @NotNull
  public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty("deleted")
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
    DeleteFileResponse deleteFileResponse = (DeleteFileResponse) o;
    return Objects.equals(this.id, deleteFileResponse.id) &&
        Objects.equals(this._object, deleteFileResponse._object) &&
        Objects.equals(this.deleted, deleteFileResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteFileResponse {\n");
    
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

