goog.provide('API.Client.RunStepDetailsToolCallsFileSearchRankingOptionsObject');

/**
 * The ranking options for the file search.
 * @record
 */
API.Client.RunStepDetailsToolCallsFileSearchRankingOptionsObject = function() {}

/**
 * The ranker used for the file search.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchRankingOptionsObject.prototype.ranker;

/**
 * The score threshold for the file search. All values must be a floating point number between 0 and 1.
 * @type {!number}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchRankingOptionsObject.prototype.scoreThreshold;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsFileSearchRankingOptionsObject.RankerEnum = { 
  default_2024_08_21: 'default_2024_08_21',
}
