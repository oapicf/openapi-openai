
package org.openapitools.client.model


case class StaticChunkingStrategyRequestParam (
    /* Always `static`. */
    _type: String,
    _static: StaticChunkingStrategy
)
object StaticChunkingStrategyRequestParam {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
