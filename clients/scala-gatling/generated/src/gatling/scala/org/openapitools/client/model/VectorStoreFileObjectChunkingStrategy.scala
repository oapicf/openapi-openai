
package org.openapitools.client.model


case class VectorStoreFileObjectChunkingStrategy (
    /* Always `static`. */
    _type: String,
    _static: StaticChunkingStrategy
)
object VectorStoreFileObjectChunkingStrategy {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
