package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AdminApiKeyOwner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminApiKey   {
  
  private String _object;
  private String id;
  private String name;
  private String redactedValue;
  private String value;
  private Long createdAt;
  private AdminApiKeyOwner owner;

  public AdminApiKey () {

  }

  public AdminApiKey (String _object, String id, String name, String redactedValue, String value, Long createdAt, AdminApiKeyOwner owner) {
    this._object = _object;
    this.id = id;
    this.name = name;
    this.redactedValue = redactedValue;
    this.value = value;
    this.createdAt = createdAt;
    this.owner = owner;
  }

    
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }
  public void setObject(String _object) {
    this._object = _object;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("redacted_value")
  public String getRedactedValue() {
    return redactedValue;
  }
  public void setRedactedValue(String redactedValue) {
    this.redactedValue = redactedValue;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

    
  @JsonProperty("created_at")
  public Long getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

    
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
