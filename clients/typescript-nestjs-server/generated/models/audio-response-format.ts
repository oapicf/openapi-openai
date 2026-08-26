

/**
 * The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 */
export const AudioResponseFormat = {
    Json: 'json',
    Text: 'text',
    Srt: 'srt',
    VerboseJson: 'verbose_json',
    Vtt: 'vtt'
} as const;
export type AudioResponseFormat = typeof AudioResponseFormat[keyof typeof AudioResponseFormat];

