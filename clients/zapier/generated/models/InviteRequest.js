const utils = require('../utils/utils');
const InviteRequest_projects_inner = require('../models/InviteRequest_projects_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}email`,
                label: `Send an email to this address - [${labelPrefix}email]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: ``owner` or `reader` - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'reader',
                    'owner',
                ],
            },
            {
                key: `${keyPrefix}projects`,
                label: `[${labelPrefix}projects]`,
                children: InviteRequest_projects_inner.fields(`${keyPrefix}projects${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'projects': utils.childMapping(bundle.inputData?.[`${keyPrefix}projects`], `${keyPrefix}projects`, InviteRequest_projects_inner),
        }
    },
}
