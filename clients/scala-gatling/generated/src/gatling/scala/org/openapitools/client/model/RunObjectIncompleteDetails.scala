
package org.openapitools.client.model


case class RunObjectIncompleteDetails (
    /* The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. */
    _reason: Option[String]
)
object RunObjectIncompleteDetails {
    def toStringBody(var_reason: Object) =
        s"""
        | {
        | "reason":$var_reason
        | }
        """.stripMargin
}
