package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectApiKeyOwner  {
  
public enum TypeEnum {

USER(String.valueOf("user")), SERVICE_ACCOUNT(String.valueOf("service_account"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * `user` or `service_account`
  */
  @ApiModelProperty(value = "`user` or `service_account`")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  @Valid

  private ProjectUser user;

  @ApiModelProperty(value = "")

  @Valid

  private ProjectServiceAccount serviceAccount;
 /**
   * &#x60;user&#x60; or &#x60;service_account&#x60;
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ProjectApiKeyOwner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public ProjectUser getUser() {
    return user;
  }

  public void setUser(ProjectUser user) {
    this.user = user;
  }

  public ProjectApiKeyOwner user(ProjectUser user) {
    this.user = user;
    return this;
  }

 /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @JsonProperty("service_account")
  public ProjectServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public ProjectApiKeyOwner serviceAccount(ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
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
    ProjectApiKeyOwner projectApiKeyOwner = (ProjectApiKeyOwner) o;
    return Objects.equals(this.type, projectApiKeyOwner.type) &&
        Objects.equals(this.user, projectApiKeyOwner.user) &&
        Objects.equals(this.serviceAccount, projectApiKeyOwner.serviceAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, user, serviceAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectApiKeyOwner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

