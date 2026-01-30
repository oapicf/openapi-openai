package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param partUnderscoreids The ordered list of Part IDs. 
 * @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
 */
case class CompleteUploadRequest(partUnderscoreids: Seq[String],
                md5: Option[String]
                )

object CompleteUploadRequest {
    /**
     * Creates the codec for converting CompleteUploadRequest from and to JSON.
     */
    implicit val decoder: Decoder[CompleteUploadRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CompleteUploadRequest] = deriveEncoder
}
