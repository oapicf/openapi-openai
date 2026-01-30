package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an individual project.
 */
@ApiModel(description="Represents an individual project.")

public class Project  {
  
 /**
  * The identifier, which can be referenced in API endpoints
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")

  private String id;

public enum ObjectEnum {

ORGANIZATION_PROJECT(String.valueOf("organization.project"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always `organization.project`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project`")

  private ObjectEnum _object;

 /**
  * The name of the project. This appears in reporting.
  */
  @ApiModelProperty(required = true, value = "The name of the project. This appears in reporting.")

  private String name;

 /**
  * The Unix timestamp (in seconds) of when the project was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was created.")

  private Integer createdAt;

 /**
  * The Unix timestamp (in seconds) of when the project was archived or `null`.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the project was archived or `null`.")

  private Integer archivedAt;

public enum StatusEnum {

ACTIVE(String.valueOf("active")), ARCHIVED(String.valueOf("archived"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * `active` or `archived`
  */
  @ApiModelProperty(required = true, value = "`active` or `archived`")

  private StatusEnum status;
 /**
   * The identifier, which can be referenced in API endpoints
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;organization.project&#x60;
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Project _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The name of the project. This appears in reporting.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the project was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Project createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
   * @return archivedAt
  **/
  @JsonProperty("archived_at")
  public Integer getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

  public Project archivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

 /**
   * &#x60;active&#x60; or &#x60;archived&#x60;
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Project status(StatusEnum status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

