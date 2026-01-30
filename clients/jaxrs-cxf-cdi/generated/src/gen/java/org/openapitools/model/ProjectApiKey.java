package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectApiKeyOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Represents an individual API key in a project.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Represents an individual API key in a project.")
public class ProjectApiKey   {
  

public enum ObjectEnum {

    @JsonProperty("organization.project.api_key") ORGANIZATION_PROJECT_API_KEY(String.valueOf("organization.project.api_key"));


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

  private String redactedValue;

  private String name;

  private Integer createdAt;

  private String id;

  private ProjectApiKeyOwner owner;

  /**
   * The object type, which is always &#x60;organization.project.api_key&#x60;
   **/
  public ProjectApiKey _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.api_key`")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  /**
   * The redacted value of the API key
   **/
  public ProjectApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The redacted value of the API key")
  @JsonProperty("redacted_value")
  @NotNull
  public String getRedactedValue() {
    return redactedValue;
  }
  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }


  /**
   * The name of the API key
   **/
  public ProjectApiKey name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the API key")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The Unix timestamp (in seconds) of when the API key was created
   **/
  public ProjectApiKey createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the API key was created")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * The identifier, which can be referenced in API endpoints
   **/
  public ProjectApiKey id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
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
  public ProjectApiKey owner(ProjectApiKeyOwner owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("owner")
  @NotNull
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
    return Objects.equals(this._object, projectApiKey._object) &&
        Objects.equals(this.redactedValue, projectApiKey.redactedValue) &&
        Objects.equals(this.name, projectApiKey.name) &&
        Objects.equals(this.createdAt, projectApiKey.createdAt) &&
        Objects.equals(this.id, projectApiKey.id) &&
        Objects.equals(this.owner, projectApiKey.owner);
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

