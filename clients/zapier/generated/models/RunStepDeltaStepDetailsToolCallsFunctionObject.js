const utils = require('../utils/utils');
const RunStepDeltaStepDetailsToolCallsFunctionObject_function = require('../models/RunStepDeltaStepDetailsToolCallsFunctionObject_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the tool call in the tool calls array. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call object. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of tool call. This is always going to be `function` for this type of tool call. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            ...RunStepDeltaStepDetailsToolCallsFunctionObject_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(RunStepDeltaStepDetailsToolCallsFunctionObject_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
