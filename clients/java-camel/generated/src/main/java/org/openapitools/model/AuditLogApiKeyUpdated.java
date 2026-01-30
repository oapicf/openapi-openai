package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogApiKeyUpdatedChangesRequested;
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

@Schema(name = "AuditLog_api_key_updated", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_api_key_updated")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogApiKeyUpdated {

  private String id;

  private AuditLogApiKeyUpdatedChangesRequested changesRequested;

  public AuditLogApiKeyUpdated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking ID of the API key.
   * @return id
   */
  
  @Schema(name = "id", description = "The tracking ID of the API key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogApiKeyUpdated changesRequested(AuditLogApiKeyUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  /**
   * Get changesRequested
   * @return changesRequested
   */
  @Valid 
  @Schema(name = "changes_requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changes_requested")
  public AuditLogApiKeyUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  public void setChangesRequested(AuditLogApiKeyUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyUpdated auditLogApiKeyUpdated = (AuditLogApiKeyUpdated) o;
    return Objects.equals(this.id, auditLogApiKeyUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogApiKeyUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyUpdated {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    changesRequested: ").append(toIndentedString(changesRequested)).append("\n");
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

