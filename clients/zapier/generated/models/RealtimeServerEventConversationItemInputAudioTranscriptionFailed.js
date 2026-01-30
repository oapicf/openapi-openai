const utils = require('../utils/utils');
const RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error = require('../models/RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error');

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
                label: `The event type, must be `conversation.item.input_audio_transcription.failed`.  - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.input_audio_transcription.failed',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the user message item. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_index`,
                label: `The index of the content part containing the audio. - [${labelPrefix}content_index]`,
                required: true,
                type: 'integer',
            },
            ...RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'content_index': bundle.inputData?.[`${keyPrefix}content_index`],
            'error': utils.removeIfEmpty(RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
