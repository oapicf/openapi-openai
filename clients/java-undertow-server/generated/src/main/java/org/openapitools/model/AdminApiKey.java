/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdminApiKeyOwner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdminApiKey   {
  
  private String _object;
  private String id;
  private String name;
  private String redactedValue;
  private String value;
  private Long createdAt;
  private AdminApiKeyOwner owner;

  /**
   */
  public AdminApiKey _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(example = "organization.admin_api_key", value = "")
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   */
  public AdminApiKey id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "key_abc", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public AdminApiKey name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Administration Key", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public AdminApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

  
  @ApiModelProperty(example = "sk-admin...def", value = "")
  @JsonProperty("redacted_value")
  public String getRedactedValue() {
    return redactedValue;
  }
  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

  /**
   */
  public AdminApiKey value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "sk-admin-1234abcd", value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   */
  public AdminApiKey createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "1711471533", value = "")
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   */
  public AdminApiKey owner(AdminApiKeyOwner owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(_object, adminApiKey._object) &&
        Objects.equals(id, adminApiKey.id) &&
        Objects.equals(name, adminApiKey.name) &&
        Objects.equals(redactedValue, adminApiKey.redactedValue) &&
        Objects.equals(value, adminApiKey.value) &&
        Objects.equals(createdAt, adminApiKey.createdAt) &&
        Objects.equals(owner, adminApiKey.owner);
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

