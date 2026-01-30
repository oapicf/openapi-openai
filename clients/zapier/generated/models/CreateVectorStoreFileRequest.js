const utils = require('../utils/utils');
const ChunkingStrategyRequestParam = require('../models/ChunkingStrategyRequestParam');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_id`,
                label: `A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. - [${labelPrefix}file_id]`,
                required: true,
                type: 'string',
            },
            ...ChunkingStrategyRequestParam.fields(`${keyPrefix}chunking_strategy`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_id': bundle.inputData?.[`${keyPrefix}file_id`],
            'chunking_strategy': utils.removeIfEmpty(ChunkingStrategyRequestParam.mapping(bundle, `${keyPrefix}chunking_strategy`)),
        }
    },
}
