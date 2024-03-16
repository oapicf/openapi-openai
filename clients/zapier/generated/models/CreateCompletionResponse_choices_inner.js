const utils = require('../utils/utils');
const CreateCompletionResponse_choices_inner_logprobs = require('../models/CreateCompletionResponse_choices_inner_logprobs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}text`,
                label: `[${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            ...CreateCompletionResponse_choices_inner_logprobs.fields(`${keyPrefix}logprobs`, isInput),
            {
                key: `${keyPrefix}finish_reason`,
                label: `[${labelPrefix}finish_reason]`,
                required: true,
                type: 'string',
                choices: [
                    'stop',
                    'length',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'logprobs': utils.removeIfEmpty(CreateCompletionResponse_choices_inner_logprobs.mapping(bundle, `${keyPrefix}logprobs`)),
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
        }
    },
}
