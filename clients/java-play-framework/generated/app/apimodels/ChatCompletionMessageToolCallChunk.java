package apimodels;

import apimodels.ChatCompletionMessageToolCallChunkFunction;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChatCompletionMessageToolCallChunk
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatCompletionMessageToolCallChunk   {
  @JsonProperty("index")
  @NotNull

  private Integer index;

  @JsonProperty("id")
  
  private String id;

  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  public enum TypeEnum {
    FUNCTION("function");

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

  @JsonProperty("function")
  @Valid

  private ChatCompletionMessageToolCallChunkFunction function;

  public ChatCompletionMessageToolCallChunk index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public ChatCompletionMessageToolCallChunk id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChatCompletionMessageToolCallChunk type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the tool. Currently, only `function` is supported.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionMessageToolCallChunk function(ChatCompletionMessageToolCallChunkFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  public ChatCompletionMessageToolCallChunkFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionMessageToolCallChunkFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionMessageToolCallChunk chatCompletionMessageToolCallChunk = (ChatCompletionMessageToolCallChunk) o;
    return Objects.equals(index, chatCompletionMessageToolCallChunk.index) &&
        Objects.equals(id, chatCompletionMessageToolCallChunk.id) &&
        Objects.equals(type, chatCompletionMessageToolCallChunk.type) &&
        Objects.equals(function, chatCompletionMessageToolCallChunk.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, function);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionMessageToolCallChunk {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

