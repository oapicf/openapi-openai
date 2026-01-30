
package org.openapitools.client.model


case class AutoChunkingStrategy (
    /* Always `auto`. */
    _type: String
)
object AutoChunkingStrategy {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
