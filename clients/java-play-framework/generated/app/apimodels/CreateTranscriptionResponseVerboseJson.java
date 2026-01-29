package apimodels;

import apimodels.TranscriptionSegment;
import apimodels.TranscriptionWord;
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
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateTranscriptionResponseVerboseJson   {
  @JsonProperty("language")
  @NotNull

  private String language;

  @JsonProperty("duration")
  @NotNull

  private String duration;

  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("words")
  @Valid

  private List<@Valid TranscriptionWord> words = null;

  @JsonProperty("segments")
  @Valid

  private List<@Valid TranscriptionSegment> segments = null;

  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the input audio.
   * @return language
  **/
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
  **/
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
  **/
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
  **/
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
    CreateTranscriptionResponseVerboseJson createTranscriptionResponseVerboseJson = (CreateTranscriptionResponseVerboseJson) o;
    return Objects.equals(language, createTranscriptionResponseVerboseJson.language) &&
        Objects.equals(duration, createTranscriptionResponseVerboseJson.duration) &&
        Objects.equals(text, createTranscriptionResponseVerboseJson.text) &&
        Objects.equals(words, createTranscriptionResponseVerboseJson.words) &&
        Objects.equals(segments, createTranscriptionResponseVerboseJson.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, duration, text, words, segments);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

