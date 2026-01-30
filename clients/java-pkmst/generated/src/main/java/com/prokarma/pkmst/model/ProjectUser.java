package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents an individual user in a project.
 */
@ApiModel(description = "Represents an individual user in a project.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectUser   {
  /**
   * The object type, which is always `organization.project.user`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_USER("organization.project.user");

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

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  /**
   * `owner` or `member`
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    MEMBER("member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("added_at")
  private Integer addedAt;

  public ProjectUser _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.project.user`
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.user`")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name of the user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @ApiModelProperty(required = true, value = "The email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ProjectUser role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * `owner` or `member`
   * @return role
   */
  @ApiModelProperty(required = true, value = "`owner` or `member`")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ProjectUser addedAt(Integer addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was added.
   * @return addedAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was added.")
  public Integer getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(Integer addedAt) {
    this.addedAt = addedAt;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

