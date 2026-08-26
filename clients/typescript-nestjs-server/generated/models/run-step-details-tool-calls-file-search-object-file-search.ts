import { RunStepDetailsToolCallsFileSearchRankingOptionsObject } from './run-step-details-tool-calls-file-search-ranking-options-object';
import { RunStepDetailsToolCallsFileSearchResultObject } from './run-step-details-tool-calls-file-search-result-object';


/**
 * For now, this is always going to be an empty object.
 */
export interface RunStepDetailsToolCallsFileSearchObjectFileSearch { 
  ranking_options?: RunStepDetailsToolCallsFileSearchRankingOptionsObject;
  /**
   * The results of the file search.
   */
  results?: Array<RunStepDetailsToolCallsFileSearchResultObject>;
}

