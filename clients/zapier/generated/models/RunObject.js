const utils = require('../utils/utils');
const AssistantObject_tools_inner = require('../models/AssistantObject_tools_inner');
const AssistantsApiResponseFormatOption = require('../models/AssistantsApiResponseFormatOption');
const AssistantsApiToolChoiceOption = require('../models/AssistantsApiToolChoiceOption');
const RunCompletionUsage = require('../models/RunCompletionUsage');
const RunObject_incomplete_details = require('../models/RunObject_incomplete_details');
const RunObject_last_error = require('../models/RunObject_last_error');
const RunObject_required_action = require('../models/RunObject_required_action');
const TruncationObject = require('../models/TruncationObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `thread.run`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.run',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the run was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}thread_id`,
                label: `The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. - [${labelPrefix}thread_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}assistant_id`,
                label: `The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. - [${labelPrefix}assistant_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'queued',
                    'in_progress',
                    'requires_action',
                    'cancelling',
                    'cancelled',
                    'failed',
                    'completed',
                    'incomplete',
                    'expired',
                ],
            },
            ...RunObject_required_action.fields(`${keyPrefix}required_action`, isInput),
            ...RunObject_last_error.fields(`${keyPrefix}last_error`, isInput),
            {
                key: `${keyPrefix}expires_at`,
                label: `The Unix timestamp (in seconds) for when the run will expire. - [${labelPrefix}expires_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}started_at`,
                label: `The Unix timestamp (in seconds) for when the run was started. - [${labelPrefix}started_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cancelled_at`,
                label: `The Unix timestamp (in seconds) for when the run was cancelled. - [${labelPrefix}cancelled_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}failed_at`,
                label: `The Unix timestamp (in seconds) for when the run failed. - [${labelPrefix}failed_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}completed_at`,
                label: `The Unix timestamp (in seconds) for when the run was completed. - [${labelPrefix}completed_at]`,
                required: true,
                type: 'integer',
            },
            ...RunObject_incomplete_details.fields(`${keyPrefix}incomplete_details`, isInput),
            {
                key: `${keyPrefix}model`,
                label: `The model that the [assistant](/docs/api-reference/assistants) used for this run. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}instructions`,
                label: `The instructions that the [assistant](/docs/api-reference/assistants) used for this run. - [${labelPrefix}instructions]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: AssistantObject_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                required: true,
                dict: true,
            },
            ...RunCompletionUsage.fields(`${keyPrefix}usage`, isInput),
            {
                key: `${keyPrefix}temperature`,
                label: `The sampling temperature used for this run. If not set, defaults to 1. - [${labelPrefix}temperature]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}top_p`,
                label: `The nucleus sampling value used for this run. If not set, defaults to 1. - [${labelPrefix}top_p]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}max_prompt_tokens`,
                label: `The maximum number of prompt tokens specified to have been used over the course of the run.  - [${labelPrefix}max_prompt_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_completion_tokens`,
                label: `The maximum number of completion tokens specified to have been used over the course of the run.  - [${labelPrefix}max_completion_tokens]`,
                required: true,
                type: 'integer',
            },
            ...TruncationObject.fields(`${keyPrefix}truncation_strategy`, isInput),
            ...AssistantsApiToolChoiceOption.fields(`${keyPrefix}tool_choice`, isInput),
            {
                key: `${keyPrefix}parallel_tool_calls`,
                label: `Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. - [${labelPrefix}parallel_tool_calls]`,
                required: true,
                type: 'boolean',
            },
            ...AssistantsApiResponseFormatOption.fields(`${keyPrefix}response_format`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'thread_id': bundle.inputData?.[`${keyPrefix}thread_id`],
            'assistant_id': bundle.inputData?.[`${keyPrefix}assistant_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'required_action': utils.removeIfEmpty(RunObject_required_action.mapping(bundle, `${keyPrefix}required_action`)),
            'last_error': utils.removeIfEmpty(RunObject_last_error.mapping(bundle, `${keyPrefix}last_error`)),
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'started_at': bundle.inputData?.[`${keyPrefix}started_at`],
            'cancelled_at': bundle.inputData?.[`${keyPrefix}cancelled_at`],
            'failed_at': bundle.inputData?.[`${keyPrefix}failed_at`],
            'completed_at': bundle.inputData?.[`${keyPrefix}completed_at`],
            'incomplete_details': utils.removeIfEmpty(RunObject_incomplete_details.mapping(bundle, `${keyPrefix}incomplete_details`)),
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'instructions': bundle.inputData?.[`${keyPrefix}instructions`],
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, AssistantObject_tools_inner),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
            'usage': utils.removeIfEmpty(RunCompletionUsage.mapping(bundle, `${keyPrefix}usage`)),
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'top_p': bundle.inputData?.[`${keyPrefix}top_p`],
            'max_prompt_tokens': bundle.inputData?.[`${keyPrefix}max_prompt_tokens`],
            'max_completion_tokens': bundle.inputData?.[`${keyPrefix}max_completion_tokens`],
            'truncation_strategy': utils.removeIfEmpty(TruncationObject.mapping(bundle, `${keyPrefix}truncation_strategy`)),
            'tool_choice': utils.removeIfEmpty(AssistantsApiToolChoiceOption.mapping(bundle, `${keyPrefix}tool_choice`)),
            'parallel_tool_calls': bundle.inputData?.[`${keyPrefix}parallel_tool_calls`],
            'response_format': utils.removeIfEmpty(AssistantsApiResponseFormatOption.mapping(bundle, `${keyPrefix}response_format`)),
        }
    },
}
