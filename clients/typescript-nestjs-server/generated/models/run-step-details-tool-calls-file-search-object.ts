import { RunStepDetailsToolCallsFileSearchObjectFileSearch } from './run-step-details-tool-calls-file-search-object-file-search';


export interface RunStepDetailsToolCallsFileSearchObject { 
  /**
   * The ID of the tool call object.
   */
  id: string;
  /**
   * The type of tool call. This is always going to be `file_search` for this type of tool call.
   */
  type: RunStepDetailsToolCallsFileSearchObject.TypeEnum;
  file_search: RunStepDetailsToolCallsFileSearchObjectFileSearch;
}
export namespace RunStepDetailsToolCallsFileSearchObject {
  export const TypeEnum = {
    FileSearch: 'file_search'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


