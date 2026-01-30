package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */

@Schema(name = "CreateTranscriptionResponseVerboseJson", description = "Represents a verbose json transcription response returned by model, based on the provided input.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateTranscriptionResponseVerboseJson implements CreateTranscription200Response {

  private String language;

  private String duration;

  private String text;

  @Valid
  private List<@Valid TranscriptionWord> words = new ArrayList<>();

  @Valid
  private List<@Valid TranscriptionSegment> segments = new ArrayList<>();

  public CreateTranscriptionResponseVerboseJson() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTranscriptionResponseVerboseJson(String language, String duration, String text) {
    this.language = language;
    this.duration = duration;
    this.text = text;
  }

  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the input audio.
   * @return language
   */
  @NotNull 
  @Schema(name = "language", description = "The language of the input audio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateTranscriptionResponseVerboseJson duration(String duration) {
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

  public CreateTranscriptionResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The transcribed text.
   * @return text
   */
  @NotNull 
  @Schema(name = "text", description = "The transcribed text.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateTranscriptionResponseVerboseJson words(List<@Valid TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addWordsItem(TranscriptionWord wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

  /**
   * Extracted words and their corresponding timestamps.
   * @return words
   */
  @Valid 
  @Schema(name = "words", description = "Extracted words and their corresponding timestamps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("words")
  public List<@Valid TranscriptionWord> getWords() {
    return words;
  }

  public void setWords(List<@Valid TranscriptionWord> words) {
    this.words = words;
  }

  public CreateTranscriptionResponseVerboseJson segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscriptionResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * Segments of the transcribed text and their corresponding details.
   * @return segments
   */
  @Valid 
  @Schema(name = "segments", description = "Segments of the transcribed text and their corresponding details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(this.language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(this.duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(this.text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(this.words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(this.segments, createTranscriptionResponseVerboseJson.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, words, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscriptionResponseVerboseJson {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

