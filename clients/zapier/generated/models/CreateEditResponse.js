const utils = require('../utils/utils');
const CreateCompletionResponse_usage = require('../models/CreateCompletionResponse_usage');
const CreateEditResponse_choices_inner = require('../models/CreateEditResponse_choices_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}choices`,
                label: `[${labelPrefix}choices]`,
                children: CreateEditResponse_choices_inner.fields(`${keyPrefix}choices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CreateCompletionResponse_usage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'choices': utils.childMapping(bundle.inputData?.[`${keyPrefix}choices`], `${keyPrefix}choices`, CreateEditResponse_choices_inner),
            'usage': utils.removeIfEmpty(CreateCompletionResponse_usage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
