package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The user who performed the audit logged action.
 */
@ApiModel(description="The user who performed the audit logged action.")

public class AuditLogActorUser  {
  
 /**
  * The user id.
  */
  @ApiModelProperty(value = "The user id.")

  private String id;

 /**
  * The user email.
  */
  @ApiModelProperty(value = "The user email.")

  private String email;
 /**
   * The user id.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogActorUser id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The user email.
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuditLogActorUser email(String email) {
    this.email = email;
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
    AuditLogActorUser auditLogActorUser = (AuditLogActorUser) o;
    return Objects.equals(this.id, auditLogActorUser.id) &&
        Objects.equals(this.email, auditLogActorUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActorUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

