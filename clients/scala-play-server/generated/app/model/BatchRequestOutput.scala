package model

import play.api.libs.json._

/**
  * The per-line object of the batch output and error files
  * @param customId A developer-provided per-request id that will be used to match outputs to inputs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BatchRequestOutput(
  id: Option[String],
  customId: Option[String],
  response: Option[BatchRequestOutputResponse],
  error: Option[BatchRequestOutputError]
)

object BatchRequestOutput {
  implicit lazy val batchRequestOutputJsonFormat: Format[BatchRequestOutput] = Json.format[BatchRequestOutput]
}

