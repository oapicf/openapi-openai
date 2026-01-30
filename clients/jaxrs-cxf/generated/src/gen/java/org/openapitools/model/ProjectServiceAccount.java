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
 * Represents an individual service account in a project.
 */
@ApiModel(description="Represents an individual service account in a project.")

public class ProjectServiceAccount  {
  
public enum ObjectEnum {

ORGANIZATION_PROJECT_SERVICE_ACCOUNT(String.valueOf("organization.project.service_account"));


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

 /**
  * The object type, which is always `organization.project.service_account`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.service_account`")

  private ObjectEnum _object;

 /**
  * The identifier, which can be referenced in API endpoints
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")

  private String id;

 /**
  * The name of the service account
  */
  @ApiModelProperty(required = true, value = "The name of the service account")

  private String name;

public enum RoleEnum {

OWNER(String.valueOf("owner")), MEMBER(String.valueOf("member"));


    private String value;

    RoleEnum (String v) {
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
    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * `owner` or `member`
  */
  @ApiModelProperty(required = true, value = "`owner` or `member`")

  private RoleEnum role;

 /**
  * The Unix timestamp (in seconds) of when the service account was created
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the service account was created")

  private Integer createdAt;
 /**
   * The object type, which is always &#x60;organization.project.service_account&#x60;
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

  public ProjectServiceAccount _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The identifier, which can be referenced in API endpoints
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

  public ProjectServiceAccount id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The name of the service account
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectServiceAccount name(String name) {
    this.name = name;
    return this;
  }

 /**
   * &#x60;owner&#x60; or &#x60;member&#x60;
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ProjectServiceAccount role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the service account was created
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectServiceAccount createdAt(Integer createdAt) {
    this.createdAt = createdAt;
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
    ProjectServiceAccount projectServiceAccount = (ProjectServiceAccount) o;
    return Objects.equals(this._object, projectServiceAccount._object) &&
        Objects.equals(this.id, projectServiceAccount.id) &&
        Objects.equals(this.name, projectServiceAccount.name) &&
        Objects.equals(this.role, projectServiceAccount.role) &&
        Objects.equals(this.createdAt, projectServiceAccount.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, role, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectServiceAccount {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

