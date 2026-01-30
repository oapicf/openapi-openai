package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The payload used to create the invite.
 */
@ApiModel(description = "The payload used to create the invite.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogInviteSentData   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("role")
  private String role;

  public AuditLogInviteSentData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email invited to the organization.
   * @return email
   */
  @ApiModelProperty(value = "The email invited to the organization.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuditLogInviteSentData role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role the email was invited to be. Is either `owner` or `member`.
   * @return role
   */
  @ApiModelProperty(value = "The role the email was invited to be. Is either `owner` or `member`.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

