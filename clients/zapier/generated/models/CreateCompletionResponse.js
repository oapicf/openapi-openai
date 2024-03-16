const utils = require('../utils/utils');
const CreateCompletionResponse_choices_inner = require('../models/CreateCompletionResponse_choices_inner');
const CreateCompletionResponse_usage = require('../models/CreateCompletionResponse_usage');

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
                children: CreateCompletionResponse_choices_inner.fields(`${keyPrefix}choices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CreateCompletionResponse_usage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'choices': utils.childMapping(bundle.inputData?.[`${keyPrefix}choices`], `${keyPrefix}choices`, CreateCompletionResponse_choices_inner),
            'usage': utils.removeIfEmpty(CreateCompletionResponse_usage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
