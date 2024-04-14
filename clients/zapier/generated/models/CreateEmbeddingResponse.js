const utils = require('../utils/utils');
const CreateEmbeddingResponse_usage = require('../models/CreateEmbeddingResponse_usage');
const Embedding = require('../models/Embedding');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: Embedding.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}model`,
                label: `The name of the model used to generate the embedding. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"list\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'list',
                ],
            },
            ...CreateEmbeddingResponse_usage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, Embedding),
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'usage': utils.removeIfEmpty(CreateEmbeddingResponse_usage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
