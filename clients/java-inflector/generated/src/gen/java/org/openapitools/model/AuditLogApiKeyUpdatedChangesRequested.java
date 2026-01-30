package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * The payload used to update the API key.
 **/

@ApiModel(description = "The payload used to update the API key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogApiKeyUpdatedChangesRequested   {
  @JsonProperty("scopes")
  private List<String> scopes = null;

  /**
   * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyUpdatedChangesRequested auditLogApiKeyUpdatedChangesRequested = (AuditLogApiKeyUpdatedChangesRequested) o;
    return Objects.equals(scopes, auditLogApiKeyUpdatedChangesRequested.scopes);
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

