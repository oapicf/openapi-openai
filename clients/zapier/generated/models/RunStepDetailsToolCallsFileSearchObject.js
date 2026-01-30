const utils = require('../utils/utils');
const RunStepDetailsToolCallsFileSearchObject_file_search = require('../models/RunStepDetailsToolCallsFileSearchObject_file_search');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the tool call object. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of tool call. This is always going to be `file_search` for this type of tool call. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'file_search',
                ],
            },
            ...RunStepDetailsToolCallsFileSearchObject_file_search.fields(`${keyPrefix}file_search`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'file_search': utils.removeIfEmpty(RunStepDetailsToolCallsFileSearchObject_file_search.mapping(bundle, `${keyPrefix}file_search`)),
        }
    },
}
