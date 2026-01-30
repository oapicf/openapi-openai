package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AdminApiKeyOwner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdminApiKey
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdminApiKey {

  private String _object;

  private String id;

  private String name;

  private String redactedValue;

  private String value;

  private Long createdAt;

  private AdminApiKeyOwner owner;

  public AdminApiKey _object(String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  
  @Schema(name = "object", example = "organization.admin_api_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  public AdminApiKey id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "key_abc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdminApiKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Administration Key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdminApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

  /**
   * Get redactedValue
   * @return redactedValue
   */
  
  @Schema(name = "redacted_value", example = "sk-admin...def", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redacted_value")
  public String getRedactedValue() {
    return redactedValue;
  }

  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

  public AdminApiKey value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @Schema(name = "value", example = "sk-admin-1234abcd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AdminApiKey createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  
  @Schema(name = "created_at", example = "1711471533", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public AdminApiKey owner(AdminApiKeyOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public AdminApiKeyOwner getOwner() {
    return owner;
  }

  public void setOwner(AdminApiKeyOwner owner) {
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
    AdminApiKey adminApiKey = (AdminApiKey) o;
    return Objects.equals(this._object, adminApiKey._object) &&
        Objects.equals(this.id, adminApiKey.id) &&
        Objects.equals(this.name, adminApiKey.name) &&
        Objects.equals(this.redactedValue, adminApiKey.redactedValue) &&
        Objects.equals(this.value, adminApiKey.value) &&
        Objects.equals(this.createdAt, adminApiKey.createdAt) &&
        Objects.equals(this.owner, adminApiKey.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, redactedValue, value, createdAt, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminApiKey {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redactedValue: ").append(toIndentedString(redactedValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

