package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateTranslationResponseJson;
import org.openapitools.model.CreateTranslationResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTranslation200Response  {
  
  @ApiModelProperty(required = true, value = "The translated text.")
 /**
   * The translated text.
  **/
  private String text;

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

  @ApiModelProperty(value = "Segments of the translated text and their corresponding details.")
  @Valid
 /**
   * Segments of the translated text and their corresponding details.
  **/
  private List<@Valid TranscriptionSegment> segments;
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

  public CreateTranslation200Response text(String text) {
    this.text = text;
    return this;
  }

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

  public CreateTranslation200Response language(String language) {
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

  public CreateTranslation200Response duration(String duration) {
    this.duration = duration;
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

  public CreateTranslation200Response segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranslation200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
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
    CreateTranslation200Response createTranslation200Response = (CreateTranslation200Response) o;
    return Objects.equals(this.text, createTranslation200Response.text) &&
        Objects.equals(this.language, createTranslation200Response.language) &&
        Objects.equals(this.duration, createTranslation200Response.duration) &&
        Objects.equals(this.segments, createTranslation200Response.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, duration, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranslation200Response {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

