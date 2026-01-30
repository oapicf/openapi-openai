const utils = require('../utils/utils');
const RealtimeConversationItem = require('../models/RealtimeConversationItem');
const RealtimeResponse_status_details = require('../models/RealtimeResponse_status_details');
const RealtimeResponse_usage = require('../models/RealtimeResponse_usage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The unique ID of the response. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, must be `realtime.response`. - [${labelPrefix}object]`,
                type: 'string',
                choices: [
                    'realtime.response',
                ],
            },
            {
                key: `${keyPrefix}status`,
                label: `The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`).  - [${labelPrefix}status]`,
                type: 'string',
                choices: [
                    'completed',
                    'cancelled',
                    'failed',
                    'incomplete',
                ],
            },
            ...RealtimeResponse_status_details.fields(`${keyPrefix}status_details`, isInput),
            {
                key: `${keyPrefix}output`,
                label: `[${labelPrefix}output]`,
                children: RealtimeConversationItem.fields(`${keyPrefix}output${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}metadata`,
                label: `Developer-provided string key-value pairs associated with this response.  - [${labelPrefix}metadata]`,
                dict: true,
            },
            ...RealtimeResponse_usage.fields(`${keyPrefix}usage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'status_details': utils.removeIfEmpty(RealtimeResponse_status_details.mapping(bundle, `${keyPrefix}status_details`)),
            'output': utils.childMapping(bundle.inputData?.[`${keyPrefix}output`], `${keyPrefix}output`, RealtimeConversationItem),
            'metadata': bundle.inputData?.[`${keyPrefix}metadata`],
            'usage': utils.removeIfEmpty(RealtimeResponse_usage.mapping(bundle, `${keyPrefix}usage`)),
        }
    },
}
