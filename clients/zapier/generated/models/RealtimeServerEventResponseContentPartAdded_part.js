const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The content type (\"text\", \"audio\"). - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'audio',
                    'text',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text content (if type is \"text\"). - [${labelPrefix}text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}audio`,
                label: `Base64-encoded audio data (if type is \"audio\"). - [${labelPrefix}audio]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}transcript`,
                label: `The transcript of the audio (if type is \"audio\"). - [${labelPrefix}transcript]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'audio': bundle.inputData?.[`${keyPrefix}audio`],
            'transcript': bundle.inputData?.[`${keyPrefix}transcript`],
        }
    },
}
