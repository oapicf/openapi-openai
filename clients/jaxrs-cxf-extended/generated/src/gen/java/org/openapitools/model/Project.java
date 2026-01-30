package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonProperty("organization.project") ORGANIZATION_PROJECT(String.valueOf("organization.project"));

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

    @JsonProperty("active") ACTIVE(String.valueOf("active")),
    @JsonProperty("archived") ARCHIVED(String.valueOf("archived"));

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
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Project id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;organization.project&#x60;
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public Project _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The name of the project. This appears in reporting.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public Project name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the project was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public Project createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
  * @return archivedAt
  */
  @JsonProperty("archived_at")
  public Integer getArchivedAt() {
    return archivedAt;
  }

  /**
   * Sets the <code>archivedAt</code> property.
   */
 public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

  /**
   * Sets the <code>archivedAt</code> property.
   */
  public Project archivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

 /**
  * &#x60;active&#x60; or &#x60;archived&#x60;
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
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

