package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AuditLogUserAddedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The details for events with this &#x60;type&#x60;.
 */
@ApiModel(description = "The details for events with this `type`.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogUserAdded   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("data")
  private AuditLogUserAddedData data;

  public AuditLogUserAdded id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The user ID.
   * @return id
   */
  @ApiModelProperty(value = "The user ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogUserAdded data(AuditLogUserAddedData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(value = "")
  public AuditLogUserAddedData getData() {
    return data;
  }

  public void setData(AuditLogUserAddedData data) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

