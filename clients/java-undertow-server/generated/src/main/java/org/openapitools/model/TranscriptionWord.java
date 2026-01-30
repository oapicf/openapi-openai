/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionWord   {
  
  private String word;
  private Float start;
  private Float end;

  /**
   * The text content of the word.
   */
  public TranscriptionWord word(String word) {
    this.word = word;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text content of the word.")
  @JsonProperty("word")
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }

  /**
   * Start time of the word in seconds.
   */
  public TranscriptionWord start(Float start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the word in seconds.")
  @JsonProperty("start")
  public Float getStart() {
    return start;
  }
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the word in seconds.
   */
  public TranscriptionWord end(Float end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "End time of the word in seconds.")
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
    return Objects.equals(word, transcriptionWord.word) &&
        Objects.equals(start, transcriptionWord.start) &&
        Objects.equals(end, transcriptionWord.end);
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

