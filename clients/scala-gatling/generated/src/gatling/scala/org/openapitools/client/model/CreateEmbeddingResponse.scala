
package org.openapitools.client.model


case class CreateEmbeddingResponse (
    _object: String,
    _model: String,
    _data: List[CreateEmbeddingResponseDataInner],
    _usage: CreateEmbeddingResponseUsage
)
object CreateEmbeddingResponse {
    def toStringBody(var_object: Object, var_model: Object, var_data: Object, var_usage: Object) =
        s"""
        | {
        | "object":$var_object,"model":$var_model,"data":$var_data,"usage":$var_usage
        | }
        """.stripMargin
}
