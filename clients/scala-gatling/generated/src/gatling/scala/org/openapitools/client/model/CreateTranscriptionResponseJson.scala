
package org.openapitools.client.model


case class CreateTranscriptionResponseJson (
    /* The transcribed text. */
    _text: String
)
object CreateTranscriptionResponseJson {
    def toStringBody(var_text: Object) =
        s"""
        | {
        | "text":$var_text
        | }
        """.stripMargin
}
