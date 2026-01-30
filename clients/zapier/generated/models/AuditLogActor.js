const utils = require('../utils/utils');
const AuditLogActorApiKey = require('../models/AuditLogActorApiKey');
const AuditLogActorSession = require('../models/AuditLogActorSession');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of actor. Is either `session` or `api_key`. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'session',
                    'api_key',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'session': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}session`)),
            'api_key': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}api_key`)),
        }
    },
}
