
package org.openapitools.client.model


case class MessageObjectIncompleteDetails (
    /* The reason the message is incomplete. */
    _reason: String
)
object MessageObjectIncompleteDetails {
    def toStringBody(var_reason: Object) =
        s"""
        | {
        | "reason":$var_reason
        | }
        """.stripMargin
}
