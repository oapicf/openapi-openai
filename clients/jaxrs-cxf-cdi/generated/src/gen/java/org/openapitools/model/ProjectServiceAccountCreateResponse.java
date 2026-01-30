package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccountApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ProjectServiceAccountCreateResponse   {
  

public enum ObjectEnum {

    @JsonProperty("organization.project.service_account") ORGANIZATION_PROJECT_SERVICE_ACCOUNT(String.valueOf("organization.project.service_account"));


    private String value;

    ObjectEnum(String v) {
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

  private ObjectEnum _object;

  private String id;

  private String name;


public enum RoleEnum {

    @JsonProperty("member") MEMBER(String.valueOf("member"));


    private String value;

    RoleEnum(String v) {
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

  private RoleEnum role;

  private Integer createdAt;

  private ProjectServiceAccountApiKey apiKey;

  /**
   **/
  public ProjectServiceAccountCreateResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("object")
  @NotNull
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
  @NotNull
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
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Service accounts can only have one role of type &#x60;member&#x60;
   **/
  public ProjectServiceAccountCreateResponse role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Service accounts can only have one role of type `member`")
  @JsonProperty("role")
  @NotNull
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
  @NotNull
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
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

