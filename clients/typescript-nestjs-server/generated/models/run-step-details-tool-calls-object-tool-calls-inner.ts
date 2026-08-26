import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './run-step-details-tool-calls-code-object-code-interpreter';
import { RunStepDetailsToolCallsFunctionObject } from './run-step-details-tool-calls-function-object';
import { RunStepDetailsToolCallsFileSearchObject } from './run-step-details-tool-calls-file-search-object';
import { RunStepDetailsToolCallsFunctionObjectFunction } from './run-step-details-tool-calls-function-object-function';
import { RunStepDetailsToolCallsCodeObject } from './run-step-details-tool-calls-code-object';
import { RunStepDetailsToolCallsFileSearchObjectFileSearch } from './run-step-details-tool-calls-file-search-object-file-search';


/**
 * @type RunStepDetailsToolCallsObjectToolCallsInner
 * @export
 */
export type RunStepDetailsToolCallsObjectToolCallsInner = RunStepDetailsToolCallsCodeObject | RunStepDetailsToolCallsFileSearchObject | RunStepDetailsToolCallsFunctionObject;

