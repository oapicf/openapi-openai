package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogUserAddedData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogUserAdded  {
  
 /**
  * The user ID.
  */
  @ApiModelProperty(value = "The user ID.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogUserAddedData data;
 /**
  * The user ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AuditLogUserAdded id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public AuditLogUserAddedData getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(AuditLogUserAddedData data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public AuditLogUserAdded data(AuditLogUserAddedData data) {
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
    AuditLogUserAdded auditLogUserAdded = (AuditLogUserAdded) o;
    return Objects.equals(this.id, auditLogUserAdded.id) &&
        Objects.equals(this.data, auditLogUserAdded.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogUserAdded {\n");
    
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

