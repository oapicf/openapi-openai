package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdminApiKey_owner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdminApiKeyOwner   {
  private String type;
  private String id;
  private String name;
  private Long createdAt;
  private String role;

  public AdminApiKeyOwner() {
  }

  /**
   **/
  public AdminApiKeyOwner type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "service_account", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public AdminApiKeyOwner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "sa_456", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public AdminApiKeyOwner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "My Service Account", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AdminApiKeyOwner createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "1711471533", value = "")
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public AdminApiKeyOwner role(String role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(example = "member", value = "")
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  @JsonProperty("role")
  public void setRole(String role) {
    this.role = role;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

