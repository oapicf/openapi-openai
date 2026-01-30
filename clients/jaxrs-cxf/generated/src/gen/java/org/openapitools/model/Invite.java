package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteProjectsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an individual `invite` to the organization.
 */
@ApiModel(description="Represents an individual `invite` to the organization.")

public class Invite  {
  
public enum ObjectEnum {

ORGANIZATION_INVITE(String.valueOf("organization.invite"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * The object type, which is always `organization.invite`
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.invite`")

  private ObjectEnum _object;

 /**
  * The identifier, which can be referenced in API endpoints
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")

  private String id;

 /**
  * The email address of the individual to whom the invite was sent
  */
  @ApiModelProperty(required = true, value = "The email address of the individual to whom the invite was sent")

  private String email;

public enum RoleEnum {

OWNER(String.valueOf("owner")), READER(String.valueOf("reader"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * `owner` or `reader`
  */
  @ApiModelProperty(required = true, value = "`owner` or `reader`")

  private RoleEnum role;

public enum StatusEnum {

ACCEPTED(String.valueOf("accepted")), EXPIRED(String.valueOf("expired")), PENDING(String.valueOf("pending"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * `accepted`,`expired`, or `pending`
  */
  @ApiModelProperty(required = true, value = "`accepted`,`expired`, or `pending`")

  private StatusEnum status;

 /**
  * The Unix timestamp (in seconds) of when the invite was sent.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite was sent.")

  private Integer invitedAt;

 /**
  * The Unix timestamp (in seconds) of when the invite expires.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite expires.")

  private Integer expiresAt;

 /**
  * The Unix timestamp (in seconds) of when the invite was accepted.
  */
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the invite was accepted.")

  private Integer acceptedAt;

 /**
  * The projects that were granted membership upon acceptance of the invite.
  */
  @ApiModelProperty(value = "The projects that were granted membership upon acceptance of the invite.")

  @Valid

  private List<@Valid InviteProjectsInner> projects = new ArrayList<>();
 /**
   * The object type, which is always &#x60;organization.invite&#x60;
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public Invite _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The identifier, which can be referenced in API endpoints
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Invite id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The email address of the individual to whom the invite was sent
   * @return email
  **/
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Invite email(String email) {
    this.email = email;
    return this;
  }

 /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public Invite role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invite status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   * @return invitedAt
  **/
  @JsonProperty("invited_at")
  @NotNull
  public Integer getInvitedAt() {
    return invitedAt;
  }

  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

  public Invite invitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the invite expires.
   * @return expiresAt
  **/
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Invite expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   * @return acceptedAt
  **/
  @JsonProperty("accepted_at")
  public Integer getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public Invite acceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

 /**
   * The projects that were granted membership upon acceptance of the invite.
   * @return projects
  **/
  @JsonProperty("projects")
  public List<@Valid InviteProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
  }

  public Invite projects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public Invite addProjectsItem(InviteProjectsInner projectsItem) {
    this.projects.add(projectsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

