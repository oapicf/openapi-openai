package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectUser;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProjectApiKeyOwner
 */

@JsonTypeName("ProjectApiKey_owner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProjectApiKeyOwner {

  /**
   * `user` or `service_account`
   */
  public enum TypeEnum {
    USER("user"),
    
    SERVICE_ACCOUNT("service_account");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TypeEnum type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProjectUser user;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProjectServiceAccount serviceAccount;

  public ProjectApiKeyOwner type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * `user` or `service_account`
   * @return type
   */
  
  @Schema(name = "type", description = "`user` or `service_account`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public ProjectApiKeyOwner user(@Nullable ProjectUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable ProjectUser getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(@Nullable ProjectUser user) {
    this.user = user;
  }

  public ProjectApiKeyOwner serviceAccount(@Nullable ProjectServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Get serviceAccount
   * @return serviceAccount
   */
  @Valid 
  @Schema(name = "service_account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_account")
  public @Nullable ProjectServiceAccount getServiceAccount() {
    return serviceAccount;
  }

  @JsonProperty("service_account")
  public void setServiceAccount(@Nullable ProjectServiceAccount serviceAccount) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

