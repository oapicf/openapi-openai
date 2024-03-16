
package org.openapitools.client.model


case class CreateModerationRequest (
    _input: CreateModerationRequestInput,
    _model: Option[CreateModerationRequestModel]
)
object CreateModerationRequest {
    def toStringBody(var_input: Object, var_model: Object) =
        s"""
        | {
        | "input":$var_input,"model":$var_model
        | }
        """.stripMargin
}
