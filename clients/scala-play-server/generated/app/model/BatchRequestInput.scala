package model

import play.api.libs.json._

/**
  * The per-line object of the batch input file
  * @param customId A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
  * @param method The HTTP method to be used for the request. Currently only `POST` is supported.
  * @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchRequestInput(
  customId: Option[String],
  method: Option[BatchRequestInput.Method.Value],
  url: Option[String]
)

object BatchRequestInput {
  implicit lazy val batchRequestInputJsonFormat: Format[BatchRequestInput] = Json.format[BatchRequestInput]

  // noinspection TypeAnnotation
  object Method extends Enumeration {
    val POST = Value("POST")

    type Method = Value
    implicit lazy val MethodJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

