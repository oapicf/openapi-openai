
package org.openapitools.client.model


case class CreateEmbeddingResponseDataInner (
    _index: Integer,
    _object: String,
    _embedding: List[Number]
)
object CreateEmbeddingResponseDataInner {
    def toStringBody(var_index: Object, var_object: Object, var_embedding: Object) =
        s"""
        | {
        | "index":$var_index,"object":$var_object,"embedding":$var_embedding
        | }
        """.stripMargin
}
