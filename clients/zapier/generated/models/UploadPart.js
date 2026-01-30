const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The upload Part unique identifier, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the Part was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}upload_id`,
                label: `The ID of the Upload object that this Part was added to. - [${labelPrefix}upload_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `upload.part`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'upload.part',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'upload_id': bundle.inputData?.[`${keyPrefix}upload_id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
        }
    },
}
