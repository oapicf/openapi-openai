package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogApiKeyCreatedData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogApiKeyCreated  {
  
 /**
  * The tracking ID of the API key.
  */
  @ApiModelProperty(value = "The tracking ID of the API key.")

  private String id;

  @ApiModelProperty(value = "")

  @Valid

  private AuditLogApiKeyCreatedData data;
 /**
   * The tracking ID of the API key.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogApiKeyCreated id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AuditLogApiKeyCreatedData getData() {
    return data;
  }

  public void setData(AuditLogApiKeyCreatedData data) {
    this.data = data;
  }

  public AuditLogApiKeyCreated data(AuditLogApiKeyCreatedData data) {
    this.data = data;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

