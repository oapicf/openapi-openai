const utils = require('../utils/utils');
const RunStepDeltaStepDetailsMessageCreationObject = require('../models/RunStepDeltaStepDetailsMessageCreationObject');
const RunStepDeltaStepDetailsMessageCreationObject_message_creation = require('../models/RunStepDeltaStepDetailsMessageCreationObject_message_creation');
const RunStepDeltaStepDetailsToolCallsObject = require('../models/RunStepDeltaStepDetailsToolCallsObject');
const RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner = require('../models/RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner');

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
            ...RunStepDeltaStepDetailsMessageCreationObject_message_creation.fields(`${keyPrefix}message_creation`, isInput),
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'message_creation': utils.removeIfEmpty(RunStepDeltaStepDetailsMessageCreationObject_message_creation.mapping(bundle, `${keyPrefix}message_creation`)),
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner),
        }
    },
}
