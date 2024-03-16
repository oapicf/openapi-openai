
package org.openapitools.client.model


case class CreateChatCompletionResponse (
    _id: String,
    _object: String,
    _created: Integer,
    _model: String,
    _choices: List[CreateChatCompletionResponseChoicesInner],
    _usage: Option[CreateCompletionResponseUsage]
)
object CreateChatCompletionResponse {
    def toStringBody(var_id: Object, var_object: Object, var_created: Object, var_model: Object, var_choices: Object, var_usage: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"created":$var_created,"model":$var_model,"choices":$var_choices,"usage":$var_usage
        | }
        """.stripMargin
}
