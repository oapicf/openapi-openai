package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogApiKeyCreatedData;
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
@JsonTypeName("AuditLog_api_key_created")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogApiKeyCreated   {
  private String id;
  private AuditLogApiKeyCreatedData data;

  public AuditLogApiKeyCreated() {
  }

  /**
   * The tracking ID of the API key.
   **/
  public AuditLogApiKeyCreated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The tracking ID of the API key.")
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
  public AuditLogApiKeyCreated data(AuditLogApiKeyCreatedData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public AuditLogApiKeyCreatedData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(AuditLogApiKeyCreatedData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyCreated auditLogApiKeyCreated = (AuditLogApiKeyCreated) o;
    return Objects.equals(this.id, auditLogApiKeyCreated.id) &&
        Objects.equals(this.data, auditLogApiKeyCreated.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyCreated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

