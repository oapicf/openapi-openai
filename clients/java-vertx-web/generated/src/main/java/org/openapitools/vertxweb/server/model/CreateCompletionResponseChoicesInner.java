package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CreateCompletionResponseChoicesInnerLogprobs;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCompletionResponseChoicesInner   {
  


  public enum FinishReasonEnum {
    STOP("stop"),
    LENGTH("length"),
    CONTENT_FILTER("content_filter");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FinishReasonEnum finishReason;
  private Integer index;
  private CreateCompletionResponseChoicesInnerLogprobs logprobs;
  private String text;

  public CreateCompletionResponseChoicesInner () {

  }

  public CreateCompletionResponseChoicesInner (FinishReasonEnum finishReason, Integer index, CreateCompletionResponseChoicesInnerLogprobs logprobs, String text) {
    this.finishReason = finishReason;
    this.index = index;
    this.logprobs = logprobs;
    this.text = text;
  }

    
  @JsonProperty("finish_reason")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }
  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("logprobs")
  public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }

    
  @JsonProperty("text")
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
    CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
    return Objects.equals(finishReason, createCompletionResponseChoicesInner.finishReason) &&
        Objects.equals(index, createCompletionResponseChoicesInner.index) &&
        Objects.equals(logprobs, createCompletionResponseChoicesInner.logprobs) &&
        Objects.equals(text, createCompletionResponseChoicesInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInner {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
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
