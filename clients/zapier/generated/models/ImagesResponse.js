const utils = require('../utils/utils');
const ImagesResponse_data_inner = require('../models/ImagesResponse_data_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created`,
                label: `[${labelPrefix}created]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                children: ImagesResponse_data_inner.fields(`${keyPrefix}data${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created': bundle.inputData?.[`${keyPrefix}created`],
            'data': utils.childMapping(bundle.inputData?.[`${keyPrefix}data`], `${keyPrefix}data`, ImagesResponse_data_inner),
        }
    },
}
