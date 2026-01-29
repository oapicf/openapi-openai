package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateTranscriptionResponseJson;
import org.openapitools.model.CreateTranscriptionResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTranscription200Response  {
  
 /**
  * The transcribed text.
  */
  @ApiModelProperty(required = true, value = "The transcribed text.")

  private String text;

 /**
  * The language of the input audio.
  */
  @ApiModelProperty(required = true, value = "The language of the input audio.")

  private String language;

 /**
  * The duration of the input audio.
  */
  @ApiModelProperty(required = true, value = "The duration of the input audio.")

  private String duration;

 /**
  * Extracted words and their corresponding timestamps.
  */
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")

  private List<TranscriptionWord> words = new ArrayList<>();

 /**
  * Segments of the transcribed text and their corresponding details.
  */
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")

  private List<TranscriptionSegment> segments = new ArrayList<>();
 /**
   * The transcribed text.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranscription200Response text(String text) {
    this.text = text;
    return this;
  }

 /**
   * The language of the input audio.
   * @return language
  **/
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranscription200Response language(String language) {
    this.language = language;
    return this;
  }

 /**
   * The duration of the input audio.
   * @return duration
  **/
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranscription200Response duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Extracted words and their corresponding timestamps.
   * @return words
  **/
  @JsonProperty("words")
  public List<TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscription200Response words(List<TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscription200Response addWordsItem(TranscriptionWord wordsItem) {
    this.words.add(wordsItem);
    return this;
  }

 /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
  **/
  @JsonProperty("segments")
  public List<TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<TranscriptionSegment> segments) {
    this.segments = segments;
  }

  public CreateTranscription200Response segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscription200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
    this.segments.add(segmentsItem);
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
    CreateTranscription200Response createTranscription200Response = (CreateTranscription200Response) o;
    return Objects.equals(this.text, createTranscription200Response.text) &&
        Objects.equals(this.language, createTranscription200Response.language) &&
        Objects.equals(this.duration, createTranscription200Response.duration) &&
        Objects.equals(this.words, createTranscription200Response.words) &&
        Objects.equals(this.segments, createTranscription200Response.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, duration, words, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscription200Response {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

