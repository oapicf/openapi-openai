package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UsageTimeBucketResultInner
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param startUnderscoretime 
 * @param endUnderscoretime 
 * @param result 
 */
case class UsageTimeBucket(_object: String,
                startUnderscoretime: Int,
                endUnderscoretime: Int,
                result: Seq[UsageTimeBucketResultInner]
                )

object UsageTimeBucket {
    /**
     * Creates the codec for converting UsageTimeBucket from and to JSON.
     */
    implicit val decoder: Decoder[UsageTimeBucket] = deriveDecoder
    implicit val encoder: ObjectEncoder[UsageTimeBucket] = deriveEncoder
}
