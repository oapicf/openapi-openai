package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateEditRequestModel;

@Canonical
class CreateEditRequest {
    
    CreateEditRequestModel model
    /* The input text to use as a starting point for the edit. */
    String input = ""
    /* The instruction that tells the model how to edit the prompt. */
    String instruction
    /* How many edits to generate for the input and instruction. */
    Integer n = 1
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    BigDecimal temperature = new BigDecimal("1")
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    BigDecimal topP = new BigDecimal("1")
}
