const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `project.rate_limit` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'project.rate_limit',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `The model this rate limit applies to. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}max_requests_per_1_minute`,
                label: `The maximum requests per minute. - [${labelPrefix}max_requests_per_1_minute]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_tokens_per_1_minute`,
                label: `The maximum tokens per minute. - [${labelPrefix}max_tokens_per_1_minute]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_images_per_1_minute`,
                label: `The maximum images per minute. Only present for relevant models. - [${labelPrefix}max_images_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_audio_megabytes_per_1_minute`,
                label: `The maximum audio megabytes per minute. Only present for relevant models. - [${labelPrefix}max_audio_megabytes_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_requests_per_1_day`,
                label: `The maximum requests per day. Only present for relevant models. - [${labelPrefix}max_requests_per_1_day]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}batch_1_day_max_input_tokens`,
                label: `The maximum batch input tokens per day. Only present for relevant models. - [${labelPrefix}batch_1_day_max_input_tokens]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'max_requests_per_1_minute': bundle.inputData?.[`${keyPrefix}max_requests_per_1_minute`],
            'max_tokens_per_1_minute': bundle.inputData?.[`${keyPrefix}max_tokens_per_1_minute`],
            'max_images_per_1_minute': bundle.inputData?.[`${keyPrefix}max_images_per_1_minute`],
            'max_audio_megabytes_per_1_minute': bundle.inputData?.[`${keyPrefix}max_audio_megabytes_per_1_minute`],
            'max_requests_per_1_day': bundle.inputData?.[`${keyPrefix}max_requests_per_1_day`],
            'batch_1_day_max_input_tokens': bundle.inputData?.[`${keyPrefix}batch_1_day_max_input_tokens`],
        }
    },
}
