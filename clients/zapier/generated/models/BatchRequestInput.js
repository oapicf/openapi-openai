const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}custom_id`,
                label: `A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. - [${labelPrefix}custom_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}method`,
                label: `The HTTP method to be used for the request. Currently only `POST` is supported. - [${labelPrefix}method]`,
                type: 'string',
                choices: [
                    'POST',
                ],
            },
            {
                key: `${keyPrefix}url`,
                label: `The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. - [${labelPrefix}url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'custom_id': bundle.inputData?.[`${keyPrefix}custom_id`],
            'method': bundle.inputData?.[`${keyPrefix}method`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
