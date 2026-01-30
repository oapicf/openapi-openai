package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectApiKeyOwner;



/**
 * Represents an individual API key in a project.
 **/

@ApiModel(description = "Represents an individual API key in a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectApiKey   {
  /**
   * The object type, which is always `organization.project.api_key`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_API_KEY("organization.project.api_key");

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

  @JsonProperty("redacted_value")
  private String redactedValue;

  @JsonProperty("name")
  private String name;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("owner")
  private ProjectApiKeyOwner owner;

  /**
   * The object type, which is always `organization.project.api_key`
   **/
  public ProjectApiKey _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.api_key`")
  @JsonProperty("object")
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

