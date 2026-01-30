
package org.openapitools.client.model


case class AdminApiKeyOwner (
    _type: Option[String],
    _id: Option[String],
    _name: Option[String],
    _createdAt: Option[Long],
    _role: Option[String]
)
object AdminApiKeyOwner {
    def toStringBody(var_type: Object, var_id: Object, var_name: Object, var_createdAt: Object, var_role: Object) =
        s"""
        | {
        | "type":$var_type,"id":$var_id,"name":$var_name,"createdAt":$var_createdAt,"role":$var_role
        | }
        """.stripMargin
}
