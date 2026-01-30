package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogInviteSentData;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details for events with this &#x60;type&#x60;.
 */

@Schema(name = "AuditLog_invite_sent", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_invite_sent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogInviteSent {

  private @Nullable String id;

  private @Nullable AuditLogInviteSentData data;

  public AuditLogInviteSent id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the invite.
   * @return id
   */
  
  @Schema(name = "id", description = "The ID of the invite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AuditLogInviteSent data(@Nullable AuditLogInviteSentData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable AuditLogInviteSentData getData() {
    return data;
  }

  public void setData(@Nullable AuditLogInviteSentData data) {
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

