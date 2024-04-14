const utils = require('../utils/utils');
const CreateEmbeddingRequest_input = require('../models/CreateEmbeddingRequest_input');
const CreateEmbeddingRequest_model = require('../models/CreateEmbeddingRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateEmbeddingRequest_input.fields(`${keyPrefix}input`, isInput),
            ...CreateEmbeddingRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}encoding_format`,
                label: `The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). - [${labelPrefix}encoding_format]`,
                type: 'string',
                choices: [
                    'float',
                    'base64',
                ],
            },
            {
                key: `${keyPrefix}dimensions`,
                label: `The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  - [${labelPrefix}dimensions]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}user`,
                label: `A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  - [${labelPrefix}user]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input': utils.removeIfEmpty(CreateEmbeddingRequest_input.mapping(bundle, `${keyPrefix}input`)),
            'model': utils.removeIfEmpty(CreateEmbeddingRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'encoding_format': bundle.inputData?.[`${keyPrefix}encoding_format`],
            'dimensions': bundle.inputData?.[`${keyPrefix}dimensions`],
            'user': bundle.inputData?.[`${keyPrefix}user`],
        }
    },
}
