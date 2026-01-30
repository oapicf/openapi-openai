package org.openapitools.model;

import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequested;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogOrganizationUpdated  {
  
 /**
  * The organization ID.
  */
  @ApiModelProperty(value = "The organization ID.")

  private String id;

  @ApiModelProperty(value = "")

  private AuditLogOrganizationUpdatedChangesRequested changesRequested;
 /**
   * The organization ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogOrganizationUpdated id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get changesRequested
   * @return changesRequested
  **/
  @JsonProperty("changes_requested")
  public AuditLogOrganizationUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  public void setChangesRequested(AuditLogOrganizationUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
  }

  public AuditLogOrganizationUpdated changesRequested(AuditLogOrganizationUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
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
    return Objects.equals(this.id, auditLogOrganizationUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogOrganizationUpdated.changesRequested);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

