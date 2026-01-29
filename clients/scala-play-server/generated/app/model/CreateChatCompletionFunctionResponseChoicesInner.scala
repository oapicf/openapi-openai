package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionFunctionResponse_choices_inner.
  * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  * @param index The index of the choice in the list of choices.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionFunctionResponseChoicesInner(
  finishReason: CreateChatCompletionFunctionResponseChoicesInner.FinishReason.Value,
  index: Int,
  message: ChatCompletionResponseMessage
)

object CreateChatCompletionFunctionResponseChoicesInner {
  implicit lazy val createChatCompletionFunctionResponseChoicesInnerJsonFormat: Format[CreateChatCompletionFunctionResponseChoicesInner] = Json.format[CreateChatCompletionFunctionResponseChoicesInner]

  // noinspection TypeAnnotation
  object FinishReason extends Enumeration {
    val Stop = Value("stop")
    val Length = Value("length")
    val FunctionCall = Value("function_call")
    val ContentFilter = Value("content_filter")

    type FinishReason = Value
    implicit lazy val FinishReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

