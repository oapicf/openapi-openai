package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner.
  * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateCompletionResponseChoicesInner(
  finishReason: CreateCompletionResponseChoicesInner.FinishReason.Value,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  text: String
)

object CreateCompletionResponseChoicesInner {
  implicit lazy val createCompletionResponseChoicesInnerJsonFormat: Format[CreateCompletionResponseChoicesInner] = Json.format[CreateCompletionResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val ContentFilter = Value("content_filter")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

