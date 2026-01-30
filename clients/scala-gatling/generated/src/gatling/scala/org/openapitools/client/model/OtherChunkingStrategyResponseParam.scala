
package org.openapitools.client.model


case class OtherChunkingStrategyResponseParam (
    /* Always `other`. */
    _type: String
)
object OtherChunkingStrategyResponseParam {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
