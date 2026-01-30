package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogApiKeyUpdatedChangesRequested;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The details for events with this &#x60;type&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The details for events with this `type`.")
public class AuditLogApiKeyUpdated   {
  
  private String id;

  private AuditLogApiKeyUpdatedChangesRequested changesRequested;

  /**
   * The tracking ID of the API key.
   **/
  public AuditLogApiKeyUpdated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The tracking ID of the API key.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public AuditLogApiKeyUpdated changesRequested(AuditLogApiKeyUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("changes_requested")
  public AuditLogApiKeyUpdatedChangesRequested getChangesRequested() {
    return changesRequested;
  }
  public void setChangesRequested(AuditLogApiKeyUpdatedChangesRequested changesRequested) {
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
    AuditLogApiKeyUpdated auditLogApiKeyUpdated = (AuditLogApiKeyUpdated) o;
    return Objects.equals(this.id, auditLogApiKeyUpdated.id) &&
        Objects.equals(this.changesRequested, auditLogApiKeyUpdated.changesRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changesRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyUpdated {\n");
    
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

