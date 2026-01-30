package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents an individual user in a project.
 */
@ApiModel(description="Represents an individual user in a project.")

public class ProjectUser  {
  
public enum ObjectEnum {

    @JsonProperty("organization.project.user") ORGANIZATION_PROJECT_USER(String.valueOf("organization.project.user"));

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
  * The object type, which is always `organization.project.user`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.user`")
  private ObjectEnum _object;

 /**
  * The identifier, which can be referenced in API endpoints
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  private String id;

 /**
  * The name of the user
  */
  @ApiModelProperty(required = true, value = "The name of the user")
  private String name;

 /**
  * The email address of the user
  */
  @ApiModelProperty(required = true, value = "The email address of the user")
  private String email;

public enum RoleEnum {

    @JsonProperty("owner") OWNER(String.valueOf("owner")),
    @JsonProperty("member") MEMBER(String.valueOf("member"));

    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The Unix timestamp (in seconds) of when the project was added.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was added.")
  private Integer addedAt;
 /**
  * The object type, which is always &#x60;organization.project.user&#x60;
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public ProjectUser _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The identifier, which can be referenced in API endpoints
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ProjectUser id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The name of the user
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ProjectUser name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The email address of the user
  * @return email
  */
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  /**
   * Sets the <code>email</code> property.
   */
 public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Sets the <code>email</code> property.
   */
  public ProjectUser email(String email) {
    this.email = email;
    return this;
  }

 /**
  * &#x60;owner&#x60; or &#x60;member&#x60;
  * @return role
  */
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public ProjectUser role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the project was added.
  * @return addedAt
  */
  @JsonProperty("added_at")
  @NotNull
  public Integer getAddedAt() {
    return addedAt;
  }

  /**
   * Sets the <code>addedAt</code> property.
   */
 public void setAddedAt(Integer addedAt) {
    this.addedAt = addedAt;
  }

  /**
   * Sets the <code>addedAt</code> property.
   */
  public ProjectUser addedAt(Integer addedAt) {
    this.addedAt = addedAt;
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
    ProjectUser projectUser = (ProjectUser) o;
    return Objects.equals(this._object, projectUser._object) &&
        Objects.equals(this.id, projectUser.id) &&
        Objects.equals(this.name, projectUser.name) &&
        Objects.equals(this.email, projectUser.email) &&
        Objects.equals(this.role, projectUser.role) &&
        Objects.equals(this.addedAt, projectUser.addedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, email, role, addedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUser {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
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

