package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionResponse_choices_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionResponseChoicesInner(
  index: Option[Int],
  message: Option[ChatCompletionResponseMessage],
  finishReason: Option[CreateChatCompletionResponseChoicesInner.FinishReason.Value]
)

object CreateChatCompletionResponseChoicesInner {
  implicit lazy val createChatCompletionResponseChoicesInnerJsonFormat: Format[CreateChatCompletionResponseChoicesInner] = Json.format[CreateChatCompletionResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val FunctionCall = Value("function_call")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

