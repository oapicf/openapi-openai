const utils = require('../utils/utils');
const Invite_projects_inner = require('../models/Invite_projects_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `organization.invite` - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'organization.invite',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `The identifier, which can be referenced in API endpoints - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}email`,
                label: `The email address of the individual to whom the invite was sent - [${labelPrefix}email]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: ``owner` or `reader` - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'owner',
                    'reader',
                ],
            },
            {
                key: `${keyPrefix}status`,
                label: ``accepted`,`expired`, or `pending` - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'accepted',
                    'expired',
                    'pending',
                ],
            },
            {
                key: `${keyPrefix}invited_at`,
                label: `The Unix timestamp (in seconds) of when the invite was sent. - [${labelPrefix}invited_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}expires_at`,
                label: `The Unix timestamp (in seconds) of when the invite expires. - [${labelPrefix}expires_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}accepted_at`,
                label: `The Unix timestamp (in seconds) of when the invite was accepted. - [${labelPrefix}accepted_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}projects`,
                label: `[${labelPrefix}projects]`,
                children: Invite_projects_inner.fields(`${keyPrefix}projects${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'invited_at': bundle.inputData?.[`${keyPrefix}invited_at`],
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'accepted_at': bundle.inputData?.[`${keyPrefix}accepted_at`],
            'projects': utils.childMapping(bundle.inputData?.[`${keyPrefix}projects`], `${keyPrefix}projects`, Invite_projects_inner),
        }
    },
}
