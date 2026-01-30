package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateTranslationResponseJson;
import org.openapitools.model.CreateTranslationResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateTranslation200Response   {
  @JsonProperty("text")
  private String text;

  @JsonProperty("language")
  private String language;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("segments")
  private List<TranscriptionSegment> segments = null;

  /**
   * The translated text.
   **/
  public CreateTranslation200Response text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The translated text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * The language of the output translation (always `english`).
   **/
  public CreateTranslation200Response language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language of the output translation (always `english`).")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The duration of the input audio.
   **/
  public CreateTranslation200Response duration(String duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * Segments of the translated text and their corresponding details.
   **/
  public CreateTranslation200Response segments(List<TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  
  @ApiModelProperty(value = "Segments of the translated text and their corresponding details.")
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
    CreateTranslation200Response createTranslation200Response = (CreateTranslation200Response) o;
    return Objects.equals(text, createTranslation200Response.text) &&
        Objects.equals(language, createTranslation200Response.language) &&
        Objects.equals(duration, createTranslation200Response.duration) &&
        Objects.equals(segments, createTranslation200Response.segments);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

