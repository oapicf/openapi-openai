package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.InviteRequestProjectsInner;
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
 * InviteRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteRequest   {
  @JsonProperty("email")
  private String email;

  /**
   * `owner` or `reader`
   */
  public enum RoleEnum {
    READER("reader"),
    
    OWNER("owner");

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

  @JsonProperty("projects")
  
  private List<InviteRequestProjectsInner> projects = null;

  public InviteRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Send an email to this address
   * @return email
   */
  @ApiModelProperty(required = true, value = "Send an email to this address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InviteRequest role(RoleEnum role) {
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

  public InviteRequest projects(List<InviteRequestProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public InviteRequest addProjectsItem(InviteRequestProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
   * @return projects
   */
  @ApiModelProperty(value = "An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.")
  public List<InviteRequestProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<InviteRequestProjectsInner> projects) {
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
    InviteRequest inviteRequest = (InviteRequest) o;
    return Objects.equals(this.email, inviteRequest.email) &&
        Objects.equals(this.role, inviteRequest.role) &&
        Objects.equals(this.projects, inviteRequest.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, role, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

