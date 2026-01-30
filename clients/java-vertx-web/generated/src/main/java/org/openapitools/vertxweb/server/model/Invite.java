package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.InviteProjectsInner;

/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Invite   {
  


  public enum ObjectEnum {
    ORGANIZATION_INVITE("organization.invite");

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
      return value;
    }
  }

  private StatusEnum status;
  private Integer invitedAt;
  private Integer expiresAt;
  private Integer acceptedAt;
  private List<InviteProjectsInner> projects = new ArrayList<>();

  public Invite () {

  }

  public Invite (ObjectEnum _object, String id, String email, RoleEnum role, StatusEnum status, Integer invitedAt, Integer expiresAt, Integer acceptedAt, List<InviteProjectsInner> projects) {
    this._object = _object;
    this.id = id;
    this.email = email;
    this.role = role;
    this.status = status;
    this.invitedAt = invitedAt;
    this.expiresAt = expiresAt;
    this.acceptedAt = acceptedAt;
    this.projects = projects;
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

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("invited_at")
  public Integer getInvitedAt() {
    return invitedAt;
  }
  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("accepted_at")
  public Integer getAcceptedAt() {
    return acceptedAt;
  }
  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

    
  @JsonProperty("projects")
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
    return Objects.equals(_object, invite._object) &&
        Objects.equals(id, invite.id) &&
        Objects.equals(email, invite.email) &&
        Objects.equals(role, invite.role) &&
        Objects.equals(status, invite.status) &&
        Objects.equals(invitedAt, invite.invitedAt) &&
        Objects.equals(expiresAt, invite.expiresAt) &&
        Objects.equals(acceptedAt, invite.acceptedAt) &&
        Objects.equals(projects, invite.projects);
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
