package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents an individual project.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project   {
  
  private String id;


  public enum ObjectEnum {
    ORGANIZATION_PROJECT("organization.project");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private String name;
  private Integer createdAt;
  private Integer archivedAt;


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
      return value;
    }
  }

  private StatusEnum status;

  public Project () {

  }

  public Project (String id, ObjectEnum _object, String name, Integer createdAt, Integer archivedAt, StatusEnum status) {
    this.id = id;
    this._object = _object;
    this.name = name;
    this.createdAt = createdAt;
    this.archivedAt = archivedAt;
    this.status = status;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("archived_at")
  public Integer getArchivedAt() {
    return archivedAt;
  }
  public void setArchivedAt(Integer archivedAt) {
    this.archivedAt = archivedAt;
  }

    
  @JsonProperty("status")
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
    return Objects.equals(id, project.id) &&
        Objects.equals(_object, project._object) &&
        Objects.equals(name, project.name) &&
        Objects.equals(createdAt, project.createdAt) &&
        Objects.equals(archivedAt, project.archivedAt) &&
        Objects.equals(status, project.status);
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
