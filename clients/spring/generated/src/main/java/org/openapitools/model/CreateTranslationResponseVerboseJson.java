package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateTranslationResponseVerboseJson
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-14T13:54:16.789070334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateTranslationResponseVerboseJson implements CreateTranslation200Response {

  private String language;

  private String duration;

  private String text;

  @Valid
  private List<@Valid TranscriptionSegment> segments;

  public CreateTranslationResponseVerboseJson() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTranslationResponseVerboseJson(String language, String duration, String text) {
    this.language = language;
    this.duration = duration;
    this.text = text;
  }

  public CreateTranslationResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the output translation (always `english`).
   * @return language
  */
  @NotNull 
  @Schema(name = "language", description = "The language of the output translation (always `english`).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranslationResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the input audio.
   * @return duration
  */
  @NotNull 
  @Schema(name = "duration", description = "The duration of the input audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranslationResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The translated text.
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "The translated text.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranslationResponseVerboseJson segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranslationResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Segments of the translated text and their corresponding details.
   * @return segments
  */
  @Valid 
  @Schema(name = "segments", description = "Segments of the translated text and their corresponding details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("segments")
  public List<@Valid TranscriptionSegment> getSegments() {
    return segments;
  }

  public void setSegments(List<@Valid TranscriptionSegment> segments) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

