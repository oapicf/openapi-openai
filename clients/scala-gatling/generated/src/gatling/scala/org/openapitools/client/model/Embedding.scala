
package org.openapitools.client.model


case class Embedding (
    /* The index of the embedding in the list of embeddings. */
    _index: Integer,
    /* The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
    _embedding: List[Number],
    /* The object type, which is always \"embedding\". */
    _object: String
)
object Embedding {
    def toStringBody(var_index: Object, var_embedding: Object, var_object: Object) =
        s"""
        | {
        | "index":$var_index,"embedding":$var_embedding,"object":$var_object
        | }
        """.stripMargin
}
