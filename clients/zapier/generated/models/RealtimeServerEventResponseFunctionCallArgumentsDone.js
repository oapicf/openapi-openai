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
                label: `The event type, must be `response.function_call_arguments.done`.  - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'response.function_call_arguments.done',
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
                label: `The ID of the function call item. - [${labelPrefix}item_id]`,
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
                key: `${keyPrefix}call_id`,
                label: `The ID of the function call. - [${labelPrefix}call_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}arguments`,
                label: `The final arguments as a JSON string. - [${labelPrefix}arguments]`,
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
            'call_id': bundle.inputData?.[`${keyPrefix}call_id`],
            'arguments': bundle.inputData?.[`${keyPrefix}arguments`],
        }
    },
}
