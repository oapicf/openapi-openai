package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The `File` object represents a document that has been uploaded to OpenAI.
 * @param id The file identifier, which can be referenced in the API endpoints.
 * @param bytes The size of the file, in bytes.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the file was created.
 * @param filename The name of the file.
 * @param _object The object type, which is always `file`.
 * @param purpose The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
 * @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @param statusUnderscoredetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
 */
case class OpenAIFile(id: String,
                bytes: Int,
                createdUnderscoreat: Int,
                filename: String,
                _object: String,
                purpose: String,
                status: String,
                statusUnderscoredetails: Option[String]
                )

object OpenAIFile {
    /**
     * Creates the codec for converting OpenAIFile from and to JSON.
     */
    implicit val decoder: Decoder[OpenAIFile] = deriveDecoder
    implicit val encoder: ObjectEncoder[OpenAIFile] = deriveEncoder
}
