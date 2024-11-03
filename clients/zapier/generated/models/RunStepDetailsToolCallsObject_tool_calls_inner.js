const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeObject = require('../models/RunStepDetailsToolCallsCodeObject');
const RunStepDetailsToolCallsCodeObject_code_interpreter = require('../models/RunStepDetailsToolCallsCodeObject_code_interpreter');
const RunStepDetailsToolCallsFunctionObject = require('../models/RunStepDetailsToolCallsFunctionObject');
const RunStepDetailsToolCallsFunctionObject_function = require('../models/RunStepDetailsToolCallsFunctionObject_function');
const RunStepDetailsToolCallsRetrievalObject = require('../models/RunStepDetailsToolCallsRetrievalObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call object. - [${labelPrefix}id]`,
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
                    'retrieval',
                    'function',
                ],
            },
            ...RunStepDetailsToolCallsCodeObject_code_interpreter.fields(`${keyPrefix}code_interpreter`, isInput),
            {
                key: `${keyPrefix}retrieval`,
                label: `For now, this is always going to be an empty object. - [${labelPrefix}retrieval]`,
                required: true,
                dict: true,
            },
            ...RunStepDetailsToolCallsFunctionObject_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'code_interpreter': utils.removeIfEmpty(RunStepDetailsToolCallsCodeObject_code_interpreter.mapping(bundle, `${keyPrefix}code_interpreter`)),
            'retrieval': bundle.inputData?.[`${keyPrefix}retrieval`],
            'function': utils.removeIfEmpty(RunStepDetailsToolCallsFunctionObject_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
