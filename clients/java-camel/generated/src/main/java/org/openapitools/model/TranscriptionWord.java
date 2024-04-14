package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TranscriptionWord
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TranscriptionWord {

  private String word;

  private Float start;

  private Float end;

  public TranscriptionWord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TranscriptionWord(String word, Float start, Float end) {
    this.word = word;
    this.start = start;
    this.end = end;
  }

  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

  /**
   * The text content of the word.
   * @return word
  */
  @NotNull 
  @Schema(name = "word", description = "The text content of the word.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("word")
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
  */
  @NotNull 
  @Schema(name = "start", description = "Start time of the word in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
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
  */
  @NotNull 
  @Schema(name = "end", description = "End time of the word in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end")
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

