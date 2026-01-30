const utils = require('../utils/utils');
const CreateThreadRequest_tool_resources_file_search_vector_stores_inner = require('../models/CreateThreadRequest_tool_resources_file_search_vector_stores_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}vector_store_ids`,
                label: `The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  - [${labelPrefix}vector_store_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}vector_stores`,
                label: `[${labelPrefix}vector_stores]`,
                children: CreateThreadRequest_tool_resources_file_search_vector_stores_inner.fields(`${keyPrefix}vector_stores${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'vector_store_ids': bundle.inputData?.[`${keyPrefix}vector_store_ids`],
            'vector_stores': utils.childMapping(bundle.inputData?.[`${keyPrefix}vector_stores`], `${keyPrefix}vector_stores`, CreateThreadRequest_tool_resources_file_search_vector_stores_inner),
        }
    },
}
