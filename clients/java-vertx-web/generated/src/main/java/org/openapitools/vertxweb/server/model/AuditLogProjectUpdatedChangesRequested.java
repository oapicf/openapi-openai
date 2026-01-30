package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payload used to update the project.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogProjectUpdatedChangesRequested   {
  
  private String title;

  public AuditLogProjectUpdatedChangesRequested () {

  }

  public AuditLogProjectUpdatedChangesRequested (String title) {
    this.title = title;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogProjectUpdatedChangesRequested auditLogProjectUpdatedChangesRequested = (AuditLogProjectUpdatedChangesRequested) o;
    return Objects.equals(title, auditLogProjectUpdatedChangesRequested.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectUpdatedChangesRequested {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
