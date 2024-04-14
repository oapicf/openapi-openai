/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Generates audio from the input text.
*
* createSpeechRequest CreateSpeechRequest 
* returns File
* */
const createSpeech = ({ createSpeechRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createSpeechRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Transcribes audio into the input language.
*
* file File The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
* model CreateTranscriptionRequest_model 
* language String The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
* prompt String An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
* responseUnderscoreformat String The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
* temperature BigDecimal The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
* timestampUnderscoregranularitiesLeft_Square_BracketRight_Square_Bracket List The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
* returns createTranscription_200_response
* */
const createTranscription = ({ file, model, language, prompt, responseUnderscoreformat, temperature, timestampUnderscoregranularitiesLeft_Square_BracketRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        model,
        language,
        prompt,
        responseUnderscoreformat,
        temperature,
        timestampUnderscoregranularitiesLeft_Square_BracketRight_Square_Bracket,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Translates audio into English.
*
* file File The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
* model CreateTranscriptionRequest_model 
* prompt String An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
* responseUnderscoreformat String The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
* temperature BigDecimal The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
* returns createTranslation_200_response
* */
const createTranslation = ({ file, model, prompt, responseUnderscoreformat, temperature }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        file,
        model,
        prompt,
        responseUnderscoreformat,
        temperature,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  createSpeech,
  createTranscription,
  createTranslation,
};
