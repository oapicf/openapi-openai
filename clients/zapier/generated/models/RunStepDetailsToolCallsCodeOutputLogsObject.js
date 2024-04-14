const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'logs': bundle.inputData?.[`${keyPrefix}logs`],
        }
    },
}
