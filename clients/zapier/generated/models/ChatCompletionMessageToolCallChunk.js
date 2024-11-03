const utils = require('../utils/utils');
const ChatCompletionMessageToolCallChunk_function = require('../models/ChatCompletionMessageToolCallChunk_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool. Currently, only `function` is supported. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            ...ChatCompletionMessageToolCallChunk_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(ChatCompletionMessageToolCallChunk_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
