package apimodels;

import apimodels.PredictionContentContent;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PredictionContent   {
  /**
   * The type of the predicted content you want to provide. This type is currently always `content`. 
   */
  public enum TypeEnum {
    CONTENT("content");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("content")
  @NotNull
@Valid

  private PredictionContentContent content;

  public PredictionContent type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the predicted content you want to provide. This type is currently always `content`. 
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PredictionContent content(PredictionContentContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

