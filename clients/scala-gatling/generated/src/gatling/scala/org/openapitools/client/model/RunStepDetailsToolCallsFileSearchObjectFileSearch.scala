
package org.openapitools.client.model


case class RunStepDetailsToolCallsFileSearchObjectFileSearch (
    _rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
    /* The results of the file search. */
    _results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]]
)
object RunStepDetailsToolCallsFileSearchObjectFileSearch {
    def toStringBody(var_rankingOptions: Object, var_results: Object) =
        s"""
        | {
        | "rankingOptions":$var_rankingOptions,"results":$var_results
        | }
        """.stripMargin
}
