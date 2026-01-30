package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTunePreferenceRequestInputInput
import org.openapitools.models.FineTunePreferenceRequestInputPreferredCompletionInner
import scala.collection.immutable.Seq

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 * @param input 
 * @param preferredUnderscorecompletion The preferred completion message for the output.
 * @param nonUnderscorepreferredUnderscorecompletion The non-preferred completion message for the output.
 */
case class FineTunePreferenceRequestInput(input: Option[FineTunePreferenceRequestInputInput],
                preferredUnderscorecompletion: Option[Seq[FineTunePreferenceRequestInputPreferredCompletionInner]],
                nonUnderscorepreferredUnderscorecompletion: Option[Seq[FineTunePreferenceRequestInputPreferredCompletionInner]]
                )

object FineTunePreferenceRequestInput {
    /**
     * Creates the codec for converting FineTunePreferenceRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[FineTunePreferenceRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTunePreferenceRequestInput] = deriveEncoder
}
