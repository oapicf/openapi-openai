const utils = require('../utils/utils');
const RunStepDetailsToolCallsObject_tool_calls_inner = require('../models/RunStepDetailsToolCallsObject_tool_calls_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `tool_calls`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'tool_calls',
                ],
            },
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
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, RunStepDetailsToolCallsObject_tool_calls_inner),
        }
    },
}
