/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequested;



/**
 * The details for events with this `type`.
 */

@ApiModel(description = "The details for events with this `type`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogOrganizationUpdated   {
  
  private String id;
  private AuditLogOrganizationUpdatedChangesRequested changesRequested;

  /**
   * The organization ID.
   */
  public AuditLogOrganizationUpdated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The organization ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public AuditLogOrganizationUpdated changesRequested(AuditLogOrganizationUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

