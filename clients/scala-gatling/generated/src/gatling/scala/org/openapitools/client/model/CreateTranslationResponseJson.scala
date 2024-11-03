
package org.openapitools.client.model


case class CreateTranslationResponseJson (
    _text: String
)
object CreateTranslationResponseJson {
    def toStringBody(var_text: Object) =
        s"""
        | {
        | "text":$var_text
        | }
        """.stripMargin
}
