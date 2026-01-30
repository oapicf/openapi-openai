
package org.openapitools.client.model


case class StaticChunkingStrategyResponseParam (
    /* Always `static`. */
    _type: String,
    _static: StaticChunkingStrategy
)
object StaticChunkingStrategyResponseParam {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
