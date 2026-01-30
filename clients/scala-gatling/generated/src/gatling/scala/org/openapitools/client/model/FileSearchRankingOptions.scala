
package org.openapitools.client.model


case class FileSearchRankingOptions (
    /* The ranker to use for the file search. If not specified will use the `auto` ranker. */
    _ranker: Option[String],
    /* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    _scoreThreshold: Number
)
object FileSearchRankingOptions {
    def toStringBody(var_ranker: Object, var_scoreThreshold: Object) =
        s"""
        | {
        | "ranker":$var_ranker,"scoreThreshold":$var_scoreThreshold
        | }
        """.stripMargin
}
