
package org.openapitools.client.model


case class TruncationObject (
    /* The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`. */
    _type: Option[String],
    /* The number of most recent messages from the thread when constructing the context for the run. */
    _lastMessages: Option[Integer]
)
object TruncationObject {
    def toStringBody(var_type: Object, var_lastMessages: Object) =
        s"""
        | {
        | "type":$var_type,"lastMessages":$var_lastMessages
        | }
        """.stripMargin
}
