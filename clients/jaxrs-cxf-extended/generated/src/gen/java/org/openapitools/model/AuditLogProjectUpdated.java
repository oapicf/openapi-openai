package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogProjectUpdatedChangesRequested;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogProjectUpdated  {
  
 /**
  * The project ID.
  */
  @ApiModelProperty(value = "The project ID.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProjectUpdatedChangesRequested changesRequested;
 /**
  * The project ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AuditLogProjectUpdated id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get changesRequested
  * @return changesRequested
  */
  @JsonProperty("changes_requested")
  public AuditLogProjectUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }

  /**
   * Sets the <code>changesRequested</code> property.
   */
 public void setChangesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
  }

  /**
   * Sets the <code>changesRequested</code> property.
   */
  public AuditLogProjectUpdated changesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

