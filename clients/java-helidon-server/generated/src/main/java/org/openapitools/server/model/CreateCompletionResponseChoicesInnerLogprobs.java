package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateCompletionResponseChoicesInnerLogprobs   {

    private List<Integer> textOffset = new ArrayList<>();
    private List<BigDecimal> tokenLogprobs = new ArrayList<>();
    private List<String> tokens = new ArrayList<>();
    private List<Map<String, BigDecimal>> topLogprobs = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateCompletionResponseChoicesInnerLogprobs() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateCompletionResponseChoicesInnerLogprobs.
     *
     * @param textOffset textOffset
     * @param tokenLogprobs tokenLogprobs
     * @param tokens tokens
     * @param topLogprobs topLogprobs
     */
    public CreateCompletionResponseChoicesInnerLogprobs(
        List<Integer> textOffset, 
        List<BigDecimal> tokenLogprobs, 
        List<String> tokens, 
        List<Map<String, BigDecimal>> topLogprobs
    ) {
        this.textOffset = textOffset;
        this.tokenLogprobs = tokenLogprobs;
        this.tokens = tokens;
        this.topLogprobs = topLogprobs;
    }



    /**
     * Get textOffset
     * @return textOffset
     */
    public List<Integer> getTextOffset() {
        return textOffset;
    }

    public void setTextOffset(List<Integer> textOffset) {
        this.textOffset = textOffset;
    }

    /**
     * Get tokenLogprobs
     * @return tokenLogprobs
     */
    public List<BigDecimal> getTokenLogprobs() {
        return tokenLogprobs;
    }

    public void setTokenLogprobs(List<BigDecimal> tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
    }

    /**
     * Get tokens
     * @return tokens
     */
    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    /**
     * Get topLogprobs
     * @return topLogprobs
     */
    public List<Map<String, BigDecimal>> getTopLogprobs() {
        return topLogprobs;
    }

    public void setTopLogprobs(List<Map<String, BigDecimal>> topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
        
        sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n");
        sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n");
        sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
        sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
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

