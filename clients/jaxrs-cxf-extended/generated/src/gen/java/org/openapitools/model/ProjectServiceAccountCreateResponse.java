package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectServiceAccountApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectServiceAccountCreateResponse  {
  
public enum ObjectEnum {

    @JsonProperty("organization.project.service_account") ORGANIZATION_PROJECT_SERVICE_ACCOUNT(String.valueOf("organization.project.service_account"));

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

  @ApiModelProperty(required = true, value = "")
  private ObjectEnum _object;

  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String name;

public enum RoleEnum {

    @JsonProperty("member") MEMBER(String.valueOf("member"));

    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Service accounts can only have one role of type `member`
  */
  @ApiModelProperty(required = true, value = "Service accounts can only have one role of type `member`")
  private RoleEnum role;

  @ApiModelProperty(required = true, value = "")
  private Integer createdAt;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProjectServiceAccountApiKey apiKey;
 /**
  * Get _object
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
  public ProjectServiceAccountCreateResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get id
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
  public ProjectServiceAccountCreateResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
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
  public ProjectServiceAccountCreateResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Service accounts can only have one role of type &#x60;member&#x60;
  * @return role
  */
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public ProjectServiceAccountCreateResponse role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * Get createdAt
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
  public ProjectServiceAccountCreateResponse createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get apiKey
  * @return apiKey
  */
  @JsonProperty("api_key")
  @NotNull
  public ProjectServiceAccountApiKey getApiKey() {
    return apiKey;
  }

  /**
   * Sets the <code>apiKey</code> property.
   */
 public void setApiKey(ProjectServiceAccountApiKey apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * Sets the <code>apiKey</code> property.
   */
  public ProjectServiceAccountCreateResponse apiKey(ProjectServiceAccountApiKey apiKey) {
    this.apiKey = apiKey;
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
    ProjectServiceAccountCreateResponse projectServiceAccountCreateResponse = (ProjectServiceAccountCreateResponse) o;
    return Objects.equals(this._object, projectServiceAccountCreateResponse._object) &&
        Objects.equals(this.id, projectServiceAccountCreateResponse.id) &&
        Objects.equals(this.name, projectServiceAccountCreateResponse.name) &&
        Objects.equals(this.role, projectServiceAccountCreateResponse.role) &&
        Objects.equals(this.createdAt, projectServiceAccountCreateResponse.createdAt) &&
        Objects.equals(this.apiKey, projectServiceAccountCreateResponse.apiKey);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

