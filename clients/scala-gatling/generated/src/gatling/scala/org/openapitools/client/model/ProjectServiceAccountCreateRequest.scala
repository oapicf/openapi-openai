
package org.openapitools.client.model


case class ProjectServiceAccountCreateRequest (
    /* The name of the service account being created. */
    _name: String
)
object ProjectServiceAccountCreateRequest {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
