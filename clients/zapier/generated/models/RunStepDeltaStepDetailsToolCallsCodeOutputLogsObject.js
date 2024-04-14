const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the output in the outputs array. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always `logs`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'logs',
                ],
            },
            {
                key: `${keyPrefix}logs`,
                label: `The text output from the Code Interpreter tool call. - [${labelPrefix}logs]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'logs': bundle.inputData?.[`${keyPrefix}logs`],
        }
    },
}
