package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEditResponseChoicesInner
 */

@JsonTypeName("CreateEditResponse_choices_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-16T01:13:12.257183065Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateEditResponseChoicesInner {

  private String text;

  private Integer index;

  private JsonNullable<CreateCompletionResponseChoicesInnerLogprobs> logprobs = JsonNullable.<CreateCompletionResponseChoicesInnerLogprobs>undefined();

  /**
   * Gets or Sets finishReason
   */
  public enum FinishReasonEnum {
    STOP("stop"),
    
    LENGTH("length");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FinishReasonEnum fromValue(String value) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FinishReasonEnum finishReason;

  public CreateEditResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  
  @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateEditResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  */
  
  @Schema(name = "index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateEditResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = JsonNullable.of(logprobs);
    return this;
  }

  /**
   * Get logprobs
   * @return logprobs
  */
  @Valid 
  @Schema(name = "logprobs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logprobs")
  public JsonNullable<CreateCompletionResponseChoicesInnerLogprobs> getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(JsonNullable<CreateCompletionResponseChoicesInnerLogprobs> logprobs) {
    this.logprobs = logprobs;
  }

  public CreateEditResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  /**
   * Get finishReason
   * @return finishReason
  */
  
  @Schema(name = "finish_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finish_reason")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEditResponseChoicesInner createEditResponseChoicesInner = (CreateEditResponseChoicesInner) o;
    return Objects.equals(this.text, createEditResponseChoicesInner.text) &&
        Objects.equals(this.index, createEditResponseChoicesInner.index) &&
        equalsNullable(this.logprobs, createEditResponseChoicesInner.logprobs) &&
        Objects.equals(this.finishReason, createEditResponseChoicesInner.finishReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, index, hashCodeNullable(logprobs), finishReason);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEditResponseChoicesInner {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

