const utils = require('../utils/utils');
const AuditLogActorServiceAccount = require('../models/AuditLogActorServiceAccount');
const AuditLogActorUser = require('../models/AuditLogActorUser');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The tracking id of the API key. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of API key. Can be either `user` or `service_account`. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'user',
                    'service_account',
                ],
            },
            ...AuditLogActorUser.fields(`${keyPrefix}user`, isInput),
            ...AuditLogActorServiceAccount.fields(`${keyPrefix}service_account`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'user': utils.removeIfEmpty(AuditLogActorUser.mapping(bundle, `${keyPrefix}user`)),
            'service_account': utils.removeIfEmpty(AuditLogActorServiceAccount.mapping(bundle, `${keyPrefix}service_account`)),
        }
    },
}
