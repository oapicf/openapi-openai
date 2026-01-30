package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectApiKeyDeleteResponse  {
  
public enum ObjectEnum {

ORGANIZATION_PROJECT_API_KEY_DELETED(String.valueOf("organization.project.api_key.deleted"));


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

  @ApiModelProperty(required = true, value = "")

  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")

  private String id;

  @ApiModelProperty(required = true, value = "")

  private Boolean deleted;
 /**
   * Get _object
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

  public ProjectApiKeyDeleteResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectApiKeyDeleteResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public ProjectApiKeyDeleteResponse deleted(Boolean deleted) {
    this.deleted = deleted;
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
    ProjectApiKeyDeleteResponse projectApiKeyDeleteResponse = (ProjectApiKeyDeleteResponse) o;
    return Objects.equals(this._object, projectApiKeyDeleteResponse._object) &&
        Objects.equals(this.id, projectApiKeyDeleteResponse.id) &&
        Objects.equals(this.deleted, projectApiKeyDeleteResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeyDeleteResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

