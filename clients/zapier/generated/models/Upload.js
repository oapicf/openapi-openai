const utils = require('../utils/utils');
const OpenAIFile = require('../models/OpenAIFile');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The Upload unique identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the Upload was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}filename`,
                label: `The name of the file to be uploaded. - [${labelPrefix}filename]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}bytes`,
                label: `The intended number of bytes to be uploaded. - [${labelPrefix}bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}purpose`,
                label: `The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. - [${labelPrefix}purpose]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The status of the Upload. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'pending',
                    'completed',
                    'cancelled',
                    'expired',
                ],
            },
            {
                key: `${keyPrefix}expires_at`,
                label: `The Unix timestamp (in seconds) for when the Upload was created. - [${labelPrefix}expires_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"upload\". - [${labelPrefix}object]`,
                type: 'string',
                choices: [
                    'upload',
                ],
            },
            ...OpenAIFile.fields(`${keyPrefix}file`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'filename': bundle.inputData?.[`${keyPrefix}filename`],
            'bytes': bundle.inputData?.[`${keyPrefix}bytes`],
            'purpose': bundle.inputData?.[`${keyPrefix}purpose`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'file': utils.removeIfEmpty(OpenAIFile.mapping(bundle, `${keyPrefix}file`)),
        }
    },
}
