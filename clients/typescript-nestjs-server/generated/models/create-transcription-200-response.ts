import { CreateTranscriptionResponseJson } from './create-transcription-response-json';
import { TranscriptionSegment } from './transcription-segment';
import { TranscriptionWord } from './transcription-word';
import { CreateTranscriptionResponseVerboseJson } from './create-transcription-response-verbose-json';


/**
 * @type CreateTranscription200Response
 * @export
 */
export type CreateTranscription200Response = CreateTranscriptionResponseJson | CreateTranscriptionResponseVerboseJson;

