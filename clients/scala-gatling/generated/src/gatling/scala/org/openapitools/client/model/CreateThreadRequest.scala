
package org.openapitools.client.model


case class CreateThreadRequest (
    /* A list of [messages](/docs/api-reference/messages) to start the thread with. */
    _messages: Option[List[CreateMessageRequest]],
    _toolResources: Option[CreateThreadRequestToolResources],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any]
)
object CreateThreadRequest {
    def toStringBody(var_messages: Object, var_toolResources: Object, var_metadata: Object) =
        s"""
        | {
        | "messages":$var_messages,"toolResources":$var_toolResources,"metadata":$var_metadata
        | }
        """.stripMargin
}
