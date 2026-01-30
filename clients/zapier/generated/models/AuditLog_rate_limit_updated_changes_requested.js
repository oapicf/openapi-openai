const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_requests_per_1_minute`,
                label: `The maximum requests per minute. - [${labelPrefix}max_requests_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_tokens_per_1_minute`,
                label: `The maximum tokens per minute. - [${labelPrefix}max_tokens_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_images_per_1_minute`,
                label: `The maximum images per minute. Only relevant for certain models. - [${labelPrefix}max_images_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_audio_megabytes_per_1_minute`,
                label: `The maximum audio megabytes per minute. Only relevant for certain models. - [${labelPrefix}max_audio_megabytes_per_1_minute]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_requests_per_1_day`,
                label: `The maximum requests per day. Only relevant for certain models. - [${labelPrefix}max_requests_per_1_day]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}batch_1_day_max_input_tokens`,
                label: `The maximum batch input tokens per day. Only relevant for certain models. - [${labelPrefix}batch_1_day_max_input_tokens]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_requests_per_1_minute': bundle.inputData?.[`${keyPrefix}max_requests_per_1_minute`],
            'max_tokens_per_1_minute': bundle.inputData?.[`${keyPrefix}max_tokens_per_1_minute`],
            'max_images_per_1_minute': bundle.inputData?.[`${keyPrefix}max_images_per_1_minute`],
            'max_audio_megabytes_per_1_minute': bundle.inputData?.[`${keyPrefix}max_audio_megabytes_per_1_minute`],
            'max_requests_per_1_day': bundle.inputData?.[`${keyPrefix}max_requests_per_1_day`],
            'batch_1_day_max_input_tokens': bundle.inputData?.[`${keyPrefix}batch_1_day_max_input_tokens`],
        }
    },
}
