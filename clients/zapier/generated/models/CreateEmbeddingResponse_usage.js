const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}prompt_tokens`,
                label: `[${labelPrefix}prompt_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_tokens`,
                label: `[${labelPrefix}total_tokens]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'prompt_tokens': bundle.inputData?.[`${keyPrefix}prompt_tokens`],
            'total_tokens': bundle.inputData?.[`${keyPrefix}total_tokens`],
        }
    },
}
