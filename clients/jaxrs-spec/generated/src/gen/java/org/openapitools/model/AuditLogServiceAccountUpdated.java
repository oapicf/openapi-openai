package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogServiceAccountUpdatedChangesRequested;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@ApiModel(description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_service_account_updated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogServiceAccountUpdated   {
  private String id;
  private AuditLogServiceAccountUpdatedChangesRequested changesRequested;

  public AuditLogServiceAccountUpdated() {
  }

  /**
   * The service account ID.
   **/
  public AuditLogServiceAccountUpdated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The service account ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AuditLogServiceAccountUpdated changesRequested(AuditLogServiceAccountUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changes_requested")
  @Valid public AuditLogServiceAccountUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  @JsonProperty("changes_requested")
  public void setChangesRequested(AuditLogServiceAccountUpdatedChangesRequested changesRequested) {
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
    AuditLogServiceAccountUpdated auditLogServiceAccountUpdated = (AuditLogServiceAccountUpdated) o;
    return Objects.equals(this.id, auditLogServiceAccountUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogServiceAccountUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceAccountUpdated {\n");
    
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

