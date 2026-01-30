package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AuditLogApiKeyCreatedData;
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
public class AuditLogApiKeyCreated   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("data")
  private AuditLogApiKeyCreatedData data;

  public AuditLogApiKeyCreated id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The tracking ID of the API key.
   * @return id
   */
  @ApiModelProperty(value = "The tracking ID of the API key.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogApiKeyCreated data(AuditLogApiKeyCreatedData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(value = "")
  public AuditLogApiKeyCreatedData getData() {
    return data;
  }

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

