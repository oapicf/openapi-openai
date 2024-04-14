const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}prompt_tokens`,
                label: `The number of tokens used by the prompt. - [${labelPrefix}prompt_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_tokens`,
                label: `The total number of tokens used by the request. - [${labelPrefix}total_tokens]`,
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
