package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code An error code identifying the error type.
 * @param message A human-readable message providing more details about the error.
 * @param param The name of the parameter that caused the error, if applicable.
 * @param line The line number of the input file where the error occurred, if applicable.
 */
case class BatchErrorsDataInner(code: Option[String],
                message: Option[String],
                param: Option[String],
                line: Option[Int]
                )

object BatchErrorsDataInner {
    /**
     * Creates the codec for converting BatchErrorsDataInner from and to JSON.
     */
    implicit val decoder: Decoder[BatchErrorsDataInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchErrorsDataInner] = deriveEncoder
}
