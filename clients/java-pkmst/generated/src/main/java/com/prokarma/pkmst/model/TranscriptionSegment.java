package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TranscriptionSegment
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TranscriptionSegment   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("seek")
  private Integer seek;

  @JsonProperty("start")
  private Float start;

  @JsonProperty("end")
  private Float end;

  @JsonProperty("text")
  private String text;

  @JsonProperty("tokens")
  
  private List<Integer> tokens = new ArrayList<>();

  @JsonProperty("temperature")
  private Float temperature;

  @JsonProperty("avg_logprob")
  private Float avgLogprob;

  @JsonProperty("compression_ratio")
  private Float compressionRatio;

  @JsonProperty("no_speech_prob")
  private Float noSpeechProb;

  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the segment.
   * @return id
   */
  @ApiModelProperty(required = true, value = "Unique identifier of the segment.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

  /**
   * Seek offset of the segment.
   * @return seek
   */
  @ApiModelProperty(required = true, value = "Seek offset of the segment.")
  public Integer getSeek() {
    return seek;
  }

  public void setSeek(Integer seek) {
    this.seek = seek;
  }

  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

  /**
   * Start time of the segment in seconds.
   * @return start
   */
  @ApiModelProperty(required = true, value = "Start time of the segment in seconds.")
  public Float getStart() {
    return start;
  }

  public void setStart(Float start) {
    this.start = start;
  }

  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

  /**
   * End time of the segment in seconds.
   * @return end
   */
  @ApiModelProperty(required = true, value = "End time of the segment in seconds.")
  public Float getEnd() {
    return end;
  }

  public void setEnd(Float end) {
    this.end = end;
  }

  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text content of the segment.
   * @return text
   */
  @ApiModelProperty(required = true, value = "Text content of the segment.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  public TranscriptionSegment addTokensItem(Integer tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Array of token IDs for the text content.
   * @return tokens
   */
  @ApiModelProperty(required = true, value = "Array of token IDs for the text content.")
  public List<Integer> getTokens() {
    return tokens;
  }

  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Temperature parameter used for generating the segment.
   * @return temperature
   */
  @ApiModelProperty(required = true, value = "Temperature parameter used for generating the segment.")
  public Float getTemperature() {
    return temperature;
  }

  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

  /**
   * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
   * @return avgLogprob
   */
  @ApiModelProperty(required = true, value = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.")
  public Float getAvgLogprob() {
    return avgLogprob;
  }

  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

  /**
   * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
   * @return compressionRatio
   */
  @ApiModelProperty(required = true, value = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.")
  public Float getCompressionRatio() {
    return compressionRatio;
  }

  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
    return this;
  }

  /**
   * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
   * @return noSpeechProb
   */
  @ApiModelProperty(required = true, value = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.")
  public Float getNoSpeechProb() {
    return noSpeechProb;
  }

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

