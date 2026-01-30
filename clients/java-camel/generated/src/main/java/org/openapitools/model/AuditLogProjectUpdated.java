package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogProjectUpdatedChangesRequested;
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

@Schema(name = "AuditLog_project_updated", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_project_updated")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogProjectUpdated {

  private String id;

  private AuditLogProjectUpdatedChangesRequested changesRequested;

  public AuditLogProjectUpdated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The project ID.
   * @return id
   */
  
  @Schema(name = "id", description = "The project ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogProjectUpdated changesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
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
  public AuditLogProjectUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  public void setChangesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
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
    AuditLogProjectUpdated auditLogProjectUpdated = (AuditLogProjectUpdated) o;
    return Objects.equals(this.id, auditLogProjectUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogProjectUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectUpdated {\n");
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

