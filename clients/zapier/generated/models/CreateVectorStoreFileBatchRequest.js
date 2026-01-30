const utils = require('../utils/utils');
const ChunkingStrategyRequestParam = require('../models/ChunkingStrategyRequestParam');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_ids`,
                label: `A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. - [${labelPrefix}file_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            ...ChunkingStrategyRequestParam.fields(`${keyPrefix}chunking_strategy`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_ids': bundle.inputData?.[`${keyPrefix}file_ids`],
            'chunking_strategy': utils.removeIfEmpty(ChunkingStrategyRequestParam.mapping(bundle, `${keyPrefix}chunking_strategy`)),
        }
    },
}
