package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The payload used to create the invite.
 */
public class AuditLogInviteSentData implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The email invited to the organization.
   */
  @JsonProperty("email")
  private String email;

  /**
   * The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
   */
  @JsonProperty("role")
  private String role;

  /**
   * The email invited to the organization.
   * @return email
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
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
    AuditLogInviteSentData auditLogInviteSentData = (AuditLogInviteSentData) o;
    return Objects.equals(this.email, auditLogInviteSentData.email) &&
        Objects.equals(this.role, auditLogInviteSentData.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogInviteSentData {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
