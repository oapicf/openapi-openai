const utils = require('../utils/utils');
const CreateCompletionResponse_choices_inner_logprobs = require('../models/CreateCompletionResponse_choices_inner_logprobs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}finish_reason`,
                label: `The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  - [${labelPrefix}finish_reason]`,
                required: true,
                type: 'string',
                choices: [
                    'stop',
                    'length',
                    'content_filter',
                ],
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            ...CreateCompletionResponse_choices_inner_logprobs.fields(`${keyPrefix}logprobs`, isInput),
            {
                key: `${keyPrefix}text`,
                label: `[${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'logprobs': utils.removeIfEmpty(CreateCompletionResponse_choices_inner_logprobs.mapping(bundle, `${keyPrefix}logprobs`)),
            'text': bundle.inputData?.[`${keyPrefix}text`],
        }
    },
}
