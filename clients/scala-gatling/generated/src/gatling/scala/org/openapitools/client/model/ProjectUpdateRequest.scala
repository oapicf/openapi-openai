
package org.openapitools.client.model


case class ProjectUpdateRequest (
    /* The updated name of the project, this name appears in reports. */
    _name: String
)
object ProjectUpdateRequest {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
