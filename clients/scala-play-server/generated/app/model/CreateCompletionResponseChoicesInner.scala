package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_choices_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionResponseChoicesInner(
  text: String,
  index: Int,
  logprobs: CreateCompletionResponseChoicesInnerLogprobs,
  finishReason: CreateCompletionResponseChoicesInner.FinishReason.Value
)

object CreateCompletionResponseChoicesInner {
  implicit lazy val createCompletionResponseChoicesInnerJsonFormat: Format[CreateCompletionResponseChoicesInner] = Json.format[CreateCompletionResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

