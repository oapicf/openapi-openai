const utils = require('../utils/utils');
const RunStepDetailsToolCallsCodeObject = require('../models/RunStepDetailsToolCallsCodeObject');
const RunStepDetailsToolCallsCodeObject_code_interpreter = require('../models/RunStepDetailsToolCallsCodeObject_code_interpreter');
const RunStepDetailsToolCallsFileSearchObject = require('../models/RunStepDetailsToolCallsFileSearchObject');
const RunStepDetailsToolCallsFileSearchObject_file_search = require('../models/RunStepDetailsToolCallsFileSearchObject_file_search');
const RunStepDetailsToolCallsFunctionObject = require('../models/RunStepDetailsToolCallsFunctionObject');
const RunStepDetailsToolCallsFunctionObject_function = require('../models/RunStepDetailsToolCallsFunctionObject_function');

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
                    'file_search',
                    'function',
                ],
            },
            ...RunStepDetailsToolCallsCodeObject_code_interpreter.fields(`${keyPrefix}code_interpreter`, isInput),
            ...RunStepDetailsToolCallsFileSearchObject_file_search.fields(`${keyPrefix}file_search`, isInput),
            ...RunStepDetailsToolCallsFunctionObject_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'code_interpreter': utils.removeIfEmpty(RunStepDetailsToolCallsCodeObject_code_interpreter.mapping(bundle, `${keyPrefix}code_interpreter`)),
            'file_search': utils.removeIfEmpty(RunStepDetailsToolCallsFileSearchObject_file_search.mapping(bundle, `${keyPrefix}file_search`)),
            'function': utils.removeIfEmpty(RunStepDetailsToolCallsFunctionObject_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
