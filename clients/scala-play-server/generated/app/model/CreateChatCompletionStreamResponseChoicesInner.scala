package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionStreamResponse_choices_inner.
  * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  * @param index The index of the choice in the list of choices.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionStreamResponseChoicesInner(
  delta: ChatCompletionStreamResponseDelta,
  logprobs: Option[CreateChatCompletionResponseChoicesInnerLogprobs],
  finishReason: CreateChatCompletionStreamResponseChoicesInner.FinishReason.Value,
  index: Int
)

object CreateChatCompletionStreamResponseChoicesInner {
  implicit lazy val createChatCompletionStreamResponseChoicesInnerJsonFormat: Format[CreateChatCompletionStreamResponseChoicesInner] = Json.format[CreateChatCompletionStreamResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val ToolCalls = Value("tool_calls")
    val ContentFilter = Value("content_filter")
    val FunctionCall = Value("function_call")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

