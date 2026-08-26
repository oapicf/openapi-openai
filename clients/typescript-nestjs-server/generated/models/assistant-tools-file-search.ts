import { AssistantToolsFileSearchFileSearch } from './assistant-tools-file-search-file-search';


export interface AssistantToolsFileSearch { 
  /**
   * The type of tool being defined: `file_search`
   */
  type: AssistantToolsFileSearch.TypeEnum;
  file_search?: AssistantToolsFileSearchFileSearch;
}
export namespace AssistantToolsFileSearch {
  export const TypeEnum = {
    FileSearch: 'file_search'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


