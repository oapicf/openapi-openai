const utils = require('../utils/utils');
const CreateEmbeddingRequest_input = require('../models/CreateEmbeddingRequest_input');
const CreateEmbeddingRequest_model = require('../models/CreateEmbeddingRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateEmbeddingRequest_model.fields(`${keyPrefix}model`, isInput),
            ...CreateEmbeddingRequest_input.fields(`${keyPrefix}input`, isInput),
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
            'model': utils.removeIfEmpty(CreateEmbeddingRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'input': utils.removeIfEmpty(CreateEmbeddingRequest_input.mapping(bundle, `${keyPrefix}input`)),
            'user': bundle.inputData?.[`${keyPrefix}user`],
        }
    },
}
