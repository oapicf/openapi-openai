const utils = require('../utils/utils');
const Batch_errors_data_inner = require('../models/Batch_errors_data_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `list`. - [${labelPrefix}object]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: Batch_errors_data_inner.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, Batch_errors_data_inner),
        }
    },
}
