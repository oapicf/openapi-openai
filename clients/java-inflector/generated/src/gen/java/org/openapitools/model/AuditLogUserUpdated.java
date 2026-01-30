package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogUserUpdatedChangesRequested;



/**
 * The details for events with this &#x60;type&#x60;.
 **/

@ApiModel(description = "The details for events with this `type`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogUserUpdated   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("changes_requested")
  private AuditLogUserUpdatedChangesRequested changesRequested;

  /**
   * The project ID.
   **/
  public AuditLogUserUpdated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The project ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AuditLogUserUpdated changesRequested(AuditLogUserUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changes_requested")
  public AuditLogUserUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }
  public void setChangesRequested(AuditLogUserUpdatedChangesRequested changesRequested) {
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
    AuditLogUserUpdated auditLogUserUpdated = (AuditLogUserUpdated) o;
    return Objects.equals(id, auditLogUserUpdated.id) &&
        Objects.equals(changesRequested, auditLogUserUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogUserUpdated {\n");
    
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

