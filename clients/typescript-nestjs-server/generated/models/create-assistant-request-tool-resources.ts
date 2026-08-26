import { CreateAssistantRequestToolResourcesFileSearch } from './create-assistant-request-tool-resources-file-search';
import { CreateAssistantRequestToolResourcesCodeInterpreter } from './create-assistant-request-tool-resources-code-interpreter';


/**
 * A set of resources that are used by the assistant\'s tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
export interface CreateAssistantRequestToolResources { 
  code_interpreter?: CreateAssistantRequestToolResourcesCodeInterpreter;
  file_search?: CreateAssistantRequestToolResourcesFileSearch | null;
}

