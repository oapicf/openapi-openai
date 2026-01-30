package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The session in which the audit logged action was performed.
 **/
@ApiModel(description = "The session in which the audit logged action was performed.")
@JsonTypeName("AuditLogActorSession")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActorSession   {
  private AuditLogActorUser user;
  private String ipAddress;

  public AuditLogActorSession() {
  }

  /**
   **/
  public AuditLogActorSession user(AuditLogActorUser user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  @Valid public AuditLogActorUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(AuditLogActorUser user) {
    this.user = user;
  }

  /**
   * The IP address from which the action was performed.
   **/
  public AuditLogActorSession ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @ApiModelProperty(value = "The IP address from which the action was performed.")
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }

  @JsonProperty("ip_address")
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogActorSession auditLogActorSession = (AuditLogActorSession) o;
    return Objects.equals(this.user, auditLogActorSession.user) &&
        Objects.equals(this.ipAddress, auditLogActorSession.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActorSession {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

