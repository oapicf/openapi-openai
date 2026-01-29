
package org.openapitools.client.model


case class MessageDeltaObject (
    /* The identifier of the message, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.message.delta`. */
    _object: String,
    _delta: MessageDeltaObjectDelta
)
object MessageDeltaObject {
    def toStringBody(var_id: Object, var_object: Object, var_delta: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"delta":$var_delta
        | }
        """.stripMargin
}
