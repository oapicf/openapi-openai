import { UsageAudioTranscriptionsResult } from './usage-audio-transcriptions-result';
import { UsageAudioSpeechesResult } from './usage-audio-speeches-result';
import { UsageModerationsResult } from './usage-moderations-result';
import { UsageVectorStoresResult } from './usage-vector-stores-result';
import { UsageEmbeddingsResult } from './usage-embeddings-result';
import { CostsResult } from './costs-result';
import { CostsResultAmount } from './costs-result-amount';
import { UsageCompletionsResult } from './usage-completions-result';
import { UsageCodeInterpreterSessionsResult } from './usage-code-interpreter-sessions-result';
import { UsageImagesResult } from './usage-images-result';


/**
 * @type UsageTimeBucketResultInner
 * @export
 */
export type UsageTimeBucketResultInner = CostsResult | UsageAudioSpeechesResult | UsageAudioTranscriptionsResult | UsageCodeInterpreterSessionsResult | UsageCompletionsResult | UsageEmbeddingsResult | UsageImagesResult | UsageModerationsResult | UsageVectorStoresResult;

