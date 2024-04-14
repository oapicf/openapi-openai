
package org.openapitools.client.model


case class AssistantsApiResponseFormatOption (
    /* Must be one of `text` or `json_object`. */
    _type: Option[String]
)
object AssistantsApiResponseFormatOption {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
