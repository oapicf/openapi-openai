package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an individual project.
 */
public class Project implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier, which can be referenced in API endpoints
   */
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;organization.project&#x60;
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The name of the project. This appears in reporting.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The Unix timestamp (in seconds) of when the project was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
   */
  @JsonProperty("archived_at")
  private Integer archivedAt;

  /**
   * &#x60;active&#x60; or &#x60;archived&#x60;
   */
  @JsonProperty("status")
  private String status;

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;organization.project&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The name of the project. This appears in reporting.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was created.
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
   * @return archivedAt
   */
  public Integer getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

  /**
   * &#x60;active&#x60; or &#x60;archived&#x60;
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
