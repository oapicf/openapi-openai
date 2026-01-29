
package org.openapitools.client.model


case class ChatCompletionMessageToolCallChunk (
    _index: Integer,
    /* The ID of the tool call. */
    _id: Option[String],
    /* The type of the tool. Currently, only `function` is supported. */
    _type: Option[String],
    _function: Option[ChatCompletionMessageToolCallChunkFunction]
)
object ChatCompletionMessageToolCallChunk {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_function: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
