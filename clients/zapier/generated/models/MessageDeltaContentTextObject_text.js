const utils = require('../utils/utils');
const MessageDeltaContentTextObject_text_annotations_inner = require('../models/MessageDeltaContentTextObject_text_annotations_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `The data that makes up the text. - [${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}annotations`,
                label: `[${labelPrefix}annotations]`,
                children: MessageDeltaContentTextObject_text_annotations_inner.fields(`${keyPrefix}annotations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'annotations': utils.childMapping(bundle.inputData?.[`${keyPrefix}annotations`], `${keyPrefix}annotations`, MessageDeltaContentTextObject_text_annotations_inner),
        }
    },
}
