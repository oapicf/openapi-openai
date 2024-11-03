const utils = require('../utils/utils');
const MessageDeltaContentTextAnnotationsFilePathObject_file_path = require('../models/MessageDeltaContentTextAnnotationsFilePathObject_file_path');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}index`,
                label: `The index of the annotation in the text content part. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always `file_path`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'file_path',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text in the message content that needs to be replaced. - [${labelPrefix}text]`,
                type: 'string',
            },
            ...MessageDeltaContentTextAnnotationsFilePathObject_file_path.fields(`${keyPrefix}file_path`, isInput),
            {
                key: `${keyPrefix}start_index`,
                label: `[${labelPrefix}start_index]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_index`,
                label: `[${labelPrefix}end_index]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'file_path': utils.removeIfEmpty(MessageDeltaContentTextAnnotationsFilePathObject_file_path.mapping(bundle, `${keyPrefix}file_path`)),
            'start_index': bundle.inputData?.[`${keyPrefix}start_index`],
            'end_index': bundle.inputData?.[`${keyPrefix}end_index`],
        }
    },
}
