const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}filename`,
                label: `The name of the file to upload.  - [${labelPrefix}filename]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}purpose`,
                label: `The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  - [${labelPrefix}purpose]`,
                required: true,
                type: 'string',
                choices: [
                    'assistants',
                    'batch',
                    'fine-tune',
                    'vision',
                ],
            },
            {
                key: `${keyPrefix}bytes`,
                label: `The number of bytes in the file you are uploading.  - [${labelPrefix}bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}mime_type`,
                label: `The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  - [${labelPrefix}mime_type]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'filename': bundle.inputData?.[`${keyPrefix}filename`],
            'purpose': bundle.inputData?.[`${keyPrefix}purpose`],
            'bytes': bundle.inputData?.[`${keyPrefix}bytes`],
            'mime_type': bundle.inputData?.[`${keyPrefix}mime_type`],
        }
    },
}
