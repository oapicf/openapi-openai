package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents an individual &#x60;user&#x60; within an organization.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User   {
  


  public enum ObjectEnum {
    ORGANIZATION_USER("organization.user");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private String id;
  private String name;
  private String email;


  public enum RoleEnum {
    OWNER("owner"),
    READER("reader");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private Integer addedAt;

  public User () {

  }

  public User (ObjectEnum _object, String id, String name, String email, RoleEnum role, Integer addedAt) {
    this._object = _object;
    this.id = id;
    this.name = name;
    this.email = email;
    this.role = role;
    this.addedAt = addedAt;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
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

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("added_at")
  public Integer getAddedAt() {
    return addedAt;
  }
  public void setAddedAt(Integer addedAt) {
    this.addedAt = addedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(_object, user._object) &&
        Objects.equals(id, user.id) &&
        Objects.equals(name, user.name) &&
        Objects.equals(email, user.email) &&
        Objects.equals(role, user.role) &&
        Objects.equals(addedAt, user.addedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, name, email, role, addedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
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
