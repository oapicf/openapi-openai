const utils = require('../utils/utils');
const CreateVectorStoreRequest_chunking_strategy = require('../models/CreateVectorStoreRequest_chunking_strategy');
const VectorStoreExpirationAfter = require('../models/VectorStoreExpirationAfter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. - [${labelPrefix}file_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the vector store. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...VectorStoreExpirationAfter.fields(`${keyPrefix}expires_after`, isInput),
            ...CreateVectorStoreRequest_chunking_strategy.fields(`${keyPrefix}chunking_strategy`, isInput),
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'expires_after': utils.removeIfEmpty(VectorStoreExpirationAfter.mapping(bundle, `${keyPrefix}expires_after`)),
            'chunking_strategy': utils.removeIfEmpty(CreateVectorStoreRequest_chunking_strategy.mapping(bundle, `${keyPrefix}chunking_strategy`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
