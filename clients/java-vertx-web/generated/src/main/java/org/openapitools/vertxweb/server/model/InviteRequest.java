package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.InviteRequestProjectsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InviteRequest   {
  
  private String email;


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
      return value;
    }
  }

  private RoleEnum role;
  private List<InviteRequestProjectsInner> projects = new ArrayList<>();

  public InviteRequest () {

  }

  public InviteRequest (String email, RoleEnum role, List<InviteRequestProjectsInner> projects) {
    this.email = email;
    this.role = role;
    this.projects = projects;
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

    
  @JsonProperty("projects")
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
    return Objects.equals(email, inviteRequest.email) &&
        Objects.equals(role, inviteRequest.role) &&
        Objects.equals(projects, inviteRequest.projects);
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
