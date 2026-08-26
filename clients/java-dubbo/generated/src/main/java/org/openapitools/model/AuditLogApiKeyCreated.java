package org.openapitools.model;

import org.openapitools.model.AuditLogApiKeyCreatedData;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The details for events with this &#x60;type&#x60;.
 */
public class AuditLogApiKeyCreated implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The tracking ID of the API key.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("data")
  private AuditLogApiKeyCreatedData data;

  /**
   * The tracking ID of the API key.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return data
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
