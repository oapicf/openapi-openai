const utils = require('../utils/utils');
const AuditLog_organization_updated_changes_requested = require('../models/AuditLog_organization_updated_changes_requested');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The organization ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_organization_updated_changes_requested.fields(`${keyPrefix}changes_requested`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'changes_requested': utils.removeIfEmpty(AuditLog_organization_updated_changes_requested.mapping(bundle, `${keyPrefix}changes_requested`)),
        }
    },
}
