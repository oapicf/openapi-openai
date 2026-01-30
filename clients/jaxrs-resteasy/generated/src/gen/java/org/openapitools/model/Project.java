package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Represents an individual project.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Project   {
  
  private String id;

  /**
   * The object type, which is always &#x60;organization.project&#x60;
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT("organization.project");
    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ObjectEnum _object;
  private String name;
  private Integer createdAt;
  private Integer archivedAt;

  /**
   * &#x60;active&#x60; or &#x60;archived&#x60;
   */
  public enum StatusEnum {
    ACTIVE("active"),

        ARCHIVED("archived");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;

  /**
   * The identifier, which can be referenced in API endpoints
   **/
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;organization.project&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project`")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The name of the project. This appears in reporting.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the project. This appears in reporting.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was created.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
   **/
  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the project was archived or `null`.")
  @JsonProperty("archived_at")
  public Integer getArchivedAt() {
    return archivedAt;
  }
  public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

  /**
   * &#x60;active&#x60; or &#x60;archived&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "`active` or `archived`")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this._object, project._object) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.archivedAt, project.archivedAt) &&
        Objects.equals(this.status, project.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, name, createdAt, archivedAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

