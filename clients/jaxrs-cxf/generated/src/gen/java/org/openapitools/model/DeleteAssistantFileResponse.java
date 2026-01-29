package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 */
@ApiModel(description="Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.")

public class DeleteAssistantFileResponse  {
  
  @ApiModelProperty(required = true, value = "")

  private String id;

  @ApiModelProperty(required = true, value = "")

  private Boolean deleted;

public enum ObjectEnum {

ASSISTANT_FILE_DELETED(String.valueOf("assistant.file.deleted"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeleteAssistantFileResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  @NotNull
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public DeleteAssistantFileResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

 /**
   * Get _object
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public DeleteAssistantFileResponse _object(ObjectEnum _object) {
    this._object = _object;
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
    DeleteAssistantFileResponse deleteAssistantFileResponse = (DeleteAssistantFileResponse) o;
    return Objects.equals(this.id, deleteAssistantFileResponse.id) &&
        Objects.equals(this.deleted, deleteAssistantFileResponse.deleted) &&
        Objects.equals(this._object, deleteAssistantFileResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deleted, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssistantFileResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

