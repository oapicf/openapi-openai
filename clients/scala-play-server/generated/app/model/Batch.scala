package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Batch.
  * @param `object` The object type, which is always `batch`.
  * @param endpoint The OpenAI API endpoint used by the batch.
  * @param inputFileId The ID of the input file for the batch.
  * @param completionWindow The time frame within which the batch should be processed.
  * @param status The current status of the batch.
  * @param outputFileId The ID of the file containing the outputs of successfully executed requests.
  * @param errorFileId The ID of the file containing the outputs of requests with errors.
  * @param createdAt The Unix timestamp (in seconds) for when the batch was created.
  * @param inProgressAt The Unix timestamp (in seconds) for when the batch started processing.
  * @param expiresAt The Unix timestamp (in seconds) for when the batch will expire.
  * @param finalizingAt The Unix timestamp (in seconds) for when the batch started finalizing.
  * @param completedAt The Unix timestamp (in seconds) for when the batch was completed.
  * @param failedAt The Unix timestamp (in seconds) for when the batch failed.
  * @param expiredAt The Unix timestamp (in seconds) for when the batch expired.
  * @param cancellingAt The Unix timestamp (in seconds) for when the batch started cancelling.
  * @param cancelledAt The Unix timestamp (in seconds) for when the batch was cancelled.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Batch(
  id: String,
  `object`: Batch.Object.Value,
  endpoint: String,
  errors: Option[BatchErrors],
  inputFileId: String,
  completionWindow: String,
  status: Batch.Status.Value,
  outputFileId: Option[String],
  errorFileId: Option[String],
  createdAt: Int,
  inProgressAt: Option[Int],
  expiresAt: Option[Int],
  finalizingAt: Option[Int],
  completedAt: Option[Int],
  failedAt: Option[Int],
  expiredAt: Option[Int],
  cancellingAt: Option[Int],
  cancelledAt: Option[Int],
  requestCounts: Option[BatchRequestCounts],
  metadata: Option[JsObject]
)

object Batch {
  implicit lazy val batchJsonFormat: Format[Batch] = Json.format[Batch]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Batch = Value("batch")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Validating = Value("validating")
    val Failed = Value("failed")
    val InProgress = Value("in_progress")
    val Finalizing = Value("finalizing")
    val Completed = Value("completed")
    val Expired = Value("expired")
    val Cancelling = Value("cancelling")
    val Cancelled = Value("cancelled")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

