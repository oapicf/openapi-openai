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
                    'organization.usage.code_interpreter_sessions.result',
                ],
            },
            {
                key: `${keyPrefix}sessions`,
                label: `The number of code interpreter sessions. - [${labelPrefix}sessions]`,
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
            'sessions': bundle.inputData?.[`${keyPrefix}sessions`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
        }
    },
}
