const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The content type (`input_text`, `input_audio`, `item_reference`, `text`).  - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'input_audio',
                    'input_text',
                    'item_reference',
                    'text',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text content, used for `input_text` and `text` content types.  - [${labelPrefix}text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items.  - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}audio`,
                label: `Base64-encoded audio bytes, used for `input_audio` content type.  - [${labelPrefix}audio]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}transcript`,
                label: `The transcript of the audio, used for `input_audio` content type.  - [${labelPrefix}transcript]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'audio': bundle.inputData?.[`${keyPrefix}audio`],
            'transcript': bundle.inputData?.[`${keyPrefix}transcript`],
        }
    },
}
