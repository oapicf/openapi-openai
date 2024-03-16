
package org.openapitools.client.model


case class CreateTranslationResponse (
    _text: String
)
object CreateTranslationResponse {
    def toStringBody(var_text: Object) =
        s"""
        | {
        | "text":$var_text
        | }
        """.stripMargin
}
