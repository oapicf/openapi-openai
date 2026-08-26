import { TranscriptionSegment } from './transcription-segment';
import { CreateTranslationResponseJson } from './create-translation-response-json';
import { CreateTranslationResponseVerboseJson } from './create-translation-response-verbose-json';


/**
 * @type CreateTranslation200Response
 * @export
 */
export type CreateTranslation200Response = CreateTranslationResponseJson | CreateTranslationResponseVerboseJson;

