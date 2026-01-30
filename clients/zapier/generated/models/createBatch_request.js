const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}input_file_id`,
                label: `The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  - [${labelPrefix}input_file_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}endpoint`,
                label: `The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. - [${labelPrefix}endpoint]`,
                required: true,
                type: 'string',
                choices: [
                    '/v1/chat/completions',
                    '/v1/embeddings',
                    '/v1/completions',
                ],
            },
            {
                key: `${keyPrefix}completion_window`,
                label: `The time frame within which the batch should be processed. Currently only `24h` is supported. - [${labelPrefix}completion_window]`,
                required: true,
                type: 'string',
                choices: [
                    '24h',
                ],
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Optional custom metadata for the batch. - [${labelPrefix}metadata]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input_file_id': bundle.inputData?.[`${keyPrefix}input_file_id`],
            'endpoint': bundle.inputData?.[`${keyPrefix}endpoint`],
            'completion_window': bundle.inputData?.[`${keyPrefix}completion_window`],
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
