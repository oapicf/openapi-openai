package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeResponseStatusDetailsError   {
  @JsonProperty("type")
  
  private String type;

  @JsonProperty("code")
  
  private String code;

  public RealtimeResponseStatusDetailsError type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of error.
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeResponseStatusDetailsError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Error code, if any.
   * @return code
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

