package apimodels;

import apimodels.InviteRequestProjectsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * InviteRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InviteRequest   {
  @JsonProperty("email")
  @NotNull

  private String email;

  /**
   * `owner` or `reader`
   */
  public enum RoleEnum {
    READER("reader"),
    
    OWNER("owner");

    private final String value;

    RoleEnum(String value) {
      this.value = value;
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

  @JsonProperty("role")
  @NotNull

  private RoleEnum role;

  @JsonProperty("projects")
  @Valid

  private List<@Valid InviteRequestProjectsInner> projects = null;

  public InviteRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Send an email to this address
   * @return email
  **/
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
  **/
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public InviteRequest projects(List<@Valid InviteRequestProjectsInner> projects) {
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
  **/
  public List<@Valid InviteRequestProjectsInner> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid InviteRequestProjectsInner> projects) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

