package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteProjectsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Represents an individual `invite` to the organization.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Invite   {
  

  /**
   * The object type, which is always &#x60;organization.invite&#x60;
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
  }

  private ObjectEnum _object;
  private String id;
  private String email;

  /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
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
  }

  private RoleEnum role;

  /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
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
  }

  private StatusEnum status;
  private Integer invitedAt;
  private Integer expiresAt;
  private Integer acceptedAt;
  private List<@Valid InviteProjectsInner> projects = new ArrayList<>();

  /**
   * The object type, which is always &#x60;organization.invite&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "The object type, which is always `organization.invite`")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The identifier, which can be referenced in API endpoints
   **/
  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The email address of the individual to whom the invite was sent
   **/
  
  @ApiModelProperty(required = true, value = "The email address of the individual to whom the invite was sent")
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "`owner` or `reader`")
  @JsonProperty("role")
  @NotNull
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * &#x60;accepted&#x60;,&#x60;expired&#x60;, or &#x60;pending&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "`accepted`,`expired`, or `pending`")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite was sent.")
  @JsonProperty("invited_at")
  @NotNull
  public Integer getInvitedAt() {
    return invitedAt;
  }
  public void setInvitedAt(Integer invitedAt) {
    this.invitedAt = invitedAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   **/
  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the invite expires.")
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   **/
  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the invite was accepted.")
  @JsonProperty("accepted_at")
  public Integer getAcceptedAt() {
    return acceptedAt;
  }
  public void setAcceptedAt(Integer acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  /**
   * The projects that were granted membership upon acceptance of the invite.
   **/
  
  @ApiModelProperty(value = "The projects that were granted membership upon acceptance of the invite.")
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

