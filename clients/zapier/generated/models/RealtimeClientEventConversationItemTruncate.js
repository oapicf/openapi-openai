const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event_id`,
                label: `Optional client-generated ID used to identify this event. - [${labelPrefix}event_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The event type, must be `conversation.item.truncate`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.truncate',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}content_index`,
                label: `The index of the content part to truncate. Set this to 0. - [${labelPrefix}content_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}audio_end_ms`,
                label: `Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  - [${labelPrefix}audio_end_ms]`,
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
