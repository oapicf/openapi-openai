package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an individual &#x60;user&#x60; within an organization.
 */

@Schema(name = "User", description = "Represents an individual `user` within an organization.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class User {

  /**
   * The object type, which is always `organization.user`
   */
  public enum ObjectEnum {
    ORGANIZATION_USER("organization.user");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ObjectEnum _object;

  private String id;

  private String name;

  private String email;

  /**
   * `owner` or `reader`
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    READER("reader");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  private Integer addedAt;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(ObjectEnum _object, String id, String name, String email, RoleEnum role, Integer addedAt) {
    this._object = _object;
    this.id = id;
    this.name = name;
    this.email = email;
    this.role = role;
    this.addedAt = addedAt;
  }

  public User _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.user`
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `organization.user`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier, which can be referenced in API endpoints", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the user
   * @return email
   */
  @NotNull 
  @Schema(name = "email", description = "The email address of the user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * `owner` or `reader`
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "`owner` or `reader`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public User addedAt(Integer addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the user was added.
   * @return addedAt
   */
  @NotNull 
  @Schema(name = "added_at", description = "The Unix timestamp (in seconds) of when the user was added.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this._object, user._object) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.addedAt, user.addedAt);
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

