const utils = require('../utils/utils');
const CreateEmbeddingResponse_data_inner = require('../models/CreateEmbeddingResponse_data_inner');
const CreateEmbeddingResponse_usage = require('../models/CreateEmbeddingResponse_usage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}model`,
                label: `[${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: CreateEmbeddingResponse_data_inner.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CreateEmbeddingResponse_usage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, CreateEmbeddingResponse_data_inner),
            'usage': utils.removeIfEmpty(CreateEmbeddingResponse_usage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
