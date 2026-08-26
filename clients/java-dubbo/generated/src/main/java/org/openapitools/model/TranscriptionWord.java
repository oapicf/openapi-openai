package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TranscriptionWord implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The text content of the word.
   */
  @JsonProperty("word")
  private String word;

  /**
   * Start time of the word in seconds.
   */
  @JsonProperty("start")
  private Float start;

  /**
   * End time of the word in seconds.
   */
  @JsonProperty("end")
  private Float end;

  /**
   * The text content of the word.
   * @return word
   */
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  /**
   * Start time of the word in seconds.
   * @return start
   */
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the word in seconds.
   * @return end
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
