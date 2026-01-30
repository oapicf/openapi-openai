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
                label: `The event type, must be `conversation.item.truncated`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.truncated',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the assistant message item that was truncated. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_index`,
                label: `The index of the content part that was truncated. - [${labelPrefix}content_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}audio_end_ms`,
                label: `The duration up to which the audio was truncated, in milliseconds.  - [${labelPrefix}audio_end_ms]`,
                required: true,
                type: 'integer',
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
            'audio_end_ms': bundle.inputData?.[`${keyPrefix}audio_end_ms`],
        }
    },
}
