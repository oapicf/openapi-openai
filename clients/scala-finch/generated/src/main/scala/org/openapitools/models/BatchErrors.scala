package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchErrorsDataInner
import scala.collection.immutable.Seq

/**
 * 
 * @param _object The object type, which is always `list`.
 * @param data 
 */
case class BatchErrors(_object: Option[String],
                data: Option[Seq[BatchErrorsDataInner]]
                )

object BatchErrors {
    /**
     * Creates the codec for converting BatchErrors from and to JSON.
     */
    implicit val decoder: Decoder[BatchErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[BatchErrors] = deriveEncoder
}
