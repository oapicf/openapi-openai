import { RunStepDetailsToolCallsFileSearchResultObjectContentInner } from './run-step-details-tool-calls-file-search-result-object-content-inner';


/**
 * A result instance of the file search.
 */
export interface RunStepDetailsToolCallsFileSearchResultObject { 
  /**
   * The ID of the file that result was found in.
   */
  file_id: string;
  /**
   * The name of the file that result was found in.
   */
  file_name: string;
  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   */
  score: number;
  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   */
  content?: Array<RunStepDetailsToolCallsFileSearchResultObjectContentInner>;
}

