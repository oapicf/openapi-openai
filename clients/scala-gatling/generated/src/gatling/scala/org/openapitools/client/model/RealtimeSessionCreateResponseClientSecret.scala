
package org.openapitools.client.model


case class RealtimeSessionCreateResponseClientSecret (
    /* Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  */
    _value: Option[String],
    /* Timestamp for when the token expires. Currently, all tokens expire after one minute.  */
    _expiresAt: Option[Integer]
)
object RealtimeSessionCreateResponseClientSecret {
    def toStringBody(var_value: Object, var_expiresAt: Object) =
        s"""
        | {
        | "value":$var_value,"expiresAt":$var_expiresAt
        | }
        """.stripMargin
}
