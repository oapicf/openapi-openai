const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the segment. - [${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}seek`,
                label: `Seek offset of the segment. - [${labelPrefix}seek]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}start`,
                label: `Start time of the segment in seconds. - [${labelPrefix}start]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}end`,
                label: `End time of the segment in seconds. - [${labelPrefix}end]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}text`,
                label: `Text content of the segment. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tokens`,
                label: `Array of token IDs for the text content. - [${labelPrefix}tokens]`,
                required: true,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}temperature`,
                label: `Temperature parameter used for generating the segment. - [${labelPrefix}temperature]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}avg_logprob`,
                label: `Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. - [${labelPrefix}avg_logprob]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}compression_ratio`,
                label: `Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. - [${labelPrefix}compression_ratio]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}no_speech_prob`,
                label: `Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. - [${labelPrefix}no_speech_prob]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'seek': bundle.inputData?.[`${keyPrefix}seek`],
            'start': bundle.inputData?.[`${keyPrefix}start`],
            'end': bundle.inputData?.[`${keyPrefix}end`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'tokens': bundle.inputData?.[`${keyPrefix}tokens`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'avg_logprob': bundle.inputData?.[`${keyPrefix}avg_logprob`],
            'compression_ratio': bundle.inputData?.[`${keyPrefix}compression_ratio`],
            'no_speech_prob': bundle.inputData?.[`${keyPrefix}no_speech_prob`],
        }
    },
}
