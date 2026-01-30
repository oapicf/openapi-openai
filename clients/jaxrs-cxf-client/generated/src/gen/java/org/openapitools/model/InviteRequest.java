package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteRequestProjectsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteRequest  {
  
 /**
  * Send an email to this address
  */
  @ApiModelProperty(required = true, value = "Send an email to this address")

  private String email;

public enum RoleEnum {

READER(String.valueOf("reader")), OWNER(String.valueOf("owner"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

 /**
  * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
  */
  @ApiModelProperty(value = "An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.")

  private List<InviteRequestProjectsInner> projects = new ArrayList<>();
 /**
   * Send an email to this address
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InviteRequest email(String email) {
    this.email = email;
    return this;
  }

 /**
   * &#x60;owner&#x60; or &#x60;reader&#x60;
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public InviteRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
   * @return projects
  **/
  @JsonProperty("projects")
  public List<InviteRequestProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<InviteRequestProjectsInner> projects) {
    this.projects = projects;
  }

  public InviteRequest projects(List<InviteRequestProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  public InviteRequest addProjectsItem(InviteRequestProjectsInner projectsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

