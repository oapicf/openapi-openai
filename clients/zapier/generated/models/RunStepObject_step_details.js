const utils = require('../utils/utils');
const RunStepDetailsMessageCreationObject = require('../models/RunStepDetailsMessageCreationObject');
const RunStepDetailsMessageCreationObject_message_creation = require('../models/RunStepDetailsMessageCreationObject_message_creation');
const RunStepDetailsToolCallsObject = require('../models/RunStepDetailsToolCallsObject');
const RunStepDetailsToolCallsObject_tool_calls_inner = require('../models/RunStepDetailsToolCallsObject_tool_calls_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `message_creation`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'message_creation',
                    'tool_calls',
                ],
            },
            ...RunStepDetailsMessageCreationObject_message_creation.fields(`${keyPrefix}message_creation`, isInput),
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: RunStepDetailsToolCallsObject_tool_calls_inner.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'message_creation': utils.removeIfEmpty(RunStepDetailsMessageCreationObject_message_creation.mapping(bundle, `${keyPrefix}message_creation`)),
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, RunStepDetailsToolCallsObject_tool_calls_inner),
        }
    },
}
