package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ProjectApiKeyOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents an individual API key in a project.
 */
@ApiModel(description = "Represents an individual API key in a project.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public ProjectApiKey _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.project.api_key`
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.project.api_key`")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

  /**
   * The redacted value of the API key
   * @return redactedValue
   */
  @ApiModelProperty(required = true, value = "The redacted value of the API key")
  public String getRedactedValue() {
    return redactedValue;
  }

  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

  public ProjectApiKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the API key
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name of the API key")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectApiKey createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the API key was created
   * @return createdAt
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the API key was created")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectApiKey owner(ProjectApiKeyOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @ApiModelProperty(required = true, value = "")
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

