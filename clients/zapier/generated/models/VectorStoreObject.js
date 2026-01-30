const utils = require('../utils/utils');
const VectorStoreExpirationAfter = require('../models/VectorStoreExpirationAfter');
const VectorStoreObject_file_counts = require('../models/VectorStoreObject_file_counts');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `vector_store`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'vector_store',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the vector store was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the vector store. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}usage_bytes`,
                label: `The total number of bytes used by the files in the vector store. - [${labelPrefix}usage_bytes]`,
                required: true,
                type: 'integer',
            },
            ...VectorStoreObject_file_counts.fields(`${keyPrefix}file_counts`, isInput),
            {
                key: `${keyPrefix}status`,
                label: `The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'expired',
                    'in_progress',
                    'completed',
                ],
            },
            ...VectorStoreExpirationAfter.fields(`${keyPrefix}expires_after`, isInput),
            {
                key: `${keyPrefix}expires_at`,
                label: `The Unix timestamp (in seconds) for when the vector store will expire. - [${labelPrefix}expires_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}last_active_at`,
                label: `The Unix timestamp (in seconds) for when the vector store was last active. - [${labelPrefix}last_active_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                required: true,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'usage_bytes': bundle.inputData?.[`${keyPrefix}usage_bytes`],
            'file_counts': utils.removeIfEmpty(VectorStoreObject_file_counts.mapping(bundle, `${keyPrefix}file_counts`)),
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'expires_after': utils.removeIfEmpty(VectorStoreExpirationAfter.mapping(bundle, `${keyPrefix}expires_after`)),
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'last_active_at': bundle.inputData?.[`${keyPrefix}last_active_at`],
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
