
package org.openapitools.client.model


case class ProjectCreateRequest (
    /* The friendly name of the project, this name appears in reports. */
    _name: String
)
object ProjectCreateRequest {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
