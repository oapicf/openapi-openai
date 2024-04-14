package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TranscriptionSegment;
import org.openapitools.model.TranscriptionWord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
@ApiModel(description="Represents a verbose json transcription response returned by model, based on the provided input.")

public class CreateTranscriptionResponseVerboseJson  {
  
 /**
  * The language of the input audio.
  */
  @ApiModelProperty(required = true, value = "The language of the input audio.")
  private String language;

 /**
  * The duration of the input audio.
  */
  @ApiModelProperty(required = true, value = "The duration of the input audio.")
  private String duration;

 /**
  * The transcribed text.
  */
  @ApiModelProperty(required = true, value = "The transcribed text.")
  private String text;

 /**
  * Extracted words and their corresponding timestamps.
  */
  @ApiModelProperty(value = "Extracted words and their corresponding timestamps.")
  @Valid
  private List<@Valid TranscriptionWord> words;

 /**
  * Segments of the transcribed text and their corresponding details.
  */
  @ApiModelProperty(value = "Segments of the transcribed text and their corresponding details.")
  @Valid
  private List<@Valid TranscriptionSegment> segments;
 /**
  * The language of the input audio.
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public CreateTranscriptionResponseVerboseJson language(String language) {
    this.language = language;
    return this;
  }

 /**
  * The duration of the input audio.
  * @return duration
  */
  @JsonProperty("duration")
  @NotNull
  public String getDuration() {
    return duration;
  }

  /**
   * Sets the <code>duration</code> property.
   */
 public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   * Sets the <code>duration</code> property.
   */
  public CreateTranscriptionResponseVerboseJson duration(String duration) {
    this.duration = duration;
    return this;
  }

 /**
  * The transcribed text.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public CreateTranscriptionResponseVerboseJson text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Extracted words and their corresponding timestamps.
  * @return words
  */
  @JsonProperty("words")
  public List<@Valid TranscriptionWord> getWords() {
    return words;
  }

  /**
   * Sets the <code>words</code> property.
   */
 public void setWords(List<@Valid TranscriptionWord> words) {
    this.words = words;
  }

  /**
   * Sets the <code>words</code> property.
   */
  public CreateTranscriptionResponseVerboseJson words(List<@Valid TranscriptionWord> words) {
    this.words = words;
    return this;
  }

  /**
   * Adds a new item to the <code>words</code> list.
   */
  public CreateTranscriptionResponseVerboseJson addWordsItem(TranscriptionWord wordsItem) {
    this.words.add(wordsItem);
    return this;
  }

 /**
  * Segments of the transcribed text and their corresponding details.
  * @return segments
  */
  @JsonProperty("segments")
  public List<@Valid TranscriptionSegment> getSegments() {
    return segments;
  }

  /**
   * Sets the <code>segments</code> property.
   */
 public void setSegments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
  }

  /**
   * Sets the <code>segments</code> property.
   */
  public CreateTranscriptionResponseVerboseJson segments(List<@Valid TranscriptionSegment> segments) {
    this.segments = segments;
    return this;
  }

  /**
   * Adds a new item to the <code>segments</code> list.
   */
  public CreateTranscriptionResponseVerboseJson addSegmentsItem(TranscriptionSegment segmentsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

