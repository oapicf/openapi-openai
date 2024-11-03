const utils = require('../utils/utils');
const MessageContentTextAnnotationsFileCitationObject = require('../models/MessageContentTextAnnotationsFileCitationObject');
const MessageContentTextAnnotationsFileCitationObject_file_citation = require('../models/MessageContentTextAnnotationsFileCitationObject_file_citation');
const MessageContentTextAnnotationsFilePathObject = require('../models/MessageContentTextAnnotationsFilePathObject');
const MessageContentTextAnnotationsFilePathObject_file_path = require('../models/MessageContentTextAnnotationsFilePathObject_file_path');

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
                    'file_path',
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
            ...MessageContentTextAnnotationsFilePathObject_file_path.fields(`${keyPrefix}file_path`, isInput),
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
            'file_path': utils.removeIfEmpty(MessageContentTextAnnotationsFilePathObject_file_path.mapping(bundle, `${keyPrefix}file_path`)),
        }
    },
}
