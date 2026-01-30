const utils = require('../utils/utils');
const VectorStoreFileObject_chunking_strategy = require('../models/VectorStoreFileObject_chunking_strategy');
const VectorStoreFileObject_last_error = require('../models/VectorStoreFileObject_last_error');

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
                label: `The object type, which is always `vector_store.file`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'vector_store.file',
                ],
            },
            {
                key: `${keyPrefix}usage_bytes`,
                label: `The total vector store usage in bytes. Note that this may be different from the original file size. - [${labelPrefix}usage_bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the vector store file was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}vector_store_id`,
                label: `The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. - [${labelPrefix}vector_store_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'in_progress',
                    'completed',
                    'cancelled',
                    'failed',
                ],
            },
            ...VectorStoreFileObject_last_error.fields(`${keyPrefix}last_error`, isInput),
            ...VectorStoreFileObject_chunking_strategy.fields(`${keyPrefix}chunking_strategy`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'usage_bytes': bundle.inputData?.[`${keyPrefix}usage_bytes`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'vector_store_id': bundle.inputData?.[`${keyPrefix}vector_store_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'last_error': utils.removeIfEmpty(VectorStoreFileObject_last_error.mapping(bundle, `${keyPrefix}last_error`)),
            'chunking_strategy': utils.removeIfEmpty(VectorStoreFileObject_chunking_strategy.mapping(bundle, `${keyPrefix}chunking_strategy`)),
        }
    },
}
