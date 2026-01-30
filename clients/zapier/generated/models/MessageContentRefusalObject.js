const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `refusal`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'refusal',
                ],
            },
            {
                key: `${keyPrefix}refusal`,
                label: `[${labelPrefix}refusal]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'refusal': bundle.inputData?.[`${keyPrefix}refusal`],
        }
    },
}
