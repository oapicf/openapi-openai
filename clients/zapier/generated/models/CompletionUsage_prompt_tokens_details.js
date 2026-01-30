const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audio_tokens`,
                label: `Audio input tokens present in the prompt. - [${labelPrefix}audio_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cached_tokens`,
                label: `Cached tokens present in the prompt. - [${labelPrefix}cached_tokens]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audio_tokens': bundle.inputData?.[`${keyPrefix}audio_tokens`],
            'cached_tokens': bundle.inputData?.[`${keyPrefix}cached_tokens`],
        }
    },
}
