
package org.openapitools.client.model


case class RunStepDetailsToolCallsRetrievalObject (
    /* The ID of the tool call object. */
    _id: String,
    /* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
    _type: String,
    /* For now, this is always going to be an empty object. */
    _retrieval: Any
)
object RunStepDetailsToolCallsRetrievalObject {
    def toStringBody(var_id: Object, var_type: Object, var_retrieval: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"retrieval":$var_retrieval
        | }
        """.stripMargin
}
