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
                label: `The event type, must be `response.audio.delta`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'response.audio.delta',
                ],
            },
            {
                key: `${keyPrefix}response_id`,
                label: `The ID of the response. - [${labelPrefix}response_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The ID of the item. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}output_index`,
                label: `The index of the output item in the response. - [${labelPrefix}output_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}content_index`,
                label: `The index of the content part in the item's content array. - [${labelPrefix}content_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}delta`,
                label: `Base64-encoded audio data delta. - [${labelPrefix}delta]`,
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
            'response_id': bundle.inputData?.[`${keyPrefix}response_id`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'output_index': bundle.inputData?.[`${keyPrefix}output_index`],
            'content_index': bundle.inputData?.[`${keyPrefix}content_index`],
            'delta': bundle.inputData?.[`${keyPrefix}delta`],
        }
    },
}
