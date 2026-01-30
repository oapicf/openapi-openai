
package org.openapitools.client.model


case class Project (
    /* The identifier, which can be referenced in API endpoints */
    _id: String,
    /* The object type, which is always `organization.project` */
    _object: String,
    /* The name of the project. This appears in reporting. */
    _name: String,
    /* The Unix timestamp (in seconds) of when the project was created. */
    _createdAt: Integer,
    /* The Unix timestamp (in seconds) of when the project was archived or `null`. */
    _archivedAt: Option[Integer],
    /* `active` or `archived` */
    _status: String
)
object Project {
    def toStringBody(var_id: Object, var_object: Object, var_name: Object, var_createdAt: Object, var_archivedAt: Object, var_status: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"name":$var_name,"createdAt":$var_createdAt,"archivedAt":$var_archivedAt,"status":$var_status
        | }
        """.stripMargin
}
