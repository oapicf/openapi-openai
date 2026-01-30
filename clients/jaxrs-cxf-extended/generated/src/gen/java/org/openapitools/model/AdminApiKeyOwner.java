package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdminApiKeyOwner  {
  
  @ApiModelProperty(example = "service_account", value = "")
  private String type;

  @ApiModelProperty(example = "sa_456", value = "")
  private String id;

  @ApiModelProperty(example = "My Service Account", value = "")
  private String name;

  @ApiModelProperty(example = "1711471533", value = "")
  private Long createdAt;

  @ApiModelProperty(example = "member", value = "")
  private String role;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AdminApiKeyOwner type(String type) {
    this.type = type;
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
  public AdminApiKeyOwner id(String id) {
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
  public AdminApiKeyOwner name(String name) {
    this.name = name;
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
  public AdminApiKeyOwner createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get role
  * @return role
  */
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  /**
   * Sets the <code>role</code> property.
   */
 public void setRole(String role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public AdminApiKeyOwner role(String role) {
    this.role = role;
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
    AdminApiKeyOwner adminApiKeyOwner = (AdminApiKeyOwner) o;
    return Objects.equals(this.type, adminApiKeyOwner.type) &&
        Objects.equals(this.id, adminApiKeyOwner.id) &&
        Objects.equals(this.name, adminApiKeyOwner.name) &&
        Objects.equals(this.createdAt, adminApiKeyOwner.createdAt) &&
        Objects.equals(this.role, adminApiKeyOwner.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, createdAt, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminApiKeyOwner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

