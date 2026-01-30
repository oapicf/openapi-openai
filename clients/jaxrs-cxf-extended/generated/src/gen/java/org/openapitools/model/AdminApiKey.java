package org.openapitools.model;

import org.openapitools.model.AdminApiKeyOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdminApiKey  {
  
  @ApiModelProperty(example = "organization.admin_api_key", value = "")
  private String _object;

  @ApiModelProperty(example = "key_abc", value = "")
  private String id;

  @ApiModelProperty(example = "Administration Key", value = "")
  private String name;

  @ApiModelProperty(example = "sk-admin...def", value = "")
  private String redactedValue;

  @ApiModelProperty(example = "sk-admin-1234abcd", value = "")
  private String value;

  @ApiModelProperty(example = "1711471533", value = "")
  private Long createdAt;

  @ApiModelProperty(value = "")
  @Valid
  private AdminApiKeyOwner owner;
 /**
  * Get _object
  * @return _object
  */
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public AdminApiKey _object(String _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
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
  public AdminApiKey id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
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
  public AdminApiKey name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get redactedValue
  * @return redactedValue
  */
  @JsonProperty("redacted_value")
  public String getRedactedValue() {
    return redactedValue;
  }

  /**
   * Sets the <code>redactedValue</code> property.
   */
 public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

  /**
   * Sets the <code>redactedValue</code> property.
   */
  public AdminApiKey redactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
    return this;
  }

 /**
  * Get value
  * @return value
  */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public AdminApiKey value(String value) {
    this.value = value;
    return this;
  }

 /**
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public AdminApiKey createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get owner
  * @return owner
  */
  @JsonProperty("owner")
  public AdminApiKeyOwner getOwner() {
    return owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
 public void setOwner(AdminApiKeyOwner owner) {
    this.owner = owner;
  }

  /**
   * Sets the <code>owner</code> property.
   */
  public AdminApiKey owner(AdminApiKeyOwner owner) {
    this.owner = owner;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

