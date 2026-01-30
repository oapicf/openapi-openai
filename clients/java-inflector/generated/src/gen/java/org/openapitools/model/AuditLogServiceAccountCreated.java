package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogServiceAccountCreatedData;



/**
 * The details for events with this &#x60;type&#x60;.
 **/

@ApiModel(description = "The details for events with this `type`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogServiceAccountCreated   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("data")
  private AuditLogServiceAccountCreatedData data;

  /**
   * The service account ID.
   **/
  public AuditLogServiceAccountCreated id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The service account ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AuditLogServiceAccountCreated data(AuditLogServiceAccountCreatedData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public AuditLogServiceAccountCreatedData getData() {
    return data;
  }
  public void setData(AuditLogServiceAccountCreatedData data) {
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
    AuditLogServiceAccountCreated auditLogServiceAccountCreated = (AuditLogServiceAccountCreated) o;
    return Objects.equals(id, auditLogServiceAccountCreated.id) &&
        Objects.equals(data, auditLogServiceAccountCreated.data);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

