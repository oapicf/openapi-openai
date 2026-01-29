package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaObjectDelta

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread.run.step.delta`.
 * @param delta 
 */
case class RunStepDeltaObject(id: String,
                _object: String,
                delta: RunStepDeltaObjectDelta
                )

object RunStepDeltaObject {
    /**
     * Creates the codec for converting RunStepDeltaObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaObject] = deriveEncoder
}
