import { AssistantToolsFileSearchFileSearch } from './assistant-tools-file-search-file-search';
import { AssistantToolsFileSearch } from './assistant-tools-file-search';
import { AssistantToolsFunction } from './assistant-tools-function';
import { FunctionObject } from './function-object';
import { AssistantToolsCode } from './assistant-tools-code';


/**
 * @type AssistantObjectToolsInner
 * @export
 */
export type AssistantObjectToolsInner = AssistantToolsCode | AssistantToolsFileSearch | AssistantToolsFunction;

