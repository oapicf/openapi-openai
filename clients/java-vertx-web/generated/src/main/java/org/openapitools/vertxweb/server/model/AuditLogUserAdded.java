package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuditLogUserAddedData;

/**
 * The details for events with this &#x60;type&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogUserAdded   {
  
  private String id;
  private AuditLogUserAddedData data;

  public AuditLogUserAdded () {

  }

  public AuditLogUserAdded (String id, AuditLogUserAddedData data) {
    this.id = id;
    this.data = data;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("data")
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
    return Objects.equals(id, auditLogUserAdded.id) &&
        Objects.equals(data, auditLogUserAdded.data);
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
