
package org.openapitools.client.model


case class CostsResult (
    _object: String,
    _amount: Option[CostsResultAmount],
    /* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
    _lineItem: Option[String],
    /* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
    _projectId: Option[String]
)
object CostsResult {
    def toStringBody(var_object: Object, var_amount: Object, var_lineItem: Object, var_projectId: Object) =
        s"""
        | {
        | "object":$var_object,"amount":$var_amount,"lineItem":$var_lineItem,"projectId":$var_projectId
        | }
        """.stripMargin
}
