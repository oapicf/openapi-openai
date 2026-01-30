package apimodels;

import apimodels.AdminApiKeyOwner;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AdminApiKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdminApiKey   {
  @JsonProperty("object")
  
  private String _object;

  @JsonProperty("id")
  
  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("redacted_value")
  
  private String redactedValue;

  @JsonProperty("value")
  
  private String value;

  @JsonProperty("created_at")
  
  private Long createdAt;

  @JsonProperty("owner")
  @Valid

  private AdminApiKeyOwner owner;

  public AdminApiKey _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

