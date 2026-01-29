package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TranscriptionWord  {
  
 /**
  * The text content of the word.
  */
  @ApiModelProperty(required = true, value = "The text content of the word.")

  private String word;

 /**
  * Start time of the word in seconds.
  */
  @ApiModelProperty(required = true, value = "Start time of the word in seconds.")

  private Float start;

 /**
  * End time of the word in seconds.
  */
  @ApiModelProperty(required = true, value = "End time of the word in seconds.")

  private Float end;
 /**
   * The text content of the word.
   * @return word
  **/
  @JsonProperty("word")
  @NotNull
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

 /**
   * Start time of the word in seconds.
   * @return start
  **/
  @JsonProperty("start")
  @NotNull
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  public TranscriptionWord start(Float start) {
    this.start = start;
    return this;
  }

 /**
   * End time of the word in seconds.
   * @return end
  **/
  @JsonProperty("end")
  @NotNull
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }

  public TranscriptionWord end(Float end) {
    this.end = end;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

