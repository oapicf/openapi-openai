package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The payload used to create the API key.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogApiKeyCreatedData   {
  
  private List<String> scopes = new ArrayList<>();

  public AuditLogApiKeyCreatedData () {

  }

  public AuditLogApiKeyCreatedData (List<String> scopes) {
    this.scopes = scopes;
  }

    
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
    AuditLogApiKeyCreatedData auditLogApiKeyCreatedData = (AuditLogApiKeyCreatedData) o;
    return Objects.equals(scopes, auditLogApiKeyCreatedData.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyCreatedData {\n");
    
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
