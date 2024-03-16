
package org.openapitools.client.model


case class CreateModerationResponse (
    _id: String,
    _model: String,
    _results: List[CreateModerationResponseResultsInner]
)
object CreateModerationResponse {
    def toStringBody(var_id: Object, var_model: Object, var_results: Object) =
        s"""
        | {
        | "id":$var_id,"model":$var_model,"results":$var_results
        | }
        """.stripMargin
}
