const utils = require('../utils/utils');
const CreateChatCompletionStreamResponse_choices_inner = require('../models/CreateChatCompletionStreamResponse_choices_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created`,
                label: `[${labelPrefix}created]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}model`,
                label: `[${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}choices`,
                label: `[${labelPrefix}choices]`,
                children: CreateChatCompletionStreamResponse_choices_inner.fields(`${keyPrefix}choices${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'choices': utils.childMapping(bundle.inputData?.[`${keyPrefix}choices`], `${keyPrefix}choices`, CreateChatCompletionStreamResponse_choices_inner),
        }
    },
}
