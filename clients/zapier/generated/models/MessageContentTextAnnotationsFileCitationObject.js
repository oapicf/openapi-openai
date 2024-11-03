const utils = require('../utils/utils');
const MessageContentTextAnnotationsFileCitationObject_file_citation = require('../models/MessageContentTextAnnotationsFileCitationObject_file_citation');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `file_citation`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'file_citation',
                ],
            },
            {
                key: `${keyPrefix}text`,
                label: `The text in the message content that needs to be replaced. - [${labelPrefix}text]`,
                required: true,
                type: 'string',
            },
            ...MessageContentTextAnnotationsFileCitationObject_file_citation.fields(`${keyPrefix}file_citation`, isInput),
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
            'file_citation': utils.removeIfEmpty(MessageContentTextAnnotationsFileCitationObject_file_citation.mapping(bundle, `${keyPrefix}file_citation`)),
            'start_index': bundle.inputData?.[`${keyPrefix}start_index`],
            'end_index': bundle.inputData?.[`${keyPrefix}end_index`],
        }
    },
}
