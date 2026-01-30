package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The payload used to update the API key.
 */

@Schema(name = "AuditLog_api_key_updated_changes_requested", description = "The payload used to update the API key.")
@JsonTypeName("AuditLog_api_key_updated_changes_requested")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogApiKeyUpdatedChangesRequested {

  @Valid
  private List<String> scopes = new ArrayList<>();

  public AuditLogApiKeyUpdatedChangesRequested scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AuditLogApiKeyUpdatedChangesRequested addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
   * @return scopes
   */
  
  @Schema(name = "scopes", description = "A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyUpdatedChangesRequested auditLogApiKeyUpdatedChangesRequested = (AuditLogApiKeyUpdatedChangesRequested) o;
    return Objects.equals(this.scopes, auditLogApiKeyUpdatedChangesRequested.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyUpdatedChangesRequested {\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

