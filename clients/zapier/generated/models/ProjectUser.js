const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.project.user` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project.user',
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
                label: `The name of the user - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}email`,
                label: `The email address of the user - [${labelPrefix}email]`,
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
                key: `${keyPrefix}added_at`,
                label: `The Unix timestamp (in seconds) of when the project was added. - [${labelPrefix}added_at]`,
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
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'added_at': bundle.inputData?.[`${keyPrefix}added_at`],
        }
    },
}
