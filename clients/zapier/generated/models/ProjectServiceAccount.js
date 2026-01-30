const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.project.service_account` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project.service_account',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the service account - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: ``owner` or `member` - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'owner',
                    'member',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) of when the service account was created - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
        }
    },
}
