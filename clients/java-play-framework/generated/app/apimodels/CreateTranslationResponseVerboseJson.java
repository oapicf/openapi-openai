package apimodels;

import apimodels.TranscriptionSegment;
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
 * CreateTranslationResponseVerboseJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateTranslationResponseVerboseJson   {
  @JsonProperty("language")
  @NotNull

  private String language;

  @JsonProperty("duration")
  @NotNull

  private String duration;

  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("segments")
  @Valid

  private List<@Valid TranscriptionSegment> segments = null;

  public CreateTranslationResponseVerboseJson language(String language) {
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

  public CreateTranslationResponseVerboseJson duration(String duration) {
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

  public CreateTranslationResponseVerboseJson text(String text) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

