const utils = require('../utils/utils');
const CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy = require('../models/CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  - [${labelPrefix}file_ids]`,
                list: true,
                type: 'string',
            },
            ...CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.fields(`${keyPrefix}chunking_strategy`, isInput),
            {
                key: `${keyPrefix}metadata`,
                label: `Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  - [${labelPrefix}metadata]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
            'chunking_strategy': utils.removeIfEmpty(CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.mapping(bundle, `${keyPrefix}chunking_strategy`)),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
        }
    },
}
