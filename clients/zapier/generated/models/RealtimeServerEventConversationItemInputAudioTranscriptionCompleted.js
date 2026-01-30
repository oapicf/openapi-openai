const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event_id`,
                label: `The unique ID of the server event. - [${labelPrefix}event_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The event type, must be `conversation.item.input_audio_transcription.completed`.  - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.input_audio_transcription.completed',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the user message item containing the audio. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_index`,
                label: `The index of the content part containing the audio. - [${labelPrefix}content_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}transcript`,
                label: `The transcribed text. - [${labelPrefix}transcript]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'content_index': bundle.inputData?.[`${keyPrefix}content_index`],
            'transcript': bundle.inputData?.[`${keyPrefix}transcript`],
        }
    },
}
