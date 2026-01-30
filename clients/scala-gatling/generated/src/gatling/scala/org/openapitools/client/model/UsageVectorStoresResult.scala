
package org.openapitools.client.model


case class UsageVectorStoresResult (
    _object: String,
    /* The vector stores usage in bytes. */
    _usageBytes: Integer,
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    _projectId: Option[String]
)
object UsageVectorStoresResult {
    def toStringBody(var_object: Object, var_usageBytes: Object, var_projectId: Object) =
        s"""
        | {
        | "object":$var_object,"usageBytes":$var_usageBytes,"projectId":$var_projectId
        | }
        """.stripMargin
}
