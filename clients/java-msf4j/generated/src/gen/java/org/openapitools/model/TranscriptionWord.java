package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TranscriptionWord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionWord   {
  @JsonProperty("word")
  private String word;

  @JsonProperty("start")
  private Float start;

  @JsonProperty("end")
  private Float end;

  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

   /**
   * The text content of the word.
   * @return word
  **/
  @ApiModelProperty(required = true, value = "The text content of the word.")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public TranscriptionWord start(Float start) {
    this.start = start;
    return this;
  }

   /**
   * Start time of the word in seconds.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "Start time of the word in seconds.")
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  public TranscriptionWord end(Float end) {
    this.end = end;
    return this;
  }

   /**
   * End time of the word in seconds.
   * @return end
  **/
  @ApiModelProperty(required = true, value = "End time of the word in seconds.")
  public Float getEnd() {
    return end;
  }

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

