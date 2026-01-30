const utils = require('../utils/utils');
const RunStepCompletionUsage = require('../models/RunStepCompletionUsage');
const RunStepObject_last_error = require('../models/RunStepObject_last_error');
const RunStepObject_step_details = require('../models/RunStepObject_step_details');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier of the run step, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `thread.run.step`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.run.step',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the run step was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}assistant_id`,
                label: `The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. - [${labelPrefix}assistant_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}thread_id`,
                label: `The ID of the [thread](/docs/api-reference/threads) that was run. - [${labelPrefix}thread_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}run_id`,
                label: `The ID of the [run](/docs/api-reference/runs) that this run step is a part of. - [${labelPrefix}run_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of run step, which can be either `message_creation` or `tool_calls`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'message_creation',
                    'tool_calls',
                ],
            },
            {
                key: `${keyPrefix}status`,
                label: `The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'in_progress',
                    'cancelled',
                    'failed',
                    'completed',
                    'expired',
                ],
            },
            ...RunStepObject_step_details.fields(`${keyPrefix}step_details`, isInput),
            ...RunStepObject_last_error.fields(`${keyPrefix}last_error`, isInput),
            {
                key: `${keyPrefix}expired_at`,
                label: `The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. - [${labelPrefix}expired_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cancelled_at`,
                label: `The Unix timestamp (in seconds) for when the run step was cancelled. - [${labelPrefix}cancelled_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}failed_at`,
                label: `The Unix timestamp (in seconds) for when the run step failed. - [${labelPrefix}failed_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}completed_at`,
                label: `The Unix timestamp (in seconds) for when the run step completed. - [${labelPrefix}completed_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                required: true,
                dict: true,
            },
            ...RunStepCompletionUsage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'assistant_id': bundle.inputData?.[`${keyPrefix}assistant_id`],
            'thread_id': bundle.inputData?.[`${keyPrefix}thread_id`],
            'run_id': bundle.inputData?.[`${keyPrefix}run_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'step_details': utils.removeIfEmpty(RunStepObject_step_details.mapping(bundle, `${keyPrefix}step_details`)),
            'last_error': utils.removeIfEmpty(RunStepObject_last_error.mapping(bundle, `${keyPrefix}last_error`)),
            'expired_at': bundle.inputData?.[`${keyPrefix}expired_at`],
            'cancelled_at': bundle.inputData?.[`${keyPrefix}cancelled_at`],
            'failed_at': bundle.inputData?.[`${keyPrefix}failed_at`],
            'completed_at': bundle.inputData?.[`${keyPrefix}completed_at`],
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
            'usage': utils.removeIfEmpty(RunStepCompletionUsage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
