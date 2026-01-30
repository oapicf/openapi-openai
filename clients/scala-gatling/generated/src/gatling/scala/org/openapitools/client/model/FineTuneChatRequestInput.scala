
package org.openapitools.client.model


case class FineTuneChatRequestInput (
    _messages: Option[List[FineTuneChatRequestInputMessagesInner]],
    /* A list of tools the model may generate JSON inputs for. */
    _tools: Option[List[ChatCompletionTool]],
    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    _parallelToolCalls: Option[Boolean],
    /* A list of functions the model may generate JSON inputs for. */
    _functions: Option[List[ChatCompletionFunctions]]
)
object FineTuneChatRequestInput {
    def toStringBody(var_messages: Object, var_tools: Object, var_parallelToolCalls: Object, var_functions: Object) =
        s"""
        | {
        | "messages":$var_messages,"tools":$var_tools,"parallelToolCalls":$var_parallelToolCalls,"functions":$var_functions
        | }
        """.stripMargin
}
