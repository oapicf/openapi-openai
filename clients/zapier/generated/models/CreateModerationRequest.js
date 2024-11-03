const utils = require('../utils/utils');
const CreateModerationRequest_input = require('../models/CreateModerationRequest_input');
const CreateModerationRequest_model = require('../models/CreateModerationRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateModerationRequest_input.fields(`${keyPrefix}input`, isInput),
            ...CreateModerationRequest_model.fields(`${keyPrefix}model`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input': utils.removeIfEmpty(CreateModerationRequest_input.mapping(bundle, `${keyPrefix}input`)),
            'model': utils.removeIfEmpty(CreateModerationRequest_model.mapping(bundle, `${keyPrefix}model`)),
        }
    },
}
