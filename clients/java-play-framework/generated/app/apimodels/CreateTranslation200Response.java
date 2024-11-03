package apimodels;

import apimodels.CreateTranslationResponseJson;
import apimodels.CreateTranslationResponseVerboseJson;
import apimodels.TranscriptionSegment;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateTranslation200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateTranslation200Response   {
  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("language")
  @NotNull

  private String language;

  @JsonProperty("duration")
  @NotNull

  private String duration;

  @JsonProperty("segments")
  @Valid

  private List<@Valid TranscriptionSegment> segments = null;

  public CreateTranslation200Response text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The translated text.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranslation200Response language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the output translation (always `english`).
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranslation200Response duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the input audio.
   * @return duration
  **/
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public CreateTranslation200Response segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranslation200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * Segments of the translated text and their corresponding details.
   * @return segments
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

