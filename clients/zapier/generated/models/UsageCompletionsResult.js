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
                    'organization.usage.completions.result',
                ],
            },
            {
                key: `${keyPrefix}input_tokens`,
                label: `The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. - [${labelPrefix}input_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}input_cached_tokens`,
                label: `The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. - [${labelPrefix}input_cached_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}output_tokens`,
                label: `The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. - [${labelPrefix}output_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}input_audio_tokens`,
                label: `The aggregated number of audio input tokens used, including cached tokens. - [${labelPrefix}input_audio_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}output_audio_tokens`,
                label: `The aggregated number of audio output tokens used. - [${labelPrefix}output_audio_tokens]`,
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
            {
                key: `${keyPrefix}batch`,
                label: `When `group_by=batch`, this field tells whether the grouped usage result is batch or not. - [${labelPrefix}batch]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'input_tokens': bundle.inputData?.[`${keyPrefix}input_tokens`],
            'input_cached_tokens': bundle.inputData?.[`${keyPrefix}input_cached_tokens`],
            'output_tokens': bundle.inputData?.[`${keyPrefix}output_tokens`],
            'input_audio_tokens': bundle.inputData?.[`${keyPrefix}input_audio_tokens`],
            'output_audio_tokens': bundle.inputData?.[`${keyPrefix}output_audio_tokens`],
            'num_model_requests': bundle.inputData?.[`${keyPrefix}num_model_requests`],
            'project_id': bundle.inputData?.[`${keyPrefix}project_id`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'api_key_id': bundle.inputData?.[`${keyPrefix}api_key_id`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'batch': bundle.inputData?.[`${keyPrefix}batch`],
        }
    },
}
