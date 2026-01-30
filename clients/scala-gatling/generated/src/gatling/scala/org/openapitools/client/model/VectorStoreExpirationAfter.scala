
package org.openapitools.client.model


case class VectorStoreExpirationAfter (
    /* Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. */
    _anchor: String,
    /* The number of days after the anchor time that the vector store will expire. */
    _days: Integer
)
object VectorStoreExpirationAfter {
    def toStringBody(var_anchor: Object, var_days: Object) =
        s"""
        | {
        | "anchor":$var_anchor,"days":$var_days
        | }
        """.stripMargin
}
