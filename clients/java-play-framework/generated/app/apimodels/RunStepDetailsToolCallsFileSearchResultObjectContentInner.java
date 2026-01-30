package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RunStepDetailsToolCallsFileSearchResultObjectContentInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsFileSearchResultObjectContentInner   {
  /**
   * The type of the content.
   */
  public enum TypeEnum {
    TEXT("text");

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
  
  private TypeEnum type;

  @JsonProperty("text")
  
  private String text;

  public RunStepDetailsToolCallsFileSearchResultObjectContentInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the content.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDetailsToolCallsFileSearchResultObjectContentInner text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text content of the file.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchResultObjectContentInner runStepDetailsToolCallsFileSearchResultObjectContentInner = (RunStepDetailsToolCallsFileSearchResultObjectContentInner) o;
    return Objects.equals(type, runStepDetailsToolCallsFileSearchResultObjectContentInner.type) &&
        Objects.equals(text, runStepDetailsToolCallsFileSearchResultObjectContentInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObjectContentInner {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

