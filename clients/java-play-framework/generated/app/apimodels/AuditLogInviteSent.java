package apimodels;

import apimodels.AuditLogInviteSentData;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The details for events with this &#x60;type&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogInviteSent   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("data")
  @Valid

  private AuditLogInviteSentData data;

  public AuditLogInviteSent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the invite.
   * @return id
  **/
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
    return Objects.equals(id, auditLogInviteSent.id) &&
        Objects.equals(data, auditLogInviteSent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

