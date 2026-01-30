const utils = require('../utils/utils');
const FileSearchRankingOptions = require('../models/FileSearchRankingOptions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}max_num_results`,
                label: `The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  - [${labelPrefix}max_num_results]`,
                type: 'integer',
            },
            ...FileSearchRankingOptions.fields(`${keyPrefix}ranking_options`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max_num_results': bundle.inputData?.[`${keyPrefix}max_num_results`],
            'ranking_options': utils.removeIfEmpty(FileSearchRankingOptions.mapping(bundle, `${keyPrefix}ranking_options`)),
        }
    },
}
