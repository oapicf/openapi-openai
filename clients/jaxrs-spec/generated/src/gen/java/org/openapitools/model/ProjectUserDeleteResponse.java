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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ProjectUserDeleteResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectUserDeleteResponse   {
  public enum ObjectEnum {

    ORGANIZATION_PROJECT_USER_DELETED(String.valueOf("organization.project.user.deleted"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private String id;
  private Boolean deleted;

  public ProjectUserDeleteResponse() {
  }

  @JsonCreator
  public ProjectUserDeleteResponse(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "deleted") Boolean deleted
  ) {
    this._object = _object;
    this.id = id;
    this.deleted = deleted;
  }

  /**
   **/
  public ProjectUserDeleteResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  public ProjectUserDeleteResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public ProjectUserDeleteResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "deleted")
  @NotNull public Boolean getDeleted() {
    return deleted;
  }

  @JsonProperty(required = true, value = "deleted")
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
    ProjectUserDeleteResponse projectUserDeleteResponse = (ProjectUserDeleteResponse) o;
    return Objects.equals(this._object, projectUserDeleteResponse._object) &&
        Objects.equals(this.id, projectUserDeleteResponse.id) &&
        Objects.equals(this.deleted, projectUserDeleteResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUserDeleteResponse {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

