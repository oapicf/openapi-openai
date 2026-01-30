const utils = require('../utils/utils');
const RealtimeConversationItem = require('../models/RealtimeConversationItem');

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
                label: `The event type, must be `conversation.item.created`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.created',
                ],
            },
            {
                key: `${keyPrefix}previous_item_id`,
                label: `The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  - [${labelPrefix}previous_item_id]`,
                required: true,
                type: 'string',
            },
            ...RealtimeConversationItem.fields(`${keyPrefix}item`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'previous_item_id': bundle.inputData?.[`${keyPrefix}previous_item_id`],
            'item': utils.removeIfEmpty(RealtimeConversationItem.mapping(bundle, `${keyPrefix}item`)),
        }
    },
}
