const utils = require('../utils/utils');
const ProjectServiceAccountApiKey = require('../models/ProjectServiceAccountApiKey');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.project.service_account',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
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
                key: `${keyPrefix}role`,
                label: `Service accounts can only have one role of type `member` - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'member',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            ...ProjectServiceAccountApiKey.fields(`${keyPrefix}api_key`, isInput),
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
            'api_key': utils.removeIfEmpty(ProjectServiceAccountApiKey.mapping(bundle, `${keyPrefix}api_key`)),
        }
    },
}
