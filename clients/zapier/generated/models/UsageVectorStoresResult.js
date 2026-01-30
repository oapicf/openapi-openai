const utils = require('../utils/utils');

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
                    'organization.usage.vector_stores.result',
                ],
            },
            {
                key: `${keyPrefix}usage_bytes`,
                label: `The vector stores usage in bytes. - [${labelPrefix}usage_bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}project_id`,
                label: `When `group_by=project_id`, this field provides the project ID of the grouped usage result. - [${labelPrefix}project_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'usage_bytes': bundle.inputData?.[`${keyPrefix}usage_bytes`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
        }
    },
}
