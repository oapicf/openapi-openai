const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.project` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the project. This appears in reporting. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) of when the project was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}archived_at`,
                label: `The Unix timestamp (in seconds) of when the project was archived or `null`. - [${labelPrefix}archived_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                label: ``active` or `archived` - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'active',
                    'archived',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'archived_at': bundle.inputData?.[`${keyPrefix}archived_at`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
