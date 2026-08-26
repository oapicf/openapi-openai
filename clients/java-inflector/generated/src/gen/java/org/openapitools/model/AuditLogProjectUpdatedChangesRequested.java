package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The payload used to update the project.
 **/

@ApiModel(description = "The payload used to update the project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-26T05:15:28.776347668Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuditLogProjectUpdatedChangesRequested   {
  @JsonProperty("title")
  private String title;

  /**
   * The title of the project as seen on the dashboard.
   **/
  public AuditLogProjectUpdatedChangesRequested title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The title of the project as seen on the dashboard.")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

