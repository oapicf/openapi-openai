const utils = require('../utils/utils');
const FineTuningJob = require('../models/FineTuningJob');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: FineTuningJob.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}has_more`,
                label: `[${labelPrefix}has_more]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'list',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, FineTuningJob),
            'has_more': bundle.inputData?.[`${keyPrefix}has_more`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
        }
    },
}
