package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ProjectUserCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the user.
   */
  @JsonProperty("user_id")
  private String userId;

  /**
   * &#x60;owner&#x60; or &#x60;member&#x60;
   */
  @JsonProperty("role")
  private String role;

  /**
   * The ID of the user.
   * @return userId
   */
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUserCreateRequest projectUserCreateRequest = (ProjectUserCreateRequest) o;
    return Objects.equals(this.userId, projectUserCreateRequest.userId) &&
        Objects.equals(this.role, projectUserCreateRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUserCreateRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
