const utils = require('../utils/utils');
const CompletionUsage_completion_tokens_details = require('../models/CompletionUsage_completion_tokens_details');
const CompletionUsage_prompt_tokens_details = require('../models/CompletionUsage_prompt_tokens_details');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}completion_tokens`,
                label: `Number of tokens in the generated completion. - [${labelPrefix}completion_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}prompt_tokens`,
                label: `Number of tokens in the prompt. - [${labelPrefix}prompt_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total_tokens`,
                label: `Total number of tokens used in the request (prompt + completion). - [${labelPrefix}total_tokens]`,
                required: true,
                type: 'integer',
            },
            ...CompletionUsage_completion_tokens_details.fields(`${keyPrefix}completion_tokens_details`, isInput),
            ...CompletionUsage_prompt_tokens_details.fields(`${keyPrefix}prompt_tokens_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'completion_tokens': bundle.inputData?.[`${keyPrefix}completion_tokens`],
            'prompt_tokens': bundle.inputData?.[`${keyPrefix}prompt_tokens`],
            'total_tokens': bundle.inputData?.[`${keyPrefix}total_tokens`],
            'completion_tokens_details': utils.removeIfEmpty(CompletionUsage_completion_tokens_details.mapping(bundle, `${keyPrefix}completion_tokens_details`)),
            'prompt_tokens_details': utils.removeIfEmpty(CompletionUsage_prompt_tokens_details.mapping(bundle, `${keyPrefix}prompt_tokens_details`)),
        }
    },
}
