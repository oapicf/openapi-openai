const utils = require('../utils/utils');
const UsageTimeBucket_result_inner = require('../models/UsageTimeBucket_result_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'bucket',
                ],
            },
            {
                key: `${keyPrefix}start_time`,
                label: `[${labelPrefix}start_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `[${labelPrefix}end_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}result`,
                label: `[${labelPrefix}result]`,
                children: UsageTimeBucket_result_inner.fields(`${keyPrefix}result${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'result': utils.childMapping(bundle.inputData?.[`${keyPrefix}result`], `${keyPrefix}result`, UsageTimeBucket_result_inner),
        }
    },
}
