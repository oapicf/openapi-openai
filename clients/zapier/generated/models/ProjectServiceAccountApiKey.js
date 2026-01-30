const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.project.service_account.api_key` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project.service_account.api_key',
                ],
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
