package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuditLogRateLimitUpdatedChangesRequested;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogRateLimitUpdated   {
  
  private String id;
  private AuditLogRateLimitUpdatedChangesRequested changesRequested;

  public AuditLogRateLimitUpdated () {

  }

  public AuditLogRateLimitUpdated (String id, AuditLogRateLimitUpdatedChangesRequested changesRequested) {
    this.id = id;
    this.changesRequested = changesRequested;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("changes_requested")
  public AuditLogRateLimitUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }
  public void setChangesRequested(AuditLogRateLimitUpdatedChangesRequested changesRequested) {
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
    return Objects.equals(id, auditLogRateLimitUpdated.id) &&
        Objects.equals(changesRequested, auditLogRateLimitUpdated.changesRequested);
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
