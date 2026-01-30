const utils = require('../utils/utils');
const RealtimeResponse_status_details_error = require('../models/RealtimeResponse_status_details_error');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`).  - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'completed',
                    'cancelled',
                    'failed',
                    'incomplete',
                ],
            },
            {
                key: `${keyPrefix}reason`,
                label: `The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response).  - [${labelPrefix}reason]`,
                type: 'string',
                choices: [
                    'turn_detected',
                    'client_cancelled',
                    'max_output_tokens',
                    'content_filter',
                ],
            },
            ...RealtimeResponse_status_details_error.fields(`${keyPrefix}error`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
            'error': utils.removeIfEmpty(RealtimeResponse_status_details_error.mapping(bundle, `${keyPrefix}error`)),
        }
    },
}
