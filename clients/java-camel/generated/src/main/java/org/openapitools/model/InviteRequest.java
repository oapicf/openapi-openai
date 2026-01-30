package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteRequestProjectsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InviteRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteRequest {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private RoleEnum role;

  @Valid
  private List<@Valid InviteRequestProjectsInner> projects = new ArrayList<>();

  public InviteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InviteRequest(String email, RoleEnum role) {
    this.email = email;
    this.role = role;
  }

  public InviteRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Send an email to this address
   * @return email
   */
  @NotNull 
  @Schema(name = "email", description = "Send an email to this address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
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
  @NotNull 
  @Schema(name = "role", description = "`owner` or `reader`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
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
   */
  @Valid 
  @Schema(name = "projects", description = "An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
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

