const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner = require('../models/RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}input`,
                label: `The input to the Code Interpreter tool call. - [${labelPrefix}input]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}outputs`,
                label: `[${labelPrefix}outputs]`,
                children: RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.fields(`${keyPrefix}outputs${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input': bundle.inputData?.[`${keyPrefix}input`],
            'outputs': utils.childMapping(bundle.inputData?.[`${keyPrefix}outputs`], `${keyPrefix}outputs`, RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner),
        }
    },
}
