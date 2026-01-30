const utils = require('../utils/utils');
const RealtimeConversationItem = require('../models/RealtimeConversationItem');

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
                label: `The event type, must be `conversation.item.create`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.item.create',
                ],
            },
            {
                key: `${keyPrefix}previous_item_id`,
                label: `The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  - [${labelPrefix}previous_item_id]`,
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
