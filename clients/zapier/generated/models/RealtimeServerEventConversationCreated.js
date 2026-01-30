const utils = require('../utils/utils');
const RealtimeServerEventConversationCreated_conversation = require('../models/RealtimeServerEventConversationCreated_conversation');

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
                label: `The event type, must be `conversation.created`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'conversation.created',
                ],
            },
            ...RealtimeServerEventConversationCreated_conversation.fields(`${keyPrefix}conversation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'conversation': utils.removeIfEmpty(RealtimeServerEventConversationCreated_conversation.mapping(bundle, `${keyPrefix}conversation`)),
        }
    },
}
