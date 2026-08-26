package org.openapitools.model;

import org.openapitools.model.CreateTranscriptionResponseJson;
import org.openapitools.model.CreateTranscriptionResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateTranscription200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The transcribed text.
   */
  @JsonProperty("text")
  private String text;

  /**
   * The language of the input audio.
   */
  @JsonProperty("language")
  private String language;

  /**
   * The duration of the input audio.
   */
  @JsonProperty("duration")
  private String duration;

  /**
   * Extracted words and their corresponding timestamps.
   */
  @JsonProperty("words")
  private List<TranscriptionWord> words = new ArrayList<>();

  /**
   * Segments of the transcribed text and their corresponding details.
   */
  @JsonProperty("segments")
  private List<TranscriptionSegment> segments = new ArrayList<>();

  /**
   * The transcribed text.
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * The language of the input audio.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The duration of the input audio.
   * @return duration
   */
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * Extracted words and their corresponding timestamps.
   * @return words
   */
  public List<TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

  /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
   */
  public List<TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<TranscriptionSegment> segments) {
    this.segments = segments;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
