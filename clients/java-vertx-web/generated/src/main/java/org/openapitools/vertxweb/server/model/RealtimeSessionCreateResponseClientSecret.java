package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ephemeral key returned by the API.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeSessionCreateResponseClientSecret   {
  
  private String value;
  private Integer expiresAt;

  public RealtimeSessionCreateResponseClientSecret () {

  }

  public RealtimeSessionCreateResponseClientSecret (String value, Integer expiresAt) {
    this.value = value;
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

    
  @JsonProperty("expires_at")
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
    return Objects.equals(value, realtimeSessionCreateResponseClientSecret.value) &&
        Objects.equals(expiresAt, realtimeSessionCreateResponseClientSecret.expiresAt);
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
