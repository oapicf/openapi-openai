/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TranscriptionWord {
  
  @SerializedName("word")
  private String word = null;
  @SerializedName("start")
  private Float start = null;
  @SerializedName("end")
  private Float end = null;

  /**
   * The text content of the word.
   **/
  @ApiModelProperty(required = true, value = "The text content of the word.")
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }

  /**
   * Start time of the word in seconds.
   **/
  @ApiModelProperty(required = true, value = "Start time of the word in seconds.")
  public Float getStart() {
    return start;
  }
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the word in seconds.
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
    return (this.word == null ? transcriptionWord.word == null : this.word.equals(transcriptionWord.word)) &&
        (this.start == null ? transcriptionWord.start == null : this.start.equals(transcriptionWord.start)) &&
        (this.end == null ? transcriptionWord.end == null : this.end.equals(transcriptionWord.end));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.word == null ? 0: this.word.hashCode());
    result = 31 * result + (this.start == null ? 0: this.start.hashCode());
    result = 31 * result + (this.end == null ? 0: this.end.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionWord {\n");
    
    sb.append("  word: ").append(word).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}