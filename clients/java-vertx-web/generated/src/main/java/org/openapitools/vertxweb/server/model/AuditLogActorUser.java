package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The user who performed the audit logged action.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogActorUser   {
  
  private String id;
  private String email;

  public AuditLogActorUser () {

  }

  public AuditLogActorUser (String id, String email) {
    this.id = id;
    this.email = email;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
    return Objects.equals(id, auditLogActorUser.id) &&
        Objects.equals(email, auditLogActorUser.email);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
