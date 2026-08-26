package org.openapitools.model;

import org.openapitools.model.InviteProjectsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 */
public class Invite implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The object type, which is always &#x60;organization.invite&#x60;
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The identifier, which can be referenced in API endpoints
   */
  @JsonProperty("id")
  private String id;

  /**
   * The email address of the individual to whom the invite was sent
   */
  @JsonProperty("email")
  private String email;

  /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   */
  @JsonProperty("role")
  private String role;

  /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
   */
  @JsonProperty("status")
  private String status;

  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   */
  @JsonProperty("invited_at")
  private Integer invitedAt;

  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   */
  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   */
  @JsonProperty("accepted_at")
  private Integer acceptedAt;

  /**
   * The projects that were granted membership upon acceptance of the invite.
   */
  @JsonProperty("projects")
  private List<InviteProjectsInner> projects = new ArrayList<>();

  /**
   * The object type, which is always &#x60;organization.invite&#x60;
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The email address of the individual to whom the invite was sent
   * @return email
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   * @return role
   */
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   * @return invitedAt
   */
  public Integer getInvitedAt() {
    return invitedAt;
  }

  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   * @return expiresAt
   */
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   * @return acceptedAt
   */
  public Integer getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  /**
   * The projects that were granted membership upon acceptance of the invite.
   * @return projects
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
