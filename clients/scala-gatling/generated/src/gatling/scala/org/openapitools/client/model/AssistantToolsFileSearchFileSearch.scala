
package org.openapitools.client.model


case class AssistantToolsFileSearchFileSearch (
    /* The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  */
    _maxNumResults: Option[Integer],
    _rankingOptions: Option[FileSearchRankingOptions]
)
object AssistantToolsFileSearchFileSearch {
    def toStringBody(var_maxNumResults: Object, var_rankingOptions: Object) =
        s"""
        | {
        | "maxNumResults":$var_maxNumResults,"rankingOptions":$var_rankingOptions
        | }
        """.stripMargin
}
