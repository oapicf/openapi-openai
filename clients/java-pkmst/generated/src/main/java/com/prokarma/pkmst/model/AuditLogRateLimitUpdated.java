package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AuditLogRateLimitUpdatedChangesRequested;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The details for events with this &#x60;type&#x60;.
 */
@ApiModel(description = "The details for events with this `type`.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogRateLimitUpdated   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("changes_requested")
  private AuditLogRateLimitUpdatedChangesRequested changesRequested;

  public AuditLogRateLimitUpdated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The rate limit ID
   * @return id
   */
  @ApiModelProperty(value = "The rate limit ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogRateLimitUpdated changesRequested(AuditLogRateLimitUpdatedChangesRequested changesRequested) {
    this.changesRequested = changesRequested;
    return this;
  }

  /**
   * Get changesRequested
   * @return changesRequested
   */
  @ApiModelProperty(value = "")
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

