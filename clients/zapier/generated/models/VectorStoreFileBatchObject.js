const utils = require('../utils/utils');
const VectorStoreFileBatchObject_file_counts = require('../models/VectorStoreFileBatchObject_file_counts');

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
                label: `The object type, which is always `vector_store.file_batch`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'vector_store.files_batch',
                ],
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the vector store files batch was created. - [${labelPrefix}created_at]`,
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
                label: `The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'in_progress',
                    'completed',
                    'cancelled',
                    'failed',
                ],
            },
            ...VectorStoreFileBatchObject_file_counts.fields(`${keyPrefix}file_counts`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'vector_store_id': bundle.inputData?.[`${keyPrefix}vector_store_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'file_counts': utils.removeIfEmpty(VectorStoreFileBatchObject_file_counts.mapping(bundle, `${keyPrefix}file_counts`)),
        }
    },
}
