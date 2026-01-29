package apimodels;

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
 * TranscriptionSegment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TranscriptionSegment   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("seek")
  @NotNull

  private Integer seek;

  @JsonProperty("start")
  @NotNull

  private Float start;

  @JsonProperty("end")
  @NotNull

  private Float end;

  @JsonProperty("text")
  @NotNull

  private String text;

  @JsonProperty("tokens")
  @NotNull

  private List<Integer> tokens = new ArrayList<>();

  @JsonProperty("temperature")
  @NotNull

  private Float temperature;

  @JsonProperty("avg_logprob")
  @NotNull

  private Float avgLogprob;

  @JsonProperty("compression_ratio")
  @NotNull

  private Float compressionRatio;

  @JsonProperty("no_speech_prob")
  @NotNull

  private Float noSpeechProb;

  public TranscriptionSegment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the segment.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, transcriptionSegment.id) &&
        Objects.equals(seek, transcriptionSegment.seek) &&
        Objects.equals(start, transcriptionSegment.start) &&
        Objects.equals(end, transcriptionSegment.end) &&
        Objects.equals(text, transcriptionSegment.text) &&
        Objects.equals(tokens, transcriptionSegment.tokens) &&
        Objects.equals(temperature, transcriptionSegment.temperature) &&
        Objects.equals(avgLogprob, transcriptionSegment.avgLogprob) &&
        Objects.equals(compressionRatio, transcriptionSegment.compressionRatio) &&
        Objects.equals(noSpeechProb, transcriptionSegment.noSpeechProb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

