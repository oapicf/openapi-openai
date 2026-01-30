const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'json',
                    'text',
                    'srt',
                    'verbose_json',
                    'vtt',
                ],
            }
        )
    }
