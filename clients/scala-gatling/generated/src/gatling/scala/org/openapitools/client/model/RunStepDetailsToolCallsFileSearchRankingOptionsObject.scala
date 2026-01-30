
package org.openapitools.client.model


case class RunStepDetailsToolCallsFileSearchRankingOptionsObject (
    /* The ranker used for the file search. */
    _ranker: String,
    /* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    _scoreThreshold: Number
)
object RunStepDetailsToolCallsFileSearchRankingOptionsObject {
    def toStringBody(var_ranker: Object, var_scoreThreshold: Object) =
        s"""
        | {
        | "ranker":$var_ranker,"scoreThreshold":$var_scoreThreshold
        | }
        """.stripMargin
}
