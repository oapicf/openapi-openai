const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}tokens`,
                label: `[${labelPrefix}tokens]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}token_logprobs`,
                label: `[${labelPrefix}token_logprobs]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}top_logprobs`,
                label: `[${labelPrefix}top_logprobs]`,
                list: true,
                type: 'object',
            },
            {
                key: `${keyPrefix}text_offset`,
                label: `[${labelPrefix}text_offset]`,
                list: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tokens': bundle.inputData?.[`${keyPrefix}tokens`],
            'token_logprobs': bundle.inputData?.[`${keyPrefix}token_logprobs`],
            'top_logprobs': bundle.inputData?.[`${keyPrefix}top_logprobs`],
            'text_offset': bundle.inputData?.[`${keyPrefix}text_offset`],
        }
    },
}
