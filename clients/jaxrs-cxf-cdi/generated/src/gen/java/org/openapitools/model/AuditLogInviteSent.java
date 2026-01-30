package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogInviteSentData;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The details for events with this &#x60;type&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The details for events with this `type`.")
public class AuditLogInviteSent   {
  
  private String id;

  private AuditLogInviteSentData data;

  /**
   * The ID of the invite.
   **/
  public AuditLogInviteSent id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the invite.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public AuditLogInviteSent data(AuditLogInviteSentData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public AuditLogInviteSentData getData() {
    return data;
  }
  public void setData(AuditLogInviteSentData data) {
    this.data = data;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

