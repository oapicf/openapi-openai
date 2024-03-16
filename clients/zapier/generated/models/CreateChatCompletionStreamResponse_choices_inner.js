const utils = require('../utils/utils');
const ChatCompletionStreamResponseDelta = require('../models/ChatCompletionStreamResponseDelta');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
            ...ChatCompletionStreamResponseDelta.fields(`${keyPrefix}delta`, isInput),
            {
                key: `${keyPrefix}finish_reason`,
                label: `[${labelPrefix}finish_reason]`,
                type: 'string',
                choices: [
                    'stop',
                    'length',
                    'function_call',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'delta': utils.removeIfEmpty(ChatCompletionStreamResponseDelta.mapping(bundle, `${keyPrefix}delta`)),
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
        }
    },
}
