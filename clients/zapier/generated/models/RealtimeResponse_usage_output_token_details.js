const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}text_tokens`,
                label: `The number of text tokens used in the Response. - [${labelPrefix}text_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}audio_tokens`,
                label: `The number of audio tokens used in the Response. - [${labelPrefix}audio_tokens]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'text_tokens': bundle.inputData?.[`${keyPrefix}text_tokens`],
            'audio_tokens': bundle.inputData?.[`${keyPrefix}audio_tokens`],
        }
    },
}
