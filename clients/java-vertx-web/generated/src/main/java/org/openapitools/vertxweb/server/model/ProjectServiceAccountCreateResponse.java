package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ProjectServiceAccountApiKey;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectServiceAccountCreateResponse   {
  


  public enum ObjectEnum {
    ORGANIZATION_PROJECT_SERVICE_ACCOUNT("organization.project.service_account");

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
  private String id;
  private String name;


  public enum RoleEnum {
    MEMBER("member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private Integer createdAt;
  private ProjectServiceAccountApiKey apiKey;

  public ProjectServiceAccountCreateResponse () {

  }

  public ProjectServiceAccountCreateResponse (ObjectEnum _object, String id, String name, RoleEnum role, Integer createdAt, ProjectServiceAccountApiKey apiKey) {
    this._object = _object;
    this.id = id;
    this.name = name;
    this.role = role;
    this.createdAt = createdAt;
    this.apiKey = apiKey;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("api_key")
  public ProjectServiceAccountApiKey getApiKey() {
    return apiKey;
  }
  public void setApiKey(ProjectServiceAccountApiKey apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectServiceAccountCreateResponse projectServiceAccountCreateResponse = (ProjectServiceAccountCreateResponse) o;
    return Objects.equals(_object, projectServiceAccountCreateResponse._object) &&
        Objects.equals(id, projectServiceAccountCreateResponse.id) &&
        Objects.equals(name, projectServiceAccountCreateResponse.name) &&
        Objects.equals(role, projectServiceAccountCreateResponse.role) &&
        Objects.equals(createdAt, projectServiceAccountCreateResponse.createdAt) &&
        Objects.equals(apiKey, projectServiceAccountCreateResponse.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, role, createdAt, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectServiceAccountCreateResponse {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
