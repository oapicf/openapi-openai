const utils = require('../utils/utils');
const RunStepDeltaStepDetailsToolCallsCodeObject = require('../models/RunStepDeltaStepDetailsToolCallsCodeObject');
const RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter = require('../models/RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter');
const RunStepDeltaStepDetailsToolCallsFunctionObject = require('../models/RunStepDeltaStepDetailsToolCallsFunctionObject');
const RunStepDeltaStepDetailsToolCallsFunctionObject_function = require('../models/RunStepDeltaStepDetailsToolCallsFunctionObject_function');
const RunStepDeltaStepDetailsToolCallsRetrievalObject = require('../models/RunStepDeltaStepDetailsToolCallsRetrievalObject');

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
                label: `The type of tool call. This is always going to be `code_interpreter` for this type of tool call. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'code_interpreter',
                    'retrieval',
                    'function',
                ],
            },
            ...RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.fields(`${keyPrefix}code_interpreter`, isInput),
            {
                key: `${keyPrefix}retrieval`,
                label: `For now, this is always going to be an empty object. - [${labelPrefix}retrieval]`,
                dict: true,
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
            'code_interpreter': utils.removeIfEmpty(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.mapping(bundle, `${keyPrefix}code_interpreter`)),
            'retrieval': bundle.inputData?.[`${keyPrefix}retrieval`],
            'function': utils.removeIfEmpty(RunStepDeltaStepDetailsToolCallsFunctionObject_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
