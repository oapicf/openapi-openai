package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateCompletionResponseChoicesInner
 */

@JsonTypeName("CreateCompletionResponse_choices_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseChoicesInner {

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

  public CreateCompletionResponseChoicesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCompletionResponseChoicesInner(String text, Integer index, CreateCompletionResponseChoicesInnerLogprobs logprobs, FinishReasonEnum finishReason) {
    this.text = text;
    this.index = index;
    this.logprobs = JsonNullable.of(logprobs);
    this.finishReason = finishReason;
  }

  public CreateCompletionResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  @NotNull 
  @Schema(name = "text", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateCompletionResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  */
  @NotNull 
  @Schema(name = "index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateCompletionResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = JsonNullable.of(logprobs);
    return this;
  }

  /**
   * Get logprobs
   * @return logprobs
  */
  @NotNull @Valid 
  @Schema(name = "logprobs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("logprobs")
  public JsonNullable<CreateCompletionResponseChoicesInnerLogprobs> getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(JsonNullable<CreateCompletionResponseChoicesInnerLogprobs> logprobs) {
    this.logprobs = logprobs;
  }

  public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  /**
   * Get finishReason
   * @return finishReason
  */
  @NotNull 
  @Schema(name = "finish_reason", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
    return Objects.equals(this.text, createCompletionResponseChoicesInner.text) &&
        Objects.equals(this.index, createCompletionResponseChoicesInner.index) &&
        Objects.equals(this.logprobs, createCompletionResponseChoicesInner.logprobs) &&
        Objects.equals(this.finishReason, createCompletionResponseChoicesInner.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, index, logprobs, finishReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInner {\n");
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

