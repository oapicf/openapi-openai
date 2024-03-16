
package org.openapitools.client.model


case class CreateTranscriptionResponse (
    _text: String
)
object CreateTranscriptionResponse {
    def toStringBody(var_text: Object) =
        s"""
        | {
        | "text":$var_text
        | }
        """.stripMargin
}
