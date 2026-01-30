
package org.openapitools.client.model


case class AdminApiKeysCreateRequest (
    _name: String
)
object AdminApiKeysCreateRequest {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
