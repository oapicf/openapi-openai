const utils = require('../utils/utils');
const ProjectApiKey_owner = require('../models/ProjectApiKey_owner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.project.api_key` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project.api_key',
                ],
            },
            {
                key: `${keyPrefix}redacted_value`,
                label: `The redacted value of the API key - [${labelPrefix}redacted_value]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the API key - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) of when the API key was created - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            ...ProjectApiKey_owner.fields(`${keyPrefix}owner`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'redacted_value': bundle.inputData?.[`${keyPrefix}redacted_value`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'owner': utils.removeIfEmpty(ProjectApiKey_owner.mapping(bundle, `${keyPrefix}owner`)),
        }
    },
}
