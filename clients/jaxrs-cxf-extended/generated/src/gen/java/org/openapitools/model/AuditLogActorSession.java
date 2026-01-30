package org.openapitools.model;

import org.openapitools.model.AuditLogActorUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The session in which the audit logged action was performed.
 */
@ApiModel(description="The session in which the audit logged action was performed.")

public class AuditLogActorSession  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AuditLogActorUser user;

 /**
  * The IP address from which the action was performed.
  */
  @ApiModelProperty(value = "The IP address from which the action was performed.")
  private String ipAddress;
 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public AuditLogActorUser getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(AuditLogActorUser user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public AuditLogActorSession user(AuditLogActorUser user) {
    this.user = user;
    return this;
  }

 /**
  * The IP address from which the action was performed.
  * @return ipAddress
  */
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the <code>ipAddress</code> property.
   */
 public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * Sets the <code>ipAddress</code> property.
   */
  public AuditLogActorSession ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

