package org.openapitools.model;

import org.openapitools.model.TranscriptionSegment;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateTranslationResponseVerboseJson implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The language of the output translation (always &#x60;english&#x60;).
   */
  @JsonProperty("language")
  private String language;

  /**
   * The duration of the input audio.
   */
  @JsonProperty("duration")
  private String duration;

  /**
   * The translated text.
   */
  @JsonProperty("text")
  private String text;

  /**
   * Segments of the translated text and their corresponding details.
   */
  @JsonProperty("segments")
  private List<TranscriptionSegment> segments = new ArrayList<>();

  /**
   * The language of the output translation (always &#x60;english&#x60;).
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
   * The translated text.
   * @return text
   */
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  /**
   * Segments of the translated text and their corresponding details.
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
    CreateTranslationResponseVerboseJson createTranslationResponseVerboseJson = (CreateTranslationResponseVerboseJson) o;
    return Objects.equals(this.language, createTranslationResponseVerboseJson.language) &&
        Objects.equals(this.duration, createTranslationResponseVerboseJson.duration) &&
        Objects.equals(this.text, createTranslationResponseVerboseJson.text) &&
        Objects.equals(this.segments, createTranslationResponseVerboseJson.segments);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
