package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateCompletionResponse_choices_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateCompletionResponseChoicesInner   {
  private @Valid String text;
  private @Valid Integer index;
  private @Valid CreateCompletionResponseChoicesInnerLogprobs logprobs;
  public enum FinishReasonEnum {

    STOP(String.valueOf("stop")), LENGTH(String.valueOf("length"));


    private String value;

    FinishReasonEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static FinishReasonEnum fromString(String s) {
        for (FinishReasonEnum b : FinishReasonEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid FinishReasonEnum finishReason;

  /**
   **/
  public CreateCompletionResponseChoicesInner text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  @JsonProperty("text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public CreateCompletionResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  public CreateCompletionResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("logprobs")
  @NotNull
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  @JsonProperty("logprobs")
  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  /**
   **/
  public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("finish_reason")
  @NotNull
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  @JsonProperty("finish_reason")
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

