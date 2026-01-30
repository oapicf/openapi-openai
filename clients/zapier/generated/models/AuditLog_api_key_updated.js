const utils = require('../utils/utils');
const AuditLog_api_key_updated_changes_requested = require('../models/AuditLog_api_key_updated_changes_requested');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The tracking ID of the API key. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...AuditLog_api_key_updated_changes_requested.fields(`${keyPrefix}changes_requested`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'changes_requested': utils.removeIfEmpty(AuditLog_api_key_updated_changes_requested.mapping(bundle, `${keyPrefix}changes_requested`)),
        }
    },
}
