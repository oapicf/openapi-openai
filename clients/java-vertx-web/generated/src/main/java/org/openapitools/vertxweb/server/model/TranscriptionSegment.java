package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TranscriptionSegment   {
  
  private Integer id;
  private Integer seek;
  private Float start;
  private Float end;
  private String text;
  private List<Integer> tokens = new ArrayList<>();
  private Float temperature;
  private Float avgLogprob;
  private Float compressionRatio;
  private Float noSpeechProb;

  public TranscriptionSegment () {

  }

  public TranscriptionSegment (Integer id, Integer seek, Float start, Float end, String text, List<Integer> tokens, Float temperature, Float avgLogprob, Float compressionRatio, Float noSpeechProb) {
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("seek")
  public Integer getSeek() {
    return seek;
  }
  public void setSeek(Integer seek) {
    this.seek = seek;
  }

    
  @JsonProperty("start")
  public Float getStart() {
    return start;
  }
  public void setStart(Float start) {
    this.start = start;
  }

    
  @JsonProperty("end")
  public Float getEnd() {
    return end;
  }
  public void setEnd(Float end) {
    this.end = end;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("tokens")
  public List<Integer> getTokens() {
    return tokens;
  }
  public void setTokens(List<Integer> tokens) {
    this.tokens = tokens;
  }

    
  @JsonProperty("temperature")
  public Float getTemperature() {
    return temperature;
  }
  public void setTemperature(Float temperature) {
    this.temperature = temperature;
  }

    
  @JsonProperty("avg_logprob")
  public Float getAvgLogprob() {
    return avgLogprob;
  }
  public void setAvgLogprob(Float avgLogprob) {
    this.avgLogprob = avgLogprob;
  }

    
  @JsonProperty("compression_ratio")
  public Float getCompressionRatio() {
    return compressionRatio;
  }
  public void setCompressionRatio(Float compressionRatio) {
    this.compressionRatio = compressionRatio;
  }

    
  @JsonProperty("no_speech_prob")
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
