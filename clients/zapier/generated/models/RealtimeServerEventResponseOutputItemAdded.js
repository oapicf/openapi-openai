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
                label: `The event type, must be `response.output_item.added`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'response.output_item.added',
                ],
            },
            {
                key: `${keyPrefix}response_id`,
                label: `The ID of the Response to which the item belongs. - [${labelPrefix}response_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}output_index`,
                label: `The index of the output item in the Response. - [${labelPrefix}output_index]`,
                required: true,
                type: 'integer',
            },
            ...RealtimeConversationItem.fields(`${keyPrefix}item`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'response_id': bundle.inputData?.[`${keyPrefix}response_id`],
            'output_index': bundle.inputData?.[`${keyPrefix}output_index`],
            'item': utils.removeIfEmpty(RealtimeConversationItem.mapping(bundle, `${keyPrefix}item`)),
        }
    },
}
