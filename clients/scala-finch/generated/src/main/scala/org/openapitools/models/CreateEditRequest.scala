package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateEditRequestModel

/**
 * 
 * @param model 
 * @param input The input text to use as a starting point for the edit.
 * @param instruction The instruction that tells the model how to edit the prompt.
 * @param n How many edits to generate for the input and instruction.
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
 * @param topUnderscorep An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
 */
case class CreateEditRequest(model: CreateEditRequestModel,
                input: Option[String],
                instruction: String,
                n: Option[Int],
                temperature: Option[BigDecimal],
                topUnderscorep: Option[BigDecimal]
                )

object CreateEditRequest {
    /**
     * Creates the codec for converting CreateEditRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateEditRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEditRequest] = deriveEncoder
}
