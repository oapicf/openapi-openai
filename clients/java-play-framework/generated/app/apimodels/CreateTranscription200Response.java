package apimodels;

import apimodels.CreateTranscriptionResponseJson;
import apimodels.CreateTranscriptionResponseVerboseJson;
import apimodels.TranscriptionSegment;
import apimodels.TranscriptionWord;
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
 * CreateTranscription200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateTranscription200Response   {
  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("language")
  @NotNull

  private String language;

  @JsonProperty("duration")
  @NotNull

  private String duration;

  @JsonProperty("words")
  @Valid

  private List<@Valid TranscriptionWord> words = null;

  @JsonProperty("segments")
  @Valid

  private List<@Valid TranscriptionSegment> segments = null;

  public CreateTranscription200Response text(String text) {
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

  public CreateTranscription200Response language(String language) {
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

  public CreateTranscription200Response duration(String duration) {
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

  public CreateTranscription200Response words(List<@Valid TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  public CreateTranscription200Response addWordsItem(TranscriptionWord wordsItem) {
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

  public CreateTranscription200Response segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  public CreateTranscription200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
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
    CreateTranscription200Response createTranscription200Response = (CreateTranscription200Response) o;
    return Objects.equals(text, createTranscription200Response.text) &&
        Objects.equals(language, createTranscription200Response.language) &&
        Objects.equals(duration, createTranscription200Response.duration) &&
        Objects.equals(words, createTranscription200Response.words) &&
        Objects.equals(segments, createTranscription200Response.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, duration, words, segments);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTranscription200Response {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

