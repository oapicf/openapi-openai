package org.openapitools.model;

import org.openapitools.model.PredictionContentContent;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */
public class PredictionContent implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;. 
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("content")
  private PredictionContentContent content;

  /**
   * The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;. 
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return content
   */
  public PredictionContentContent getContent() {
    return content;
  }

  public void setContent(PredictionContentContent content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionContent predictionContent = (PredictionContent) o;
    return Objects.equals(this.type, predictionContent.type) &&
        Objects.equals(this.content, predictionContent.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionContent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
