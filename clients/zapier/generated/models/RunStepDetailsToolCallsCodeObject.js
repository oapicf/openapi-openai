const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeObject_code_interpreter = require('../models/RunStepDetailsToolCallsCodeObject_code_interpreter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of tool call. This is always going to be `code_interpreter` for this type of tool call. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'code_interpreter',
                ],
            },
            ...RunStepDetailsToolCallsCodeObject_code_interpreter.fields(`${keyPrefix}code_interpreter`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'code_interpreter': utils.removeIfEmpty(RunStepDetailsToolCallsCodeObject_code_interpreter.mapping(bundle, `${keyPrefix}code_interpreter`)),
        }
    },
}
