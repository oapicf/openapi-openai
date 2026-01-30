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
                label: `The event type, must be `input_audio_buffer.committed`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'input_audio_buffer.committed',
                ],
            },
            {
                key: `${keyPrefix}previous_item_id`,
                label: `The ID of the preceding item after which the new item will be inserted.  - [${labelPrefix}previous_item_id]`,
                required: true,
                type: 'string',
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
            'previous_item_id': bundle.inputData?.[`${keyPrefix}previous_item_id`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
        }
    },
}
