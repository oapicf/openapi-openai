const utils = require('../utils/utils');
const AuditLog_organization_updated_changes_requested_settings = require('../models/AuditLog_organization_updated_changes_requested_settings');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}title`,
                label: `The organization title. - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `The organization description. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The organization name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...AuditLog_organization_updated_changes_requested_settings.fields(`${keyPrefix}settings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'settings': utils.removeIfEmpty(AuditLog_organization_updated_changes_requested_settings.mapping(bundle, `${keyPrefix}settings`)),
        }
    },
}
