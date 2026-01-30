package org.openapitools.model;

import org.openapitools.model.AuditLogInviteSentData;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogInviteSent  {
  
 /**
  * The ID of the invite.
  */
  @ApiModelProperty(value = "The ID of the invite.")

  private String id;

  @ApiModelProperty(value = "")

  private AuditLogInviteSentData data;
 /**
   * The ID of the invite.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogInviteSent id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AuditLogInviteSentData getData() {
    return data;
  }

  public void setData(AuditLogInviteSentData data) {
    this.data = data;
  }

  public AuditLogInviteSent data(AuditLogInviteSentData data) {
    this.data = data;
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
    AuditLogInviteSent auditLogInviteSent = (AuditLogInviteSent) o;
    return Objects.equals(this.id, auditLogInviteSent.id) &&
        Objects.equals(this.data, auditLogInviteSent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogInviteSent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

