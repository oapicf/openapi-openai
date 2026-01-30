const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}part_ids`,
                label: `The ordered list of Part IDs.  - [${labelPrefix}part_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}md5`,
                label: `The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  - [${labelPrefix}md5]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'part_ids': bundle.inputData?.[`${keyPrefix}part_ids`],
            'md5': bundle.inputData?.[`${keyPrefix}md5`],
        }
    },
}
