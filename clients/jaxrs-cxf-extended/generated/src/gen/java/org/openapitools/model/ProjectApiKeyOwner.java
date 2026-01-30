package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProjectApiKeyOwner  {
  
public enum TypeEnum {

    @JsonProperty("user") USER(String.valueOf("user")),
    @JsonProperty("service_account") SERVICE_ACCOUNT(String.valueOf("service_account"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public ProjectApiKeyOwner type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public ProjectUser getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(ProjectUser user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public ProjectApiKeyOwner user(ProjectUser user) {
    this.user = user;
    return this;
  }

 /**
  * Get serviceAccount
  * @return serviceAccount
  */
  @JsonProperty("service_account")
  public ProjectServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Sets the <code>serviceAccount</code> property.
   */
 public void setServiceAccount(ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  /**
   * Sets the <code>serviceAccount</code> property.
   */
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

