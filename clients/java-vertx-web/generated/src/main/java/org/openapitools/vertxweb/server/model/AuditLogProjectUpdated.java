package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuditLogProjectUpdatedChangesRequested;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogProjectUpdated   {
  
  private String id;
  private AuditLogProjectUpdatedChangesRequested changesRequested;

  public AuditLogProjectUpdated () {

  }

  public AuditLogProjectUpdated (String id, AuditLogProjectUpdatedChangesRequested changesRequested) {
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
    return Objects.equals(id, auditLogProjectUpdated.id) &&
        Objects.equals(changesRequested, auditLogProjectUpdated.changesRequested);
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
