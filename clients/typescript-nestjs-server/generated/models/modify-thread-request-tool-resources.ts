import { ModifyThreadRequestToolResourcesFileSearch } from './modify-thread-request-tool-resources-file-search';
import { CreateAssistantRequestToolResourcesCodeInterpreter } from './create-assistant-request-tool-resources-code-interpreter';


/**
 * A set of resources that are made available to the assistant\'s tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
export interface ModifyThreadRequestToolResources { 
  code_interpreter?: CreateAssistantRequestToolResourcesCodeInterpreter;
  file_search?: ModifyThreadRequestToolResourcesFileSearch;
}

