package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectUserCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectUserCreateRequest {

  private String userId;

  /**
   * `owner` or `member`
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    MEMBER("member");

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

  public ProjectUserCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectUserCreateRequest(String userId, RoleEnum role) {
    this.userId = userId;
    this.role = role;
  }

  public ProjectUserCreateRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user.
   * @return userId
   */
  @NotNull 
  @Schema(name = "user_id", description = "The ID of the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ProjectUserCreateRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * `owner` or `member`
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "`owner` or `member`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
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
    ProjectUserCreateRequest projectUserCreateRequest = (ProjectUserCreateRequest) o;
    return Objects.equals(this.userId, projectUserCreateRequest.userId) &&
        Objects.equals(this.role, projectUserCreateRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUserCreateRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

