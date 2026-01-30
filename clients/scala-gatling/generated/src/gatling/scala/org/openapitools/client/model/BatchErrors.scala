
package org.openapitools.client.model


case class BatchErrors (
    /* The object type, which is always `list`. */
    _object: Option[String],
    _data: Option[List[BatchErrorsDataInner]]
)
object BatchErrors {
    def toStringBody(var_object: Object, var_data: Object) =
        s"""
        | {
        | "object":$var_object,"data":$var_data
        | }
        """.stripMargin
}
