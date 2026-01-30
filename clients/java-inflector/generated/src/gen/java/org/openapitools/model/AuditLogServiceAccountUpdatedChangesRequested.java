package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The payload used to updated the service account.
 **/

@ApiModel(description = "The payload used to updated the service account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogServiceAccountUpdatedChangesRequested   {
  @JsonProperty("role")
  private String role;

  /**
   * The role of the service account. Is either `owner` or `member`.
   **/
  public AuditLogServiceAccountUpdatedChangesRequested role(String role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "The role of the service account. Is either `owner` or `member`.")
  @JsonProperty("role")
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
    AuditLogServiceAccountUpdatedChangesRequested auditLogServiceAccountUpdatedChangesRequested = (AuditLogServiceAccountUpdatedChangesRequested) o;
    return Objects.equals(role, auditLogServiceAccountUpdatedChangesRequested.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceAccountUpdatedChangesRequested {\n");
    
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

