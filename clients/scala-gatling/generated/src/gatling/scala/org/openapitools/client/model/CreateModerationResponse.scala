
package org.openapitools.client.model


case class CreateModerationResponse (
    /* The unique identifier for the moderation request. */
    _id: String,
    /* The model used to generate the moderation results. */
    _model: String,
    /* A list of moderation objects. */
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
