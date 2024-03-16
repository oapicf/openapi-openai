package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionStreamResponse_choices_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionStreamResponseChoicesInner(
  index: Option[Int],
  delta: Option[ChatCompletionStreamResponseDelta],
  finishReason: Option[CreateChatCompletionStreamResponseChoicesInner.FinishReason.Value]
)

object CreateChatCompletionStreamResponseChoicesInner {
  implicit lazy val createChatCompletionStreamResponseChoicesInnerJsonFormat: Format[CreateChatCompletionStreamResponseChoicesInner] = Json.format[CreateChatCompletionStreamResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val FunctionCall = Value("function_call")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

