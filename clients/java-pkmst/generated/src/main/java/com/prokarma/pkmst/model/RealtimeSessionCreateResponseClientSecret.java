package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ephemeral key returned by the API.
 */
@ApiModel(description = "Ephemeral key returned by the API.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponseClientSecret   {
  @JsonProperty("value")
  private String value;

  @JsonProperty("expires_at")
  private Integer expiresAt;

  public RealtimeSessionCreateResponseClientSecret value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
   * @return value
   */
  @ApiModelProperty(value = "Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RealtimeSessionCreateResponseClientSecret expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Timestamp for when the token expires. Currently, all tokens expire after one minute. 
   * @return expiresAt
   */
  @ApiModelProperty(value = "Timestamp for when the token expires. Currently, all tokens expire after one minute. ")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionCreateResponseClientSecret realtimeSessionCreateResponseClientSecret = (RealtimeSessionCreateResponseClientSecret) o;
    return Objects.equals(this.value, realtimeSessionCreateResponseClientSecret.value) &&
        Objects.equals(this.expiresAt, realtimeSessionCreateResponseClientSecret.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateResponseClientSecret {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

