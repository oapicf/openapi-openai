package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteRequestProjectsInner  {
  
 /**
  * Project's public ID
  */
  @ApiModelProperty(required = true, value = "Project's public ID")

  private String id;

public enum RoleEnum {

MEMBER(String.valueOf("member")), OWNER(String.valueOf("owner"));


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
  * Project membership role
  */
  @ApiModelProperty(required = true, value = "Project membership role")

  private RoleEnum role;
 /**
   * Project&#39;s public ID
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

  public InviteRequestProjectsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Project membership role
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

  public InviteRequestProjectsInner role(RoleEnum role) {
    this.role = role;
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
    InviteRequestProjectsInner inviteRequestProjectsInner = (InviteRequestProjectsInner) o;
    return Objects.equals(this.id, inviteRequestProjectsInner.id) &&
        Objects.equals(this.role, inviteRequestProjectsInner.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteRequestProjectsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

