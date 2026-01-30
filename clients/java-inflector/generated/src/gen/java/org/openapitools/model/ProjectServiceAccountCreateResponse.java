package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccountApiKey;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectServiceAccountCreateResponse   {
  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_SERVICE_ACCOUNT("organization.project.service_account");

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

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  /**
   * Service accounts can only have one role of type `member`
   */
  public enum RoleEnum {
    MEMBER("member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("api_key")
  private ProjectServiceAccountApiKey apiKey;

  /**
   **/
  public ProjectServiceAccountCreateResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  public ProjectServiceAccountCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public ProjectServiceAccountCreateResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Service accounts can only have one role of type `member`
   **/
  public ProjectServiceAccountCreateResponse role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Service accounts can only have one role of type `member`")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   **/
  public ProjectServiceAccountCreateResponse createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public ProjectServiceAccountCreateResponse apiKey(ProjectServiceAccountApiKey apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

