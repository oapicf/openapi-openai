const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}step`,
                label: `[${labelPrefix}step]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}train_loss`,
                label: `[${labelPrefix}train_loss]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}train_mean_token_accuracy`,
                label: `[${labelPrefix}train_mean_token_accuracy]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}valid_loss`,
                label: `[${labelPrefix}valid_loss]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}valid_mean_token_accuracy`,
                label: `[${labelPrefix}valid_mean_token_accuracy]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}full_valid_loss`,
                label: `[${labelPrefix}full_valid_loss]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}full_valid_mean_token_accuracy`,
                label: `[${labelPrefix}full_valid_mean_token_accuracy]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'step': bundle.inputData?.[`${keyPrefix}step`],
            'train_loss': bundle.inputData?.[`${keyPrefix}train_loss`],
            'train_mean_token_accuracy': bundle.inputData?.[`${keyPrefix}train_mean_token_accuracy`],
            'valid_loss': bundle.inputData?.[`${keyPrefix}valid_loss`],
            'valid_mean_token_accuracy': bundle.inputData?.[`${keyPrefix}valid_mean_token_accuracy`],
            'full_valid_loss': bundle.inputData?.[`${keyPrefix}full_valid_loss`],
            'full_valid_mean_token_accuracy': bundle.inputData?.[`${keyPrefix}full_valid_mean_token_accuracy`],
        }
    },
}
