package org.openapitools.model;

import org.openapitools.model.AuditLogServiceAccountCreatedData;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogServiceAccountCreated  {
  
 /**
  * The service account ID.
  */
  @ApiModelProperty(value = "The service account ID.")

  private String id;

  @ApiModelProperty(value = "")

  private AuditLogServiceAccountCreatedData data;
 /**
   * The service account ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogServiceAccountCreated id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public AuditLogServiceAccountCreatedData getData() {
    return data;
  }

  public void setData(AuditLogServiceAccountCreatedData data) {
    this.data = data;
  }

  public AuditLogServiceAccountCreated data(AuditLogServiceAccountCreatedData data) {
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
    AuditLogServiceAccountCreated auditLogServiceAccountCreated = (AuditLogServiceAccountCreated) o;
    return Objects.equals(this.id, auditLogServiceAccountCreated.id) &&
        Objects.equals(this.data, auditLogServiceAccountCreated.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceAccountCreated {\n");
    
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

