package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteRequestProjectsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("InviteRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class InviteRequest   {
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
  private @Valid List<@Valid InviteRequestProjectsInner> projects = new ArrayList<>();

  public InviteRequest() {
  }

  @JsonCreator
  public InviteRequest(
    @JsonProperty(required = true, value = "email") String email,
    @JsonProperty(required = true, value = "role") RoleEnum role
  ) {
    this.email = email;
    this.role = role;
  }

  /**
   * Send an email to this address
   **/
  public InviteRequest email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Send an email to this address")
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
  public InviteRequest role(RoleEnum role) {
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
   * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
   **/
  public InviteRequest projects(List<@Valid InviteRequestProjectsInner> projects) {
    this.projects = projects;
    return this;
  }

  
  @ApiModelProperty(value = "An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.")
  @JsonProperty("projects")
  @Valid public List<@Valid InviteRequestProjectsInner> getProjects() {
    return projects;
  }

  @JsonProperty("projects")
  public void setProjects(List<@Valid InviteRequestProjectsInner> projects) {
    this.projects = projects;
  }

  public InviteRequest addProjectsItem(InviteRequestProjectsInner projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }

    this.projects.add(projectsItem);
    return this;
  }

  public InviteRequest removeProjectsItem(InviteRequestProjectsInner projectsItem) {
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

