const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_id`,
                label: `The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. - [${labelPrefix}file_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}detail`,
                label: `Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. - [${labelPrefix}detail]`,
                type: 'string',
                choices: [
                    'auto',
                    'low',
                    'high',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_id': bundle.inputData?.[`${keyPrefix}file_id`],
            'detail': bundle.inputData?.[`${keyPrefix}detail`],
        }
    },
}
