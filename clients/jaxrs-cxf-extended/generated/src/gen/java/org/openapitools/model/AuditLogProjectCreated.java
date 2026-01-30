package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogProjectCreatedData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The details for events with this `type`.
 */
@ApiModel(description="The details for events with this `type`.")

public class AuditLogProjectCreated  {
  
 /**
  * The project ID.
  */
  @ApiModelProperty(value = "The project ID.")
  private String id;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProjectCreatedData data;
 /**
  * The project ID.
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
  public AuditLogProjectCreated id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  public AuditLogProjectCreatedData getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(AuditLogProjectCreatedData data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public AuditLogProjectCreated data(AuditLogProjectCreatedData data) {
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
    AuditLogProjectCreated auditLogProjectCreated = (AuditLogProjectCreated) o;
    return Objects.equals(this.id, auditLogProjectCreated.id) &&
        Objects.equals(this.data, auditLogProjectCreated.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectCreated {\n");
    
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

