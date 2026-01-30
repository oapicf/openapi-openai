package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogRateLimitUpdatedChangesRequested;
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

@Schema(name = "AuditLog_rate_limit_updated", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_rate_limit_updated")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogRateLimitUpdated {

  private @Nullable String id;

  private @Nullable AuditLogRateLimitUpdatedChangesRequested changesRequested;

  public AuditLogRateLimitUpdated id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The rate limit ID
   * @return id
   */
  
  @Schema(name = "id", description = "The rate limit ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AuditLogRateLimitUpdated changesRequested(@Nullable AuditLogRateLimitUpdatedChangesRequested changesRequested) {
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
  public @Nullable AuditLogRateLimitUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  public void setChangesRequested(@Nullable AuditLogRateLimitUpdatedChangesRequested changesRequested) {
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
    AuditLogRateLimitUpdated auditLogRateLimitUpdated = (AuditLogRateLimitUpdated) o;
    return Objects.equals(this.id, auditLogRateLimitUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogRateLimitUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogRateLimitUpdated {\n");
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

