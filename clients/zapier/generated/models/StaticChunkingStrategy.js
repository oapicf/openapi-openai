const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_chunk_size_tokens`,
                label: `The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. - [${labelPrefix}max_chunk_size_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}chunk_overlap_tokens`,
                label: `The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  - [${labelPrefix}chunk_overlap_tokens]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_chunk_size_tokens': bundle.inputData?.[`${keyPrefix}max_chunk_size_tokens`],
            'chunk_overlap_tokens': bundle.inputData?.[`${keyPrefix}chunk_overlap_tokens`],
        }
    },
}
