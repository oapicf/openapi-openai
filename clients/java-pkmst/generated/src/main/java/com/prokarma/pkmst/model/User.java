package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents an individual &#x60;user&#x60; within an organization.
 */
@ApiModel(description = "Represents an individual `user` within an organization.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class User   {
  /**
   * The object type, which is always `organization.user`
   */
  public enum ObjectEnum {
    ORGANIZATION_USER("organization.user");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  /**
   * `owner` or `reader`
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("added_at")
  private Integer addedAt;

  public User _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.user`
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.user`")
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
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
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
  @ApiModelProperty(required = true, value = "The name of the user")
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
  @ApiModelProperty(required = true, value = "The email address of the user")
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
  @ApiModelProperty(required = true, value = "`owner` or `reader`")
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
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the user was added.")
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

