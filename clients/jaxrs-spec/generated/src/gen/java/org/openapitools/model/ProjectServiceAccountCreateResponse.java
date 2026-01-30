package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccountApiKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ProjectServiceAccountCreateResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectServiceAccountCreateResponse   {
  public enum ObjectEnum {

    ORGANIZATION_PROJECT_SERVICE_ACCOUNT(String.valueOf("organization.project.service_account"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

    MEMBER(String.valueOf("member"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public ProjectServiceAccountCreateResponse() {
  }

  @JsonCreator
  public ProjectServiceAccountCreateResponse(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "role") RoleEnum role,
    @JsonProperty(required = true, value = "created_at") Integer createdAt,
    @JsonProperty(required = true, value = "api_key") ProjectServiceAccountApiKey apiKey
  ) {
    this._object = _object;
    this.id = id;
    this.name = name;
    this.role = role;
    this.createdAt = createdAt;
    this.apiKey = apiKey;
  }

  /**
   **/
  public ProjectServiceAccountCreateResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
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
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "role")
  @NotNull public RoleEnum getRole() {
    return role;
  }

  @JsonProperty(required = true, value = "role")
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
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Integer getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
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
  @JsonProperty(required = true, value = "api_key")
  @NotNull @Valid public ProjectServiceAccountApiKey getApiKey() {
    return apiKey;
  }

  @JsonProperty(required = true, value = "api_key")
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

