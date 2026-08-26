package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public TranscriptionSegment() {
    // JSON-B / Jackson
    }

    /**
     * Create TranscriptionSegment.
     *
     * @param id Unique identifier of the segment.
     * @param seek Seek offset of the segment.
     * @param start Start time of the segment in seconds.
     * @param end End time of the segment in seconds.
     * @param text Text content of the segment.
     * @param tokens Array of token IDs for the text content.
     * @param temperature Temperature parameter used for generating the segment.
     * @param avgLogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
     * @param compressionRatio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
     * @param noSpeechProb Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
     */
    public TranscriptionSegment(
        Integer id, 
        Integer seek, 
        Float start, 
        Float end, 
        String text, 
        List<Integer> tokens, 
        Float temperature, 
        Float avgLogprob, 
        Float compressionRatio, 
        Float noSpeechProb
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
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Seek offset of the segment.
     * @return seek
     */
    public Integer getSeek() {
        return seek;
    }

    public void setSeek(Integer seek) {
        this.seek = seek;
    }

    /**
     * Start time of the segment in seconds.
     * @return start
     */
    public Float getStart() {
        return start;
    }

    public void setStart(Float start) {
        this.start = start;
    }

    /**
     * End time of the segment in seconds.
     * @return end
     */
    public Float getEnd() {
        return end;
    }

    public void setEnd(Float end) {
        this.end = end;
    }

    /**
     * Text content of the segment.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Array of token IDs for the text content.
     * @return tokens
     */
    public List<Integer> getTokens() {
        return tokens;
    }

    public void setTokens(List<Integer> tokens) {
        this.tokens = tokens;
    }

    /**
     * Temperature parameter used for generating the segment.
     * @return temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
     * @return avgLogprob
     */
    public Float getAvgLogprob() {
        return avgLogprob;
    }

    public void setAvgLogprob(Float avgLogprob) {
        this.avgLogprob = avgLogprob;
    }

    /**
     * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
     * @return compressionRatio
     */
    public Float getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Float compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    /**
     * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
     * @return noSpeechProb
     */
    public Float getNoSpeechProb() {
        return noSpeechProb;
    }

    public void setNoSpeechProb(Float noSpeechProb) {
        this.noSpeechProb = noSpeechProb;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

