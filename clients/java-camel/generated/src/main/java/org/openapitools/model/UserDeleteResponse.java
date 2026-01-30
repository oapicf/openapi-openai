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
 * UserDeleteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UserDeleteResponse {

  /**
   * Gets or Sets _object
   */
  public enum ObjectEnum {
    ORGANIZATION_USER_DELETED("organization.user.deleted");

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

  private Boolean deleted;

  public UserDeleteResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserDeleteResponse(ObjectEnum _object, String id, Boolean deleted) {
    this._object = _object;
    this.id = id;
    this.deleted = deleted;
  }

  public UserDeleteResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public UserDeleteResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDeleteResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  @NotNull 
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDeleteResponse userDeleteResponse = (UserDeleteResponse) o;
    return Objects.equals(this._object, userDeleteResponse._object) &&
        Objects.equals(this.id, userDeleteResponse.id) &&
        Objects.equals(this.deleted, userDeleteResponse.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDeleteResponse {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

