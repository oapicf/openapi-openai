const utils = require('../utils/utils');
const RunStepDetailsToolCallsFileSearchResultObject_content_inner = require('../models/RunStepDetailsToolCallsFileSearchResultObject_content_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_id`,
                label: `The ID of the file that result was found in. - [${labelPrefix}file_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}file_name`,
                label: `The name of the file that result was found in. - [${labelPrefix}file_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}score`,
                label: `The score of the result. All values must be a floating point number between 0 and 1. - [${labelPrefix}score]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}content`,
                label: `[${labelPrefix}content]`,
                children: RunStepDetailsToolCallsFileSearchResultObject_content_inner.fields(`${keyPrefix}content${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_id': bundle.inputData?.[`${keyPrefix}file_id`],
            'file_name': bundle.inputData?.[`${keyPrefix}file_name`],
            'score': bundle.inputData?.[`${keyPrefix}score`],
            'content': utils.childMapping(bundle.inputData?.[`${keyPrefix}content`], `${keyPrefix}content`, RunStepDetailsToolCallsFileSearchResultObject_content_inner),
        }
    },
}
