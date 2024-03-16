const utils = require('../utils/utils');
const OpenAIFile = require('../models/OpenAIFile');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: OpenAIFile.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, OpenAIFile),
        }
    },
}
