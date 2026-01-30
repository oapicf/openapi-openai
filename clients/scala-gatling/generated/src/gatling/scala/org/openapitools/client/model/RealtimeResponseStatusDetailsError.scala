
package org.openapitools.client.model


case class RealtimeResponseStatusDetailsError (
    /* The type of error. */
    _type: Option[String],
    /* Error code, if any. */
    _code: Option[String]
)
object RealtimeResponseStatusDetailsError {
    def toStringBody(var_type: Object, var_code: Object) =
        s"""
        | {
        | "type":$var_type,"code":$var_code
        | }
        """.stripMargin
}
