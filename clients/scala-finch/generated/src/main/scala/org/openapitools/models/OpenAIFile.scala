package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param _object 
 * @param bytes 
 * @param createdUnderscoreat 
 * @param filename 
 * @param purpose 
 * @param status 
 * @param statusUnderscoredetails 
 */
case class OpenAIFile(id: String,
                _object: String,
                bytes: Int,
                createdUnderscoreat: Int,
                filename: String,
                purpose: String,
                status: Option[String],
                statusUnderscoredetails: Option[Object]
                )

object OpenAIFile {
    /**
     * Creates the codec for converting OpenAIFile from and to JSON.
     */
    implicit val decoder: Decoder[OpenAIFile] = deriveDecoder
    implicit val encoder: ObjectEncoder[OpenAIFile] = deriveEncoder
}
