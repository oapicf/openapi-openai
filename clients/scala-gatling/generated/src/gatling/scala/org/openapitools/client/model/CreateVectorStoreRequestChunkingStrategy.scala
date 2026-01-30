
package org.openapitools.client.model


case class CreateVectorStoreRequestChunkingStrategy (
    /* Always `auto`. */
    _type: String,
    _static: StaticChunkingStrategy
)
object CreateVectorStoreRequestChunkingStrategy {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
