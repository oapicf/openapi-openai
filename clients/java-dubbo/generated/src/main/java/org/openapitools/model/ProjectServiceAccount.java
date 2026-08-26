package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an individual service account in a project.
 */
public class ProjectServiceAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;organization.project.service_account&#x60;
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The identifier, which can be referenced in API endpoints
   */
  @JsonProperty("id")
  private String id;

  /**
   * The name of the service account
   */
  @JsonProperty("name")
  private String name;

  /**
   * &#x60;owner&#x60; or &#x60;member&#x60;
   */
  @JsonProperty("role")
  private String role;

  /**
   * The Unix timestamp (in seconds) of when the service account was created
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The object type, which is always &#x60;organization.project.service_account&#x60;
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
   * The name of the service account
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * The Unix timestamp (in seconds) of when the service account was created
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
