const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The event type. - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'api_key.created',
                    'api_key.updated',
                    'api_key.deleted',
                    'invite.sent',
                    'invite.accepted',
                    'invite.deleted',
                    'login.succeeded',
                    'login.failed',
                    'logout.succeeded',
                    'logout.failed',
                    'organization.updated',
                    'project.created',
                    'project.updated',
                    'project.archived',
                    'service_account.created',
                    'service_account.updated',
                    'service_account.deleted',
                    'rate_limit.updated',
                    'rate_limit.deleted',
                    'user.added',
                    'user.updated',
                    'user.deleted',
                ],
            }
        )
    }
