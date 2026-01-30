package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogInviteSentData;

/**
 * The details for events with this &#x60;type&#x60;.
 */
@ApiModel(description = "The details for events with this `type`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogInviteSent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("data")
  private AuditLogInviteSentData data;

  public AuditLogInviteSent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the invite.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the invite.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogInviteSent data(AuditLogInviteSentData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
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

