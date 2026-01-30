package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateTranslationResponseVerboseJson   {
  @JsonProperty("language")
  private String language;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("text")
  private String text;

  @JsonProperty("segments")
  private List<TranscriptionSegment> segments = null;

  /**
   * The language of the output translation (always `english`).
   **/
  public CreateTranslationResponseVerboseJson language(String language) {
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
  public CreateTranslationResponseVerboseJson duration(String duration) {
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
   * The translated text.
   **/
  public CreateTranslationResponseVerboseJson text(String text) {
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
   * Segments of the translated text and their corresponding details.
   **/
  public CreateTranslationResponseVerboseJson segments(List<TranscriptionSegment> segments) {
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

