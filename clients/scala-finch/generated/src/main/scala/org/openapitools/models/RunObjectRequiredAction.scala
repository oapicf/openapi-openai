package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunObjectRequiredActionSubmitToolOutputs

/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 * @param _type For now, this is always `submit_tool_outputs`.
 * @param submitUnderscoretoolUnderscoreoutputs 
 */
case class RunObjectRequiredAction(_type: String,
                submitUnderscoretoolUnderscoreoutputs: RunObjectRequiredActionSubmitToolOutputs
                )

object RunObjectRequiredAction {
    /**
     * Creates the codec for converting RunObjectRequiredAction from and to JSON.
     */
    implicit val decoder: Decoder[RunObjectRequiredAction] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunObjectRequiredAction] = deriveEncoder
}
