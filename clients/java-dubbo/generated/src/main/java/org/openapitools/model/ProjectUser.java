package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an individual user in a project.
 */
public class ProjectUser implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;organization.project.user&#x60;
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The identifier, which can be referenced in API endpoints
   */
  @JsonProperty("id")
  private String id;

  /**
   * The name of the user
   */
  @JsonProperty("name")
  private String name;

  /**
   * The email address of the user
   */
  @JsonProperty("email")
  private String email;

  /**
   * &#x60;owner&#x60; or &#x60;member&#x60;
   */
  @JsonProperty("role")
  private String role;

  /**
   * The Unix timestamp (in seconds) of when the project was added.
   */
  @JsonProperty("added_at")
  private Integer addedAt;

  /**
   * The object type, which is always &#x60;organization.project.user&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the user
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The email address of the user
   * @return email
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * &#x60;owner&#x60; or &#x60;member&#x60;
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was added.
   * @return addedAt
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
