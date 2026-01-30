package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ProjectApiKeyOwner;

/**
 * Represents an individual API key in a project.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectApiKey   {
  


  public enum ObjectEnum {
    ORGANIZATION_PROJECT_API_KEY("organization.project.api_key");

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
  private String redactedValue;
  private String name;
  private Integer createdAt;
  private String id;
  private ProjectApiKeyOwner owner;

  public ProjectApiKey () {

  }

  public ProjectApiKey (ObjectEnum _object, String redactedValue, String name, Integer createdAt, String id, ProjectApiKeyOwner owner) {
    this._object = _object;
    this.redactedValue = redactedValue;
    this.name = name;
    this.createdAt = createdAt;
    this.id = id;
    this.owner = owner;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("redacted_value")
  public String getRedactedValue() {
    return redactedValue;
  }
  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("owner")
  public ProjectApiKeyOwner getOwner() {
    return owner;
  }
  public void setOwner(ProjectApiKeyOwner owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectApiKey projectApiKey = (ProjectApiKey) o;
    return Objects.equals(_object, projectApiKey._object) &&
        Objects.equals(redactedValue, projectApiKey.redactedValue) &&
        Objects.equals(name, projectApiKey.name) &&
        Objects.equals(createdAt, projectApiKey.createdAt) &&
        Objects.equals(id, projectApiKey.id) &&
        Objects.equals(owner, projectApiKey.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, redactedValue, name, createdAt, id, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKey {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    redactedValue: ").append(toIndentedString(redactedValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
