package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectServiceAccountApiKey
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectServiceAccountApiKey {

  /**
   * The object type, which is always `organization.project.service_account.api_key`
   */
  public enum ObjectEnum {
    ORGANIZATION_PROJECT_SERVICE_ACCOUNT_API_KEY("organization.project.service_account.api_key");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private String value;

  private String name;

  private Integer createdAt;

  private String id;

  public ProjectServiceAccountApiKey() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectServiceAccountApiKey(ObjectEnum _object, String value, String name, Integer createdAt, String id) {
    this._object = _object;
    this.value = value;
    this.name = name;
    this.createdAt = createdAt;
    this.id = id;
  }

  public ProjectServiceAccountApiKey _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.project.service_account.api_key`
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `organization.project.service_account.api_key`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public ProjectServiceAccountApiKey value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ProjectServiceAccountApiKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectServiceAccountApiKey createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @NotNull 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectServiceAccountApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectServiceAccountApiKey projectServiceAccountApiKey = (ProjectServiceAccountApiKey) o;
    return Objects.equals(this._object, projectServiceAccountApiKey._object) &&
        Objects.equals(this.value, projectServiceAccountApiKey.value) &&
        Objects.equals(this.name, projectServiceAccountApiKey.name) &&
        Objects.equals(this.createdAt, projectServiceAccountApiKey.createdAt) &&
        Objects.equals(this.id, projectServiceAccountApiKey.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, value, name, createdAt, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectServiceAccountApiKey {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

