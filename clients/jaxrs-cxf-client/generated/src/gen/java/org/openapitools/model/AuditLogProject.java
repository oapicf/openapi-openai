package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */
@ApiModel(description="The project that the action was scoped to. Absent for actions not scoped to projects.")

public class AuditLogProject  {
  
 /**
  * The project ID.
  */
  @ApiModelProperty(value = "The project ID.")

  private String id;

 /**
  * The project title.
  */
  @ApiModelProperty(value = "The project title.")

  private String name;
 /**
   * The project ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLogProject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The project title.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogProject name(String name) {
    this.name = name;
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
    AuditLogProject auditLogProject = (AuditLogProject) o;
    return Objects.equals(this.id, auditLogProject.id) &&
        Objects.equals(this.name, auditLogProject.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogProject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

