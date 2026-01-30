
package org.openapitools.client.model


case class AdminApiKey (
    _object: Option[String],
    _id: Option[String],
    _name: Option[String],
    _redactedValue: Option[String],
    _value: Option[String],
    _createdAt: Option[Long],
    _owner: Option[AdminApiKeyOwner]
)
object AdminApiKey {
    def toStringBody(var_object: Object, var_id: Object, var_name: Object, var_redactedValue: Object, var_value: Object, var_createdAt: Object, var_owner: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"name":$var_name,"redactedValue":$var_redactedValue,"value":$var_value,"createdAt":$var_createdAt,"owner":$var_owner
        | }
        """.stripMargin
}
