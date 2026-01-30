package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuditLogOrganizationUpdatedChangesRequested;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogOrganizationUpdated   {
  
  private String id;
  private AuditLogOrganizationUpdatedChangesRequested changesRequested;

  public AuditLogOrganizationUpdated () {

  }

  public AuditLogOrganizationUpdated (String id, AuditLogOrganizationUpdatedChangesRequested changesRequested) {
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
  public AuditLogOrganizationUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }
  public void setChangesRequested(AuditLogOrganizationUpdatedChangesRequested changesRequested) {
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
    AuditLogOrganizationUpdated auditLogOrganizationUpdated = (AuditLogOrganizationUpdated) o;
    return Objects.equals(id, auditLogOrganizationUpdated.id) &&
        Objects.equals(changesRequested, auditLogOrganizationUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogOrganizationUpdated {\n");
    
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
