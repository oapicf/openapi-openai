package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents an individual project.
 */
@ApiModel(description = "Represents an individual project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Project   {
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always `organization.project`
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

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("name")
  private String name;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("archived_at")
  private Integer archivedAt;

  /**
   * `active` or `archived`
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

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public Project id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `organization.project`
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project`")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project. This appears in reporting.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the project. This appears in reporting.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the project was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the project was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public Project archivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the project was archived or `null`.
   * @return archivedAt
  **/
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the project was archived or `null`.")
  public Integer getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

  public Project status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * `active` or `archived`
   * @return status
  **/
  @ApiModelProperty(required = true, value = "`active` or `archived`")
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

