package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ephemeral key returned by the API.
 **/
@ApiModel(description = "Ephemeral key returned by the API.")
@JsonTypeName("RealtimeSessionCreateResponse_client_secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponseClientSecret   {
  private String value;
  private Integer expiresAt;

  public RealtimeSessionCreateResponseClientSecret() {
  }

  /**
   * Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
   **/
  public RealtimeSessionCreateResponseClientSecret value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. ")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Timestamp for when the token expires. Currently, all tokens expire after one minute. 
   **/
  public RealtimeSessionCreateResponseClientSecret expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp for when the token expires. Currently, all tokens expire after one minute. ")
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  @JsonProperty("expires_at")
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

