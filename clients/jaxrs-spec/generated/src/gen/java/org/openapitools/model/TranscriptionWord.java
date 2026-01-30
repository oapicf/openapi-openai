package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TranscriptionWord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionWord   {
  private String word;
  private Float start;
  private Float end;

  public TranscriptionWord() {
  }

  @JsonCreator
  public TranscriptionWord(
    @JsonProperty(required = true, value = "word") String word,
    @JsonProperty(required = true, value = "start") Float start,
    @JsonProperty(required = true, value = "end") Float end
  ) {
    this.word = word;
    this.start = start;
    this.end = end;
  }

  /**
   * The text content of the word.
   **/
  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text content of the word.")
  @JsonProperty(required = true, value = "word")
  @NotNull public String getWord() {
    return word;
  }

  @JsonProperty(required = true, value = "word")
  public void setWord(String word) {
    this.word = word;
  }

  /**
   * Start time of the word in seconds.
   **/
  public TranscriptionWord start(Float start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the word in seconds.")
  @JsonProperty(required = true, value = "start")
  @NotNull public Float getStart() {
    return start;
  }

  @JsonProperty(required = true, value = "start")
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the word in seconds.
   **/
  public TranscriptionWord end(Float end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "End time of the word in seconds.")
  @JsonProperty(required = true, value = "end")
  @NotNull public Float getEnd() {
    return end;
  }

  @JsonProperty(required = true, value = "end")
  public void setEnd(Float end) {
    this.end = end;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionWord transcriptionWord = (TranscriptionWord) o;
    return Objects.equals(this.word, transcriptionWord.word) &&
        Objects.equals(this.start, transcriptionWord.start) &&
        Objects.equals(this.end, transcriptionWord.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionWord {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

