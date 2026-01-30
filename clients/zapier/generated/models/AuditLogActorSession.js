const utils = require('../utils/utils');
const AuditLogActorUser = require('../models/AuditLogActorUser');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AuditLogActorUser.fields(`${keyPrefix}user`, isInput),
            {
                key: `${keyPrefix}ip_address`,
                label: `The IP address from which the action was performed. - [${labelPrefix}ip_address]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'user': utils.removeIfEmpty(AuditLogActorUser.mapping(bundle, `${keyPrefix}user`)),
            'ip_address': bundle.inputData?.[`${keyPrefix}ip_address`],
        }
    },
}
