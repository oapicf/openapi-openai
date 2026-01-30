
package org.openapitools.client.model


case class ProjectApiKey (
    /* The object type, which is always `organization.project.api_key` */
    _object: String,
    /* The redacted value of the API key */
    _redactedValue: String,
    /* The name of the API key */
    _name: String,
    /* The Unix timestamp (in seconds) of when the API key was created */
    _createdAt: Integer,
    /* The identifier, which can be referenced in API endpoints */
    _id: String,
    _owner: ProjectApiKeyOwner
)
object ProjectApiKey {
    def toStringBody(var_object: Object, var_redactedValue: Object, var_name: Object, var_createdAt: Object, var_id: Object, var_owner: Object) =
        s"""
        | {
        | "object":$var_object,"redactedValue":$var_redactedValue,"name":$var_name,"createdAt":$var_createdAt,"id":$var_id,"owner":$var_owner
        | }
        """.stripMargin
}
