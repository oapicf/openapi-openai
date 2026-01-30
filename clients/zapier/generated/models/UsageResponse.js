const utils = require('../utils/utils');
const UsageTimeBucket = require('../models/UsageTimeBucket');

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
                    'page',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: UsageTimeBucket.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}has_more`,
                label: `[${labelPrefix}has_more]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}next_page`,
                label: `[${labelPrefix}next_page]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, UsageTimeBucket),
            'has_more': bundle.inputData?.[`${keyPrefix}has_more`],
            'next_page': bundle.inputData?.[`${keyPrefix}next_page`],
        }
    },
}
