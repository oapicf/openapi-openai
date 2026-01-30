
package org.openapitools.client.model


case class MessageDeltaObjectDelta (
    /* The entity that produced the message. One of `user` or `assistant`. */
    _role: Option[String],
    /* The content of the message in array of text and/or images. */
    _content: Option[List[MessageDeltaObjectDeltaContentInner]]
)
object MessageDeltaObjectDelta {
    def toStringBody(var_role: Object, var_content: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content
        | }
        """.stripMargin
}
