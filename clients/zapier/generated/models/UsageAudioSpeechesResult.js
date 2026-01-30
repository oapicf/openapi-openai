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
                    'organization.usage.audio_speeches.result',
                ],
            },
            {
                key: `${keyPrefix}characters`,
                label: `The number of characters processed. - [${labelPrefix}characters]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}num_model_requests`,
                label: `The count of requests made to the model. - [${labelPrefix}num_model_requests]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}project_id`,
                label: `When `group_by=project_id`, this field provides the project ID of the grouped usage result. - [${labelPrefix}project_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_id`,
                label: `When `group_by=user_id`, this field provides the user ID of the grouped usage result. - [${labelPrefix}user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}api_key_id`,
                label: `When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. - [${labelPrefix}api_key_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `When `group_by=model`, this field provides the model name of the grouped usage result. - [${labelPrefix}model]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'characters': bundle.inputData?.[`${keyPrefix}characters`],
            'num_model_requests': bundle.inputData?.[`${keyPrefix}num_model_requests`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'api_key_id': bundle.inputData?.[`${keyPrefix}api_key_id`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
        }
    },
}
