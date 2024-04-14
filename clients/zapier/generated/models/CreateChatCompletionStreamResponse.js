const utils = require('../utils/utils');
const CreateChatCompletionStreamResponse_choices_inner = require('../models/CreateChatCompletionStreamResponse_choices_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `A unique identifier for the chat completion. Each chunk has the same ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}choices`,
                label: `[${labelPrefix}choices]`,
                children: CreateChatCompletionStreamResponse_choices_inner.fields(`${keyPrefix}choices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}created`,
                label: `The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. - [${labelPrefix}created]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}model`,
                label: `The model to generate the completion. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}system_fingerprint`,
                label: `This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  - [${labelPrefix}system_fingerprint]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `chat.completion.chunk`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'chat.completion.chunk',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'choices': utils.childMapping(bundle.inputData?.[`${keyPrefix}choices`], `${keyPrefix}choices`, CreateChatCompletionStreamResponse_choices_inner),
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'system_fingerprint': bundle.inputData?.[`${keyPrefix}system_fingerprint`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
        }
    },
}
