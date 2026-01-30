const utils = require('../utils/utils');
const AuditLogActor = require('../models/AuditLogActor');
const AuditLogEventType = require('../models/AuditLogEventType');
const AuditLog_api_key_created = require('../models/AuditLog_api_key_created');
const AuditLog_api_key_deleted = require('../models/AuditLog_api_key_deleted');
const AuditLog_api_key_updated = require('../models/AuditLog_api_key_updated');
const AuditLog_invite_accepted = require('../models/AuditLog_invite_accepted');
const AuditLog_invite_sent = require('../models/AuditLog_invite_sent');
const AuditLog_login_failed = require('../models/AuditLog_login_failed');
const AuditLog_organization_updated = require('../models/AuditLog_organization_updated');
const AuditLog_project = require('../models/AuditLog_project');
const AuditLog_project_archived = require('../models/AuditLog_project_archived');
const AuditLog_project_created = require('../models/AuditLog_project_created');
const AuditLog_project_updated = require('../models/AuditLog_project_updated');
const AuditLog_rate_limit_deleted = require('../models/AuditLog_rate_limit_deleted');
const AuditLog_rate_limit_updated = require('../models/AuditLog_rate_limit_updated');
const AuditLog_service_account_created = require('../models/AuditLog_service_account_created');
const AuditLog_service_account_deleted = require('../models/AuditLog_service_account_deleted');
const AuditLog_service_account_updated = require('../models/AuditLog_service_account_updated');
const AuditLog_user_added = require('../models/AuditLog_user_added');
const AuditLog_user_deleted = require('../models/AuditLog_user_deleted');
const AuditLog_user_updated = require('../models/AuditLog_user_updated');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of this log. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                ...AuditLogEventType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}effective_at`,
                label: `The Unix timestamp (in seconds) of the event. - [${labelPrefix}effective_at]`,
                required: true,
                type: 'integer',
            },
            ...AuditLog_project.fields(`${keyPrefix}project`, isInput),
            ...AuditLogActor.fields(`${keyPrefix}actor`, isInput),
            ...AuditLog_api_key_created.fields(`${keyPrefix}api_key.created`, isInput),
            ...AuditLog_api_key_updated.fields(`${keyPrefix}api_key.updated`, isInput),
            ...AuditLog_api_key_deleted.fields(`${keyPrefix}api_key.deleted`, isInput),
            ...AuditLog_invite_sent.fields(`${keyPrefix}invite.sent`, isInput),
            ...AuditLog_invite_accepted.fields(`${keyPrefix}invite.accepted`, isInput),
            ...AuditLog_invite_accepted.fields(`${keyPrefix}invite.deleted`, isInput),
            ...AuditLog_login_failed.fields(`${keyPrefix}login.failed`, isInput),
            ...AuditLog_login_failed.fields(`${keyPrefix}logout.failed`, isInput),
            ...AuditLog_organization_updated.fields(`${keyPrefix}organization.updated`, isInput),
            ...AuditLog_project_created.fields(`${keyPrefix}project.created`, isInput),
            ...AuditLog_project_updated.fields(`${keyPrefix}project.updated`, isInput),
            ...AuditLog_project_archived.fields(`${keyPrefix}project.archived`, isInput),
            ...AuditLog_rate_limit_updated.fields(`${keyPrefix}rate_limit.updated`, isInput),
            ...AuditLog_rate_limit_deleted.fields(`${keyPrefix}rate_limit.deleted`, isInput),
            ...AuditLog_service_account_created.fields(`${keyPrefix}service_account.created`, isInput),
            ...AuditLog_service_account_updated.fields(`${keyPrefix}service_account.updated`, isInput),
            ...AuditLog_service_account_deleted.fields(`${keyPrefix}service_account.deleted`, isInput),
            ...AuditLog_user_added.fields(`${keyPrefix}user.added`, isInput),
            ...AuditLog_user_updated.fields(`${keyPrefix}user.updated`, isInput),
            ...AuditLog_user_deleted.fields(`${keyPrefix}user.deleted`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'effective_at': bundle.inputData?.[`${keyPrefix}effective_at`],
            'project': utils.removeIfEmpty(AuditLog_project.mapping(bundle, `${keyPrefix}project`)),
            'actor': utils.removeIfEmpty(AuditLogActor.mapping(bundle, `${keyPrefix}actor`)),
            'api_key.created': utils.removeIfEmpty(AuditLog_api_key_created.mapping(bundle, `${keyPrefix}api_key.created`)),
            'api_key.updated': utils.removeIfEmpty(AuditLog_api_key_updated.mapping(bundle, `${keyPrefix}api_key.updated`)),
            'api_key.deleted': utils.removeIfEmpty(AuditLog_api_key_deleted.mapping(bundle, `${keyPrefix}api_key.deleted`)),
            'invite.sent': utils.removeIfEmpty(AuditLog_invite_sent.mapping(bundle, `${keyPrefix}invite.sent`)),
            'invite.accepted': utils.removeIfEmpty(AuditLog_invite_accepted.mapping(bundle, `${keyPrefix}invite.accepted`)),
            'invite.deleted': utils.removeIfEmpty(AuditLog_invite_accepted.mapping(bundle, `${keyPrefix}invite.deleted`)),
            'login.failed': utils.removeIfEmpty(AuditLog_login_failed.mapping(bundle, `${keyPrefix}login.failed`)),
            'logout.failed': utils.removeIfEmpty(AuditLog_login_failed.mapping(bundle, `${keyPrefix}logout.failed`)),
            'organization.updated': utils.removeIfEmpty(AuditLog_organization_updated.mapping(bundle, `${keyPrefix}organization.updated`)),
            'project.created': utils.removeIfEmpty(AuditLog_project_created.mapping(bundle, `${keyPrefix}project.created`)),
            'project.updated': utils.removeIfEmpty(AuditLog_project_updated.mapping(bundle, `${keyPrefix}project.updated`)),
            'project.archived': utils.removeIfEmpty(AuditLog_project_archived.mapping(bundle, `${keyPrefix}project.archived`)),
            'rate_limit.updated': utils.removeIfEmpty(AuditLog_rate_limit_updated.mapping(bundle, `${keyPrefix}rate_limit.updated`)),
            'rate_limit.deleted': utils.removeIfEmpty(AuditLog_rate_limit_deleted.mapping(bundle, `${keyPrefix}rate_limit.deleted`)),
            'service_account.created': utils.removeIfEmpty(AuditLog_service_account_created.mapping(bundle, `${keyPrefix}service_account.created`)),
            'service_account.updated': utils.removeIfEmpty(AuditLog_service_account_updated.mapping(bundle, `${keyPrefix}service_account.updated`)),
            'service_account.deleted': utils.removeIfEmpty(AuditLog_service_account_deleted.mapping(bundle, `${keyPrefix}service_account.deleted`)),
            'user.added': utils.removeIfEmpty(AuditLog_user_added.mapping(bundle, `${keyPrefix}user.added`)),
            'user.updated': utils.removeIfEmpty(AuditLog_user_updated.mapping(bundle, `${keyPrefix}user.updated`)),
            'user.deleted': utils.removeIfEmpty(AuditLog_user_deleted.mapping(bundle, `${keyPrefix}user.deleted`)),
        }
    },
}
