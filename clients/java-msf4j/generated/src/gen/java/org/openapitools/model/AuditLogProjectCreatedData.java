package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The payload used to create the project.
 */
@ApiModel(description = "The payload used to create the project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogProjectCreatedData   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("title")
  private String title;

  public AuditLogProjectCreatedData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The project name.
   * @return name
  **/
  @ApiModelProperty(value = "The project name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogProjectCreatedData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the project as seen on the dashboard.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the project as seen on the dashboard.")
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
    AuditLogProjectCreatedData auditLogProjectCreatedData = (AuditLogProjectCreatedData) o;
    return Objects.equals(this.name, auditLogProjectCreatedData.name) &&
        Objects.equals(this.title, auditLogProjectCreatedData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProjectCreatedData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

