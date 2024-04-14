package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTranslationResponseVerboseJson  {
  
  @ApiModelProperty(required = true, value = "The language of the output translation (always `english`).")
 /**
   * The language of the output translation (always `english`).
  **/
  private String language;

  @ApiModelProperty(required = true, value = "The duration of the input audio.")
 /**
   * The duration of the input audio.
  **/
  private String duration;

  @ApiModelProperty(required = true, value = "The translated text.")
 /**
   * The translated text.
  **/
  private String text;

  @ApiModelProperty(value = "Segments of the translated text and their corresponding details.")
  @Valid
 /**
   * Segments of the translated text and their corresponding details.
  **/
  private List<@Valid TranscriptionSegment> segments;
 /**
   * The language of the output translation (always &#x60;english&#x60;).
   * @return language
  **/
  @JsonProperty("language")
  @NotNull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranslationResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

 /**
   * The duration of the input audio.
   * @return duration
  **/
  @JsonProperty("duration")
  @NotNull
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranslationResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
   * The translated text.
   * @return text
  **/
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranslationResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Segments of the translated text and their corresponding details.
   * @return segments
  **/
  @JsonProperty("segments")
  public List<@Valid TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
  }

  public CreateTranslationResponseVerboseJson segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranslationResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

