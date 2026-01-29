package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Represents a transcription response returned by model, based on the provided input.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Represents a transcription response returned by model, based on the provided input.")
public class CreateTranscriptionResponseJson   {
  
  private String text;

  /**
   * The transcribed text.
   **/
  public CreateTranscriptionResponseJson text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The transcribed text.")
  @JsonProperty("text")
  @NotNull
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
    CreateTranscriptionResponseJson createTranscriptionResponseJson = (CreateTranscriptionResponseJson) o;
    return Objects.equals(this.text, createTranscriptionResponseJson.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionResponseJson {\n");
    
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

