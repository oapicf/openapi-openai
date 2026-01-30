package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Represents an individual user in a project.
 **/

@ApiModel(description = "Represents an individual user in a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * The object type, which is always `organization.project.user`
   **/
  public ProjectUser _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.user`")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   **/
  public ProjectUser id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the user
   **/
  public ProjectUser name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the user")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The email address of the user
   **/
  public ProjectUser email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The email address of the user")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * `owner` or `member`
   **/
  public ProjectUser role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "`owner` or `member`")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was added.
   **/
  public ProjectUser addedAt(Integer addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was added.")
  @JsonProperty("added_at")
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
    return Objects.equals(_object, projectUser._object) &&
        Objects.equals(id, projectUser.id) &&
        Objects.equals(name, projectUser.name) &&
        Objects.equals(email, projectUser.email) &&
        Objects.equals(role, projectUser.role) &&
        Objects.equals(addedAt, projectUser.addedAt);
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

