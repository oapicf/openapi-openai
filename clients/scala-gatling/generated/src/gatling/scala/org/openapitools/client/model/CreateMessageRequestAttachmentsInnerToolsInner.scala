
package org.openapitools.client.model


case class CreateMessageRequestAttachmentsInnerToolsInner (
    /* The type of tool being defined: `code_interpreter` */
    _type: String
)
object CreateMessageRequestAttachmentsInnerToolsInner {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
