const utils = require('../utils/utils');
const ChatCompletionMessageToolCall_function = require('../models/ChatCompletionMessageToolCall_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool. Currently, only `function` is supported. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            ...ChatCompletionMessageToolCall_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(ChatCompletionMessageToolCall_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
