
package org.openapitools.client.model


case class AssistantsApiResponseFormat (
    /* Must be one of `text` or `json_object`. */
    _type: Option[String]
)
object AssistantsApiResponseFormat {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
