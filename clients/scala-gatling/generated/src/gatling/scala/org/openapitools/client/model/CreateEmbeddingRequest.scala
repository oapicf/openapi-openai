
package org.openapitools.client.model


case class CreateEmbeddingRequest (
    _model: CreateEmbeddingRequestModel,
    _input: CreateEmbeddingRequestInput,
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    _user: Option[String]
)
object CreateEmbeddingRequest {
    def toStringBody(var_model: Object, var_input: Object, var_user: Object) =
        s"""
        | {
        | "model":$var_model,"input":$var_input,"user":$var_user
        | }
        """.stripMargin
}
