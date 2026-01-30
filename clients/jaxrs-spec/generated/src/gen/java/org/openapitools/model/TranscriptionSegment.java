package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TranscriptionSegment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionSegment   {
  private Integer id;
  private Integer seek;
  private Float start;
  private Float end;
  private String text;
  private @Valid List<Integer> tokens = new ArrayList<>();
  private Float temperature;
  private Float avgLogprob;
  private Float compressionRatio;
  private Float noSpeechProb;

  public TranscriptionSegment() {
  }

  @JsonCreator
  public TranscriptionSegment(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "seek") Integer seek,
    @JsonProperty(required = true, value = "start") Float start,
    @JsonProperty(required = true, value = "end") Float end,
    @JsonProperty(required = true, value = "text") String text,
    @JsonProperty(required = true, value = "tokens") List<Integer> tokens,
    @JsonProperty(required = true, value = "temperature") Float temperature,
    @JsonProperty(required = true, value = "avg_logprob") Float avgLogprob,
    @JsonProperty(required = true, value = "compression_ratio") Float compressionRatio,
    @JsonProperty(required = true, value = "no_speech_prob") Float noSpeechProb
  ) {
    this.id = id;
    this.seek = seek;
    this.start = start;
    this.end = end;
    this.text = text;
    this.tokens = tokens;
    this.temperature = temperature;
    this.avgLogprob = avgLogprob;
    this.compressionRatio = compressionRatio;
    this.noSpeechProb = noSpeechProb;
  }

  /**
   * Unique identifier of the segment.
   **/
  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the segment.")
  @JsonProperty(required = true, value = "id")
  @NotNull public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Seek offset of the segment.
   **/
  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Seek offset of the segment.")
  @JsonProperty(required = true, value = "seek")
  @NotNull public Integer getSeek() {
    return seek;
  }

  @JsonProperty(required = true, value = "seek")
  public void setSeek(Integer seek) {
    this.seek = seek;
  }

  /**
   * Start time of the segment in seconds.
   **/
  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the segment in seconds.")
  @JsonProperty(required = true, value = "start")
  @NotNull public Float getStart() {
    return start;
  }

  @JsonProperty(required = true, value = "start")
  public void setStart(Float start) {
    this.start = start;
  }

  /**
   * End time of the segment in seconds.
   **/
  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "End time of the segment in seconds.")
  @JsonProperty(required = true, value = "end")
  @NotNull public Float getEnd() {
    return end;
  }

  @JsonProperty(required = true, value = "end")
  public void setEnd(Float end) {
    this.end = end;
  }

  /**
   * Text content of the segment.
   **/
  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Text content of the segment.")
  @JsonProperty(required = true, value = "text")
  @NotNull public String getText() {
    return text;
  }

  @JsonProperty(required = true, value = "text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Array of token IDs for the text content.
   **/
  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of token IDs for the text content.")
  @JsonProperty(required = true, value = "tokens")
  @NotNull public List<Integer> getTokens() {
    return tokens;
  }

  @JsonProperty(required = true, value = "tokens")
  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  public TranscriptionSegment addTokensItem(Integer tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }

    this.tokens.add(tokensItem);
    return this;
  }

  public TranscriptionSegment removeTokensItem(Integer tokensItem) {
    if (tokensItem != null && this.tokens != null) {
      this.tokens.remove(tokensItem);
    }

    return this;
  }
  /**
   * Temperature parameter used for generating the segment.
   **/
  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Temperature parameter used for generating the segment.")
  @JsonProperty(required = true, value = "temperature")
  @NotNull public Float getTemperature() {
    return temperature;
  }

  @JsonProperty(required = true, value = "temperature")
  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   **/
  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.")
  @JsonProperty(required = true, value = "avg_logprob")
  @NotNull public Float getAvgLogprob() {
    return avgLogprob;
  }

  @JsonProperty(required = true, value = "avg_logprob")
  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   **/
  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.")
  @JsonProperty(required = true, value = "compression_ratio")
  @NotNull public Float getCompressionRatio() {
    return compressionRatio;
  }

  @JsonProperty(required = true, value = "compression_ratio")
  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
   **/
  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.")
  @JsonProperty(required = true, value = "no_speech_prob")
  @NotNull public Float getNoSpeechProb() {
    return noSpeechProb;
  }

  @JsonProperty(required = true, value = "no_speech_prob")
  public void setNoSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionSegment transcriptionSegment = (TranscriptionSegment) o;
    return Objects.equals(this.id, transcriptionSegment.id) &&
        Objects.equals(this.seek, transcriptionSegment.seek) &&
        Objects.equals(this.start, transcriptionSegment.start) &&
        Objects.equals(this.end, transcriptionSegment.end) &&
        Objects.equals(this.text, transcriptionSegment.text) &&
        Objects.equals(this.tokens, transcriptionSegment.tokens) &&
        Objects.equals(this.temperature, transcriptionSegment.temperature) &&
        Objects.equals(this.avgLogprob, transcriptionSegment.avgLogprob) &&
        Objects.equals(this.compressionRatio, transcriptionSegment.compressionRatio) &&
        Objects.equals(this.noSpeechProb, transcriptionSegment.noSpeechProb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seek: ").append(toIndentedString(seek)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    avgLogprob: ").append(toIndentedString(avgLogprob)).append("\n");
    sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
    sb.append("    noSpeechProb: ").append(toIndentedString(noSpeechProb)).append("\n");
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

