package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The payload used to update the API key.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The payload used to update the API key.")
public class AuditLogApiKeyUpdatedChangesRequested   {
  
  private List<String> scopes = new ArrayList<>();

  /**
   * A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60;
   **/
  public AuditLogApiKeyUpdatedChangesRequested scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  
  @ApiModelProperty(value = "A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`")
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public AuditLogApiKeyUpdatedChangesRequested addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
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

