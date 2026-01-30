package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The payload used to create the project.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The payload used to create the project.")
public class AuditLogProjectCreatedData   {
  
  private String name;

  private String title;

  /**
   * The project name.
   **/
  public AuditLogProjectCreatedData name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The project name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The title of the project as seen on the dashboard.
   **/
  public AuditLogProjectCreatedData title(String title) {
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

