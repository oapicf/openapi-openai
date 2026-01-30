package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payload used to create the service account.
 */
@ApiModel(description="The payload used to create the service account.")

public class AuditLogServiceAccountCreatedData  {
  
 /**
  * The role of the service account. Is either `owner` or `member`.
  */
  @ApiModelProperty(value = "The role of the service account. Is either `owner` or `member`.")

  private String role;
 /**
   * The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public AuditLogServiceAccountCreatedData role(String role) {
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
    AuditLogServiceAccountCreatedData auditLogServiceAccountCreatedData = (AuditLogServiceAccountCreatedData) o;
    return Objects.equals(this.role, auditLogServiceAccountCreatedData.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceAccountCreatedData {\n");
    
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

