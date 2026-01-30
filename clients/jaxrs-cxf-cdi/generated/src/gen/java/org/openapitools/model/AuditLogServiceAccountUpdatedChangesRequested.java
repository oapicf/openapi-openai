package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The payload used to updated the service account.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The payload used to updated the service account.")
public class AuditLogServiceAccountUpdatedChangesRequested   {
  
  private String role;

  /**
   * The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
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
    return Objects.equals(this.role, auditLogServiceAccountUpdatedChangesRequested.role);
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

