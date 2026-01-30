package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.PredictionContentContent;

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PredictionContent   {
  


  public enum TypeEnum {
    CONTENT("content");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private PredictionContentContent content;

  public PredictionContent () {

  }

  public PredictionContent (TypeEnum type, PredictionContentContent content) {
    this.type = type;
    this.content = content;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("content")
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
    return Objects.equals(type, predictionContent.type) &&
        Objects.equals(content, predictionContent.content);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
