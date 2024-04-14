package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TranscriptionSegment  {
  
 /**
  * Unique identifier of the segment.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the segment.")
  private Integer id;

 /**
  * Seek offset of the segment.
  */
  @ApiModelProperty(required = true, value = "Seek offset of the segment.")
  private Integer seek;

 /**
  * Start time of the segment in seconds.
  */
  @ApiModelProperty(required = true, value = "Start time of the segment in seconds.")
  private Float start;

 /**
  * End time of the segment in seconds.
  */
  @ApiModelProperty(required = true, value = "End time of the segment in seconds.")
  private Float end;

 /**
  * Text content of the segment.
  */
  @ApiModelProperty(required = true, value = "Text content of the segment.")
  private String text;

 /**
  * Array of token IDs for the text content.
  */
  @ApiModelProperty(required = true, value = "Array of token IDs for the text content.")
  private List<Integer> tokens = new ArrayList<>();

 /**
  * Temperature parameter used for generating the segment.
  */
  @ApiModelProperty(required = true, value = "Temperature parameter used for generating the segment.")
  private Float temperature;

 /**
  * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  */
  @ApiModelProperty(required = true, value = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.")
  private Float avgLogprob;

 /**
  * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  */
  @ApiModelProperty(required = true, value = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.")
  private Float compressionRatio;

 /**
  * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
  */
  @ApiModelProperty(required = true, value = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.")
  private Float noSpeechProb;
 /**
  * Unique identifier of the segment.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Seek offset of the segment.
  * @return seek
  */
  @JsonProperty("seek")
  @NotNull
  public Integer getSeek() {
    return seek;
  }

  /**
   * Sets the <code>seek</code> property.
   */
 public void setSeek(Integer seek) {
    this.seek = seek;
  }

  /**
   * Sets the <code>seek</code> property.
   */
  public TranscriptionSegment seek(Integer seek) {
    this.seek = seek;
    return this;
  }

 /**
  * Start time of the segment in seconds.
  * @return start
  */
  @JsonProperty("start")
  @NotNull
  public Float getStart() {
    return start;
  }

  /**
   * Sets the <code>start</code> property.
   */
 public void setStart(Float start) {
    this.start = start;
  }

  /**
   * Sets the <code>start</code> property.
   */
  public TranscriptionSegment start(Float start) {
    this.start = start;
    return this;
  }

 /**
  * End time of the segment in seconds.
  * @return end
  */
  @JsonProperty("end")
  @NotNull
  public Float getEnd() {
    return end;
  }

  /**
   * Sets the <code>end</code> property.
   */
 public void setEnd(Float end) {
    this.end = end;
  }

  /**
   * Sets the <code>end</code> property.
   */
  public TranscriptionSegment end(Float end) {
    this.end = end;
    return this;
  }

 /**
  * Text content of the segment.
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
  public TranscriptionSegment text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Array of token IDs for the text content.
  * @return tokens
  */
  @JsonProperty("tokens")
  @NotNull
  public List<Integer> getTokens() {
    return tokens;
  }

  /**
   * Sets the <code>tokens</code> property.
   */
 public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

  /**
   * Sets the <code>tokens</code> property.
   */
  public TranscriptionSegment tokens(List<Integer> tokens) {
    this.tokens = tokens;
    return this;
  }

  /**
   * Adds a new item to the <code>tokens</code> list.
   */
  public TranscriptionSegment addTokensItem(Integer tokensItem) {
    this.tokens.add(tokensItem);
    return this;
  }

 /**
  * Temperature parameter used for generating the segment.
  * @return temperature
  */
  @JsonProperty("temperature")
  @NotNull
  public Float getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public TranscriptionSegment temperature(Float temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  * @return avgLogprob
  */
  @JsonProperty("avg_logprob")
  @NotNull
  public Float getAvgLogprob() {
    return avgLogprob;
  }

  /**
   * Sets the <code>avgLogprob</code> property.
   */
 public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

  /**
   * Sets the <code>avgLogprob</code> property.
   */
  public TranscriptionSegment avgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
    return this;
  }

 /**
  * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  * @return compressionRatio
  */
  @JsonProperty("compression_ratio")
  @NotNull
  public Float getCompressionRatio() {
    return compressionRatio;
  }

  /**
   * Sets the <code>compressionRatio</code> property.
   */
 public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

  /**
   * Sets the <code>compressionRatio</code> property.
   */
  public TranscriptionSegment compressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
    return this;
  }

 /**
  * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
  * @return noSpeechProb
  */
  @JsonProperty("no_speech_prob")
  @NotNull
  public Float getNoSpeechProb() {
    return noSpeechProb;
  }

  /**
   * Sets the <code>noSpeechProb</code> property.
   */
 public void setNoSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
  }

  /**
   * Sets the <code>noSpeechProb</code> property.
   */
  public TranscriptionSegment noSpeechProb(Float noSpeechProb) {
    this.noSpeechProb = noSpeechProb;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

