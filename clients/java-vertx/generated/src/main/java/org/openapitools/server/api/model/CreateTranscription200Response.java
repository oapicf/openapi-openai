package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CreateTranscriptionResponseJson;
import org.openapitools.server.api.model.CreateTranscriptionResponseVerboseJson;
import org.openapitools.server.api.model.TranscriptionSegment;
import org.openapitools.server.api.model.TranscriptionWord;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTranscription200Response   {
  
  private String text;
  private String language;
  private String duration;
  private List<TranscriptionWord> words = new ArrayList<>();
  private List<TranscriptionSegment> segments = new ArrayList<>();

  public CreateTranscription200Response () {

  }

  public CreateTranscription200Response (String text, String language, String duration, List<TranscriptionWord> words, List<TranscriptionSegment> segments) {
    this.text = text;
    this.language = language;
    this.duration = duration;
    this.words = words;
    this.segments = segments;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
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
    CreateTranscription200Response createTranscription200Response = (CreateTranscription200Response) o;
    return Objects.equals(text, createTranscription200Response.text) &&
        Objects.equals(language, createTranscription200Response.language) &&
        Objects.equals(duration, createTranscription200Response.duration) &&
        Objects.equals(words, createTranscription200Response.words) &&
        Objects.equals(segments, createTranscription200Response.segments);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
