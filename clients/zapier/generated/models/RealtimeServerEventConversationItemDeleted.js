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
                label: `The event type, must be `conversation.item.deleted`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.deleted',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the item that was deleted. - [${labelPrefix}item_id]`,
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
        }
    },
}
