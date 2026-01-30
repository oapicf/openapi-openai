package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdminApiKeyOwner   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("role")
  private String role;

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
    return Objects.equals(type, adminApiKeyOwner.type) &&
        Objects.equals(id, adminApiKeyOwner.id) &&
        Objects.equals(name, adminApiKeyOwner.name) &&
        Objects.equals(createdAt, adminApiKeyOwner.createdAt) &&
        Objects.equals(role, adminApiKeyOwner.role);
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

