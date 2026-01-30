const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the refusal part in the message. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
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
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'refusal': bundle.inputData?.[`${keyPrefix}refusal`],
        }
    },
}
