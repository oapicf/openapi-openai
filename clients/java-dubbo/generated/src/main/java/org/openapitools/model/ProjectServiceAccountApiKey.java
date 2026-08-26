package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ProjectServiceAccountApiKey implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;organization.project.service_account.api_key&#x60;
   */
  @JsonProperty("object")
  private String _object;

  @JsonProperty("value")
  private String value;

  @JsonProperty("name")
  private String name;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;organization.project.service_account.api_key&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * 
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   * @return id
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
