package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeResponseStatusDetailsError   {
  
  private String type;
  private String code;

  public RealtimeResponseStatusDetailsError () {

  }

  public RealtimeResponseStatusDetailsError (String type, String code) {
    this.type = type;
    this.code = code;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseStatusDetailsError realtimeResponseStatusDetailsError = (RealtimeResponseStatusDetailsError) o;
    return Objects.equals(type, realtimeResponseStatusDetailsError.type) &&
        Objects.equals(code, realtimeResponseStatusDetailsError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseStatusDetailsError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
