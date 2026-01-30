package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteProjectsInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 */

@Schema(name = "Invite", description = "Represents an individual `invite` to the organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Invite {

  /**
   * The object type, which is always `organization.invite`
   */
  public enum ObjectEnum {
    ORGANIZATION_INVITE("organization.invite");

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

  /**
   * `accepted`,`expired`, or `pending`
   */
  public enum StatusEnum {
    ACCEPTED("accepted"),
    
    EXPIRED("expired"),
    
    PENDING("pending");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Integer invitedAt;

  private Integer expiresAt;

  private @Nullable Integer acceptedAt;

  @Valid
  private List<@Valid InviteProjectsInner> projects = new ArrayList<>();

  public Invite() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Invite(ObjectEnum _object, String id, String email, RoleEnum role, StatusEnum status, Integer invitedAt, Integer expiresAt) {
    this._object = _object;
    this.id = id;
    this.email = email;
    this.role = role;
    this.status = status;
    this.invitedAt = invitedAt;
    this.expiresAt = expiresAt;
  }

  public Invite _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.invite`
   * @return _object
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `organization.invite`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Invite id(String id) {
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

  public Invite email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the individual to whom the invite was sent
   * @return email
   */
  @NotNull 
  @Schema(name = "email", description = "The email address of the individual to whom the invite was sent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Invite role(RoleEnum role) {
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

  public Invite status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * `accepted`,`expired`, or `pending`
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "`accepted`,`expired`, or `pending`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invite invitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   * @return invitedAt
   */
  @NotNull 
  @Schema(name = "invited_at", description = "The Unix timestamp (in seconds) of when the invite was sent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invited_at")
  public Integer getInvitedAt() {
    return invitedAt;
  }

  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

  public Invite expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   * @return expiresAt
   */
  @NotNull 
  @Schema(name = "expires_at", description = "The Unix timestamp (in seconds) of when the invite expires.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Invite acceptedAt(@Nullable Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   * @return acceptedAt
   */
  
  @Schema(name = "accepted_at", description = "The Unix timestamp (in seconds) of when the invite was accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted_at")
  public @Nullable Integer getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(@Nullable Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public Invite projects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public Invite addProjectsItem(InviteProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * The projects that were granted membership upon acceptance of the invite.
   * @return projects
   */
  @Valid 
  @Schema(name = "projects", description = "The projects that were granted membership upon acceptance of the invite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid InviteProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invite invite = (Invite) o;
    return Objects.equals(this._object, invite._object) &&
        Objects.equals(this.id, invite.id) &&
        Objects.equals(this.email, invite.email) &&
        Objects.equals(this.role, invite.role) &&
        Objects.equals(this.status, invite.status) &&
        Objects.equals(this.invitedAt, invite.invitedAt) &&
        Objects.equals(this.expiresAt, invite.expiresAt) &&
        Objects.equals(this.acceptedAt, invite.acceptedAt) &&
        Objects.equals(this.projects, invite.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, email, role, status, invitedAt, expiresAt, acceptedAt, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invite {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    invitedAt: ").append(toIndentedString(invitedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

