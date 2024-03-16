const utils = require('../utils/utils');
const ChatCompletionResponseMessage = require('../models/ChatCompletionResponseMessage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'integer',
            },
            ...ChatCompletionResponseMessage.fields(`${keyPrefix}message`, isInput),
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
            'message': utils.removeIfEmpty(ChatCompletionResponseMessage.mapping(bundle, `${keyPrefix}message`)),
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
        }
    },
}
