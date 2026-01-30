package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payload used to create the invite.
 */
@ApiModel(description="The payload used to create the invite.")

public class AuditLogInviteSentData  {
  
 /**
  * The email invited to the organization.
  */
  @ApiModelProperty(value = "The email invited to the organization.")

  private String email;

 /**
  * The role the email was invited to be. Is either `owner` or `member`.
  */
  @ApiModelProperty(value = "The role the email was invited to be. Is either `owner` or `member`.")

  private String role;
 /**
   * The email invited to the organization.
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuditLogInviteSentData email(String email) {
    this.email = email;
    return this;
  }

 /**
   * The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AuditLogInviteSentData role(String role) {
    this.role = role;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

