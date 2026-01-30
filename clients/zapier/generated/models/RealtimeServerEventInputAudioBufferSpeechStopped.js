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
                label: `The event type, must be `input_audio_buffer.speech_stopped`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'input_audio_buffer.speech_stopped',
                ],
            },
            {
                key: `${keyPrefix}audio_end_ms`,
                label: `Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  - [${labelPrefix}audio_end_ms]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the user message item that will be created. - [${labelPrefix}item_id]`,
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
            'audio_end_ms': bundle.inputData?.[`${keyPrefix}audio_end_ms`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
        }
    },
}
