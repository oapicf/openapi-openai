
package org.openapitools.client.model


case class StaticChunkingStrategy (
    /* Always `static`. */
    _type: String,
    _static: StaticChunkingStrategyStatic
)
object StaticChunkingStrategy {
    def toStringBody(var_type: Object, var_static: Object) =
        s"""
        | {
        | "type":$var_type,"static":$var_static
        | }
        """.stripMargin
}
