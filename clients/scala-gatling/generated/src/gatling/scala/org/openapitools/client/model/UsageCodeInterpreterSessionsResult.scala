
package org.openapitools.client.model


case class UsageCodeInterpreterSessionsResult (
    _object: String,
    /* The number of code interpreter sessions. */
    _sessions: Integer,
    /* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
    _projectId: Option[String]
)
object UsageCodeInterpreterSessionsResult {
    def toStringBody(var_object: Object, var_sessions: Object, var_projectId: Object) =
        s"""
        | {
        | "object":$var_object,"sessions":$var_sessions,"projectId":$var_projectId
        | }
        """.stripMargin
}
