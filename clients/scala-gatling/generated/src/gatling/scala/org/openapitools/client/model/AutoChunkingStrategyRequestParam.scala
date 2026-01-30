
package org.openapitools.client.model


case class AutoChunkingStrategyRequestParam (
    /* Always `auto`. */
    _type: String
)
object AutoChunkingStrategyRequestParam {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
