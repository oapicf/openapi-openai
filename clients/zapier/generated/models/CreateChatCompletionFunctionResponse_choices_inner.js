const utils = require('../utils/utils');
const ChatCompletionResponseMessage = require('../models/ChatCompletionResponseMessage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}finish_reason`,
                label: `The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.  - [${labelPrefix}finish_reason]`,
                required: true,
                type: 'string',
                choices: [
                    'stop',
                    'length',
                    'function_call',
                    'content_filter',
                ],
            },
            {
                key: `${keyPrefix}index`,
                label: `The index of the choice in the list of choices. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            ...ChatCompletionResponseMessage.fields(`${keyPrefix}message`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'message': utils.removeIfEmpty(ChatCompletionResponseMessage.mapping(bundle, `${keyPrefix}message`)),
        }
    },
}
