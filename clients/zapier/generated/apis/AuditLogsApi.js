const samples = require('../samples/AuditLogsApi');
const AuditLogEventType = require('../models/AuditLogEventType');
const ListAuditLogsResponse = require('../models/ListAuditLogsResponse');
const list_audit_logs_effective_at_parameter = require('../models/list_audit_logs_effective_at_parameter');
const utils = require('../utils/utils');

module.exports = {
    listAuditLogs: {
        key: 'listAuditLogs',
        noun: 'Audit Logs',
        display: {
            label: 'List user actions and configuration changes within this organization.',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                ....fields(),
                {
                    key: 'project_ids[]',
                    label: 'Return only events for these projects.',
                    type: 'string',
                }
                {
                    key: 'event_types[]',
                    label: 'Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).',
                    type: 'string',
                }
                {
                    key: 'actor_ids[]',
                    label: 'Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.',
                    type: 'string',
                }
                {
                    key: 'actor_emails[]',
                    label: 'Return only events performed by users with these emails.',
                    type: 'string',
                }
                {
                    key: 'resource_ids[]',
                    label: 'Return only events performed on these targets. For example, a project ID updated.',
                    type: 'string',
                }
                {
                    key: 'limit',
                    label: 'A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ',
                    type: 'integer',
                },
                {
                    key: 'after',
                    label: 'A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ',
                    type: 'string',
                },
                {
                    key: 'before',
                    label: 'A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...ListAuditLogsResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.openai.com/v1/organization/audit_logs'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'effective_at': bundle.inputData?.['effective_at'],
                        'project_ids[]': bundle.inputData?.['project_ids[]'],
                        'event_types[]': bundle.inputData?.['event_types[]'],
                        'actor_ids[]': bundle.inputData?.['actor_ids[]'],
                        'actor_emails[]': bundle.inputData?.['actor_emails[]'],
                        'resource_ids[]': bundle.inputData?.['resource_ids[]'],
                        'limit': bundle.inputData?.['limit'],
                        'after': bundle.inputData?.['after'],
                        'before': bundle.inputData?.['before'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'listAuditLogs', response.json);
                    return results;
                })
            },
            sample: samples['ListAuditLogsResponseSample']
        }
    },
}
