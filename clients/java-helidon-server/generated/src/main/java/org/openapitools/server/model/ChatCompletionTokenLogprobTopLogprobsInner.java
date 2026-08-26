package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionTokenLogprobTopLogprobsInner   {

    private String token;
    private BigDecimal logprob;
    private List<Integer> bytes;

    /**
     * Default constructor.
     */
    public ChatCompletionTokenLogprobTopLogprobsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionTokenLogprobTopLogprobsInner.
     *
     * @param token The token.
     * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
     * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
     */
    public ChatCompletionTokenLogprobTopLogprobsInner(
        String token, 
        BigDecimal logprob, 
        List<Integer> bytes
    ) {
        this.token = token;
        this.logprob = logprob;
        this.bytes = bytes;
    }



    /**
     * The token.
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
     * @return logprob
     */
    public BigDecimal getLogprob() {
        return logprob;
    }

    public void setLogprob(BigDecimal logprob) {
        this.logprob = logprob;
    }

    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @return bytes
     */
    public List<Integer> getBytes() {
        return bytes;
    }

    public void setBytes(List<Integer> bytes) {
        this.bytes = bytes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionTokenLogprobTopLogprobsInner {\n");
        
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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

