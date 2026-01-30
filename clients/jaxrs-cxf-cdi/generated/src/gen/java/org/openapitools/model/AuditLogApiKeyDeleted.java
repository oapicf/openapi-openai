package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The details for events with this &#x60;type&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The details for events with this `type`.")
public class AuditLogApiKeyDeleted   {
  
  private String id;

  /**
   * The tracking ID of the API key.
   **/
  public AuditLogApiKeyDeleted id(String id) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogApiKeyDeleted auditLogApiKeyDeleted = (AuditLogApiKeyDeleted) o;
    return Objects.equals(this.id, auditLogApiKeyDeleted.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogApiKeyDeleted {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

