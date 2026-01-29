package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TranscriptionSegment;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTranslationResponseVerboseJson   {
  
  private String language;
  private String duration;
  private String text;
  private List<TranscriptionSegment> segments = new ArrayList<>();

  public CreateTranslationResponseVerboseJson () {

  }

  public CreateTranslationResponseVerboseJson (String language, String duration, String text, List<TranscriptionSegment> segments) {
    this.language = language;
    this.duration = duration;
    this.text = text;
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
    CreateTranslationResponseVerboseJson createTranslationResponseVerboseJson = (CreateTranslationResponseVerboseJson) o;
    return Objects.equals(language, createTranslationResponseVerboseJson.language) &&
        Objects.equals(duration, createTranslationResponseVerboseJson.duration) &&
        Objects.equals(text, createTranslationResponseVerboseJson.text) &&
        Objects.equals(segments, createTranslationResponseVerboseJson.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslationResponseVerboseJson {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
