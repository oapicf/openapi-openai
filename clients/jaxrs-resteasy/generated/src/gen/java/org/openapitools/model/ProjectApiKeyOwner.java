package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectUser;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectApiKeyOwner   {
  

  /**
   * &#x60;user&#x60; or &#x60;service_account&#x60;
   */
  public enum TypeEnum {
    USER("user"),

        SERVICE_ACCOUNT("service_account");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private ProjectUser user;
  private ProjectServiceAccount serviceAccount;

  /**
   * &#x60;user&#x60; or &#x60;service_account&#x60;
   **/
  
  @ApiModelProperty(value = "`user` or `service_account`")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
  @Valid
  public ProjectUser getUser() {
    return user;
  }
  public void setUser(ProjectUser user) {
    this.user = user;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service_account")
  @Valid
  public ProjectServiceAccount getServiceAccount() {
    return serviceAccount;
  }
  public void setServiceAccount(ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

