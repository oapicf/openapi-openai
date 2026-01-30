package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The payload used to create the API key.
 */
@ApiModel(description="The payload used to create the API key.")

public class AuditLogApiKeyCreatedData  {
  
 /**
  * A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  */
  @ApiModelProperty(value = "A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`")
  private List<String> scopes = new ArrayList<>();
 /**
  * A list of scopes allowed for the API key, e.g. &#x60;[\&quot;api.model.request\&quot;]&#x60;
  * @return scopes
  */
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
 public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
  public AuditLogApiKeyCreatedData scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Adds a new item to the <code>scopes</code> list.
   */
  public AuditLogApiKeyCreatedData addScopesItem(String scopesItem) {
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
    AuditLogApiKeyCreatedData auditLogApiKeyCreatedData = (AuditLogApiKeyCreatedData) o;
    return Objects.equals(this.scopes, auditLogApiKeyCreatedData.scopes);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

