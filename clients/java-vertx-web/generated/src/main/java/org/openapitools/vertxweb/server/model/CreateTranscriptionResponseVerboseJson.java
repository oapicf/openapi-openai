package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TranscriptionSegment;
import org.openapitools.vertxweb.server.model.TranscriptionWord;

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTranscriptionResponseVerboseJson   {
  
  private String language;
  private String duration;
  private String text;
  private List<TranscriptionWord> words;
  private List<TranscriptionSegment> segments;

  public CreateTranscriptionResponseVerboseJson () {

  }

  public CreateTranscriptionResponseVerboseJson (String language, String duration, String text, List<TranscriptionWord> words, List<TranscriptionSegment> segments) {
    this.language = language;
    this.duration = duration;
    this.text = text;
    this.words = words;
    this.segments = segments;
  }

    
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

    
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("words")
  public List<TranscriptionWord> getWords() {
    return words;
  }
  public void setWords(List<TranscriptionWord> words) {
    this.words = words;
  }

    
  @JsonProperty("segments")
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(segments, createTranscriptionResponseVerboseJson.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, words, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionResponseVerboseJson {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
