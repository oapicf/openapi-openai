const utils = require('../utils/utils');
const AssistantToolsFileSearch_file_search = require('../models/AssistantToolsFileSearch_file_search');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of tool being defined: `file_search` - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'file_search',
                ],
            },
            ...AssistantToolsFileSearch_file_search.fields(`${keyPrefix}file_search`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'file_search': utils.removeIfEmpty(AssistantToolsFileSearch_file_search.mapping(bundle, `${keyPrefix}file_search`)),
        }
    },
}
