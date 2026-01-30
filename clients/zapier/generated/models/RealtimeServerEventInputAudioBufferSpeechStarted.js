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
                label: `The event type, must be `input_audio_buffer.speech_started`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'input_audio_buffer.speech_started',
                ],
            },
            {
                key: `${keyPrefix}audio_start_ms`,
                label: `Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session.  - [${labelPrefix}audio_start_ms]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the user message item that will be created when speech stops.  - [${labelPrefix}item_id]`,
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
            'audio_start_ms': bundle.inputData?.[`${keyPrefix}audio_start_ms`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
        }
    },
}
