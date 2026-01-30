const utils = require('../utils/utils');
const CreateMessageRequest_attachments_inner_tools_inner = require('../models/CreateMessageRequest_attachments_inner_tools_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}file_id`,
                label: `The ID of the file to attach to the message. - [${labelPrefix}file_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: CreateMessageRequest_attachments_inner_tools_inner.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'file_id': bundle.inputData?.[`${keyPrefix}file_id`],
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, CreateMessageRequest_attachments_inner_tools_inner),
        }
    },
}
