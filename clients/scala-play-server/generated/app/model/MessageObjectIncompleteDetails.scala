package model

import play.api.libs.json._

/**
  * On an incomplete message, details about why the message is incomplete.
  * @param reason The reason the message is incomplete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageObjectIncompleteDetails(
  reason: MessageObjectIncompleteDetails.Reason.Value
)

object MessageObjectIncompleteDetails {
  implicit lazy val messageObjectIncompleteDetailsJsonFormat: Format[MessageObjectIncompleteDetails] = Json.format[MessageObjectIncompleteDetails]

  // noinspection TypeAnnotation
  object Reason extends Enumeration {
    val ContentFilter = Value("content_filter")
    val MaxTokens = Value("max_tokens")
    val RunCancelled = Value("run_cancelled")
    val RunExpired = Value("run_expired")
    val RunFailed = Value("run_failed")

    type Reason = Value
    implicit lazy val ReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

