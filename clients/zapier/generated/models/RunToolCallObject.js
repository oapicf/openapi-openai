const utils = require('../utils/utils');
const RunToolCallObject_function = require('../models/RunToolCallObject_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of tool call the output is required for. For now, this is always `function`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            ...RunToolCallObject_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(RunToolCallObject_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
