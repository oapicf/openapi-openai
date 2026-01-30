package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteProjectsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Represents an individual &#x60;invite&#x60; to the organization.
 **/
@ApiModel(description = "Represents an individual `invite` to the organization.")
@JsonTypeName("Invite")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Invite   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RoleEnum fromString(String s) {
        for (RoleEnum b : RoleEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private Integer acceptedAt;
  private @Valid List<@Valid InviteProjectsInner> projects = new ArrayList<>();

  public Invite() {
  }

  @JsonCreator
  public Invite(
    @JsonProperty(required = true, value = "object") ObjectEnum _object,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "role") RoleEnum role,
    @JsonProperty(required = true, value = "status") StatusEnum status,
    @JsonProperty(required = true, value = "invited_at") Integer invitedAt,
    @JsonProperty(required = true, value = "expires_at") Integer expiresAt
  ) {
    this._object = _object;
    this.id = id;
    this.email = email;
    this.role = role;
    this.status = status;
    this.invitedAt = invitedAt;
    this.expiresAt = expiresAt;
  }

  /**
   * The object type, which is always &#x60;organization.invite&#x60;
   **/
  public Invite _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.invite`")
  @JsonProperty(required = true, value = "object")
  @NotNull public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty(required = true, value = "object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   **/
  public Invite id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The email address of the individual to whom the invite was sent
   **/
  public Invite email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The email address of the individual to whom the invite was sent")
  @JsonProperty(required = true, value = "email")
  @NotNull public String getEmail() {
    return email;
  }

  @JsonProperty(required = true, value = "email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   **/
  public Invite role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "`owner` or `reader`")
  @JsonProperty(required = true, value = "role")
  @NotNull public RoleEnum getRole() {
    return role;
  }

  @JsonProperty(required = true, value = "role")
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
   **/
  public Invite status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "`accepted`,`expired`, or `pending`")
  @JsonProperty(required = true, value = "status")
  @NotNull public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   **/
  public Invite invitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite was sent.")
  @JsonProperty(required = true, value = "invited_at")
  @NotNull public Integer getInvitedAt() {
    return invitedAt;
  }

  @JsonProperty(required = true, value = "invited_at")
  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   **/
  public Invite expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite expires.")
  @JsonProperty(required = true, value = "expires_at")
  @NotNull public Integer getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty(required = true, value = "expires_at")
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   **/
  public Invite acceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the invite was accepted.")
  @JsonProperty("accepted_at")
  public Integer getAcceptedAt() {
    return acceptedAt;
  }

  @JsonProperty("accepted_at")
  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  /**
   * The projects that were granted membership upon acceptance of the invite.
   **/
  public Invite projects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  
  @ApiModelProperty(value = "The projects that were granted membership upon acceptance of the invite.")
  @JsonProperty("projects")
  @Valid public List<@Valid InviteProjectsInner> getProjects() {
    return projects;
  }

  @JsonProperty("projects")
  public void setProjects(List<@Valid InviteProjectsInner> projects) {
    this.projects = projects;
  }

  public Invite addProjectsItem(InviteProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }

    this.projects.add(projectsItem);
    return this;
  }

  public Invite removeProjectsItem(InviteProjectsInner projectsItem) {
    if (projectsItem != null && this.projects != null) {
      this.projects.remove(projectsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

