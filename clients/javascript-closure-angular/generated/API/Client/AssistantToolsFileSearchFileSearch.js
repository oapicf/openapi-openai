goog.provide('API.Client.AssistantToolsFileSearch_file_search');

/**
 * Overrides for the file search tool.
 * @record
 */
API.Client.AssistantToolsFileSearchFileSearch = function() {}

/**
 * The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * @type {!number}
 * @export
 */
API.Client.AssistantToolsFileSearchFileSearch.prototype.maxNumResults;

/**
 * @type {!API.Client.FileSearchRankingOptions}
 * @export
 */
API.Client.AssistantToolsFileSearchFileSearch.prototype.rankingOptions;

