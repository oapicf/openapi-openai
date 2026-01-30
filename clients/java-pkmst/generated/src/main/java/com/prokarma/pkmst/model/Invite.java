package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.InviteProjectsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 */
@ApiModel(description = "Represents an individual `invite` to the organization.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Invite   {
  /**
   * The object type, which is always `organization.invite`
   */
  public enum ObjectEnum {
    ORGANIZATION_INVITE("organization.invite");

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

  /**
   * `accepted`,`expired`, or `pending`
   */
  public enum StatusEnum {
    ACCEPTED("accepted"),
    
    EXPIRED("expired"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("invited_at")
  private Integer invitedAt;

  @JsonProperty("expires_at")
  private Integer expiresAt;

  @JsonProperty("accepted_at")
  private Integer acceptedAt;

  @JsonProperty("projects")
  
  private List<InviteProjectsInner> projects = null;

  public Invite _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `organization.invite`
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.invite`")
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
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
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
  @ApiModelProperty(required = true, value = "The email address of the individual to whom the invite was sent")
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
  @ApiModelProperty(required = true, value = "`owner` or `reader`")
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
  @ApiModelProperty(required = true, value = "`accepted`,`expired`, or `pending`")
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
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite was sent.")
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
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite expires.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Invite acceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   * @return acceptedAt
   */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the invite was accepted.")
  public Integer getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public Invite projects(List<InviteProjectsInner> projects) {
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
  @ApiModelProperty(value = "The projects that were granted membership upon acceptance of the invite.")
  public List<InviteProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<InviteProjectsInner> projects) {
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

