const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The model identifier, which can be referenced in the API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created`,
                label: `The Unix timestamp (in seconds) when the model was created. - [${labelPrefix}created]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"model\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'model',
                ],
            },
            {
                key: `${keyPrefix}owned_by`,
                label: `The organization that owns the model. - [${labelPrefix}owned_by]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'owned_by': bundle.inputData?.[`${keyPrefix}owned_by`],
        }
    },
}
