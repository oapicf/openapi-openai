
package org.openapitools.client.model


case class ModifyThreadRequest (
    _toolResources: Option[ModifyThreadRequestToolResources],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any]
)
object ModifyThreadRequest {
    def toStringBody(var_toolResources: Object, var_metadata: Object) =
        s"""
        | {
        | "toolResources":$var_toolResources,"metadata":$var_metadata
        | }
        """.stripMargin
}
