const utils = require('../utils/utils');
const CompletionUsage = require('../models/CompletionUsage');
const CreateChatCompletionResponse_choices_inner = require('../models/CreateChatCompletionResponse_choices_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `A unique identifier for the chat completion. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}choices`,
                label: `[${labelPrefix}choices]`,
                children: CreateChatCompletionResponse_choices_inner.fields(`${keyPrefix}choices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}created`,
                label: `The Unix timestamp (in seconds) of when the chat completion was created. - [${labelPrefix}created]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}model`,
                label: `The model used for the chat completion. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}system_fingerprint`,
                label: `This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  - [${labelPrefix}system_fingerprint]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `chat.completion`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'chat.completion',
                ],
            },
            ...CompletionUsage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'choices': utils.childMapping(bundle.inputData?.[`${keyPrefix}choices`], `${keyPrefix}choices`, CreateChatCompletionResponse_choices_inner),
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'system_fingerprint': bundle.inputData?.[`${keyPrefix}system_fingerprint`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'usage': utils.removeIfEmpty(CompletionUsage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
