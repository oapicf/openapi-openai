const utils = require('../utils/utils');
const MessageContentTextAnnotationsFilePathObject_file_path = require('../models/MessageContentTextAnnotationsFilePathObject_file_path');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                required: true,
                type: 'string',
            },
            ...MessageContentTextAnnotationsFilePathObject_file_path.fields(`${keyPrefix}file_path`, isInput),
            {
                key: `${keyPrefix}start_index`,
                label: `[${labelPrefix}start_index]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_index`,
                label: `[${labelPrefix}end_index]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'text': bundle.inputData?.[`${keyPrefix}text`],
            'file_path': utils.removeIfEmpty(MessageContentTextAnnotationsFilePathObject_file_path.mapping(bundle, `${keyPrefix}file_path`)),
            'start_index': bundle.inputData?.[`${keyPrefix}start_index`],
            'end_index': bundle.inputData?.[`${keyPrefix}end_index`],
        }
    },
}
