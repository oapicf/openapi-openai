#ifndef _AudioManager_H_
#define _AudioManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateSpeechRequest.h"
#include "CreateTranscriptionRequest_model.h"
#include "CreateTranscription_200_response.h"
#include "CreateTranslation_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Audio Audio
 * \ingroup Operations
 *  @{
 */
class AudioManager {
public:
	AudioManager();
	virtual ~AudioManager();

/*! \brief Generates audio from the input text.. *Synchronous*
 *
 * 
 * \param createSpeechRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createSpeechSync(char * accessToken,
	std::shared_ptr<CreateSpeechRequest> createSpeechRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Generates audio from the input text.. *Asynchronous*
 *
 * 
 * \param createSpeechRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createSpeechAsync(char * accessToken,
	std::shared_ptr<CreateSpeechRequest> createSpeechRequest, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Transcribes audio into the input language.. *Synchronous*
 *
 * 
 * \param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
 * \param model  *Required*
 * \param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
 * \param responseFormat The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param timestampGranularitiesLeft_Square_BracketRight_Square_Bracket The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranscriptionSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string language, std::string prompt, std::string responseFormat, long long temperature, std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(CreateTranscription_200_response, Error, void* )
	, void* userData);

/*! \brief Transcribes audio into the input language.. *Asynchronous*
 *
 * 
 * \param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
 * \param model  *Required*
 * \param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
 * \param responseFormat The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param timestampGranularitiesLeft_Square_BracketRight_Square_Bracket The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranscriptionAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string language, std::string prompt, std::string responseFormat, long long temperature, std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(CreateTranscription_200_response, Error, void* )
	, void* userData);


/*! \brief Translates audio into English.. *Synchronous*
 *
 * 
 * \param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
 * \param responseFormat The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranslationSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslation_200_response, Error, void* )
	, void* userData);

/*! \brief Translates audio into English.. *Asynchronous*
 *
 * 
 * \param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
 * \param model  *Required*
 * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
 * \param responseFormat The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTranslationAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslation_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* AudioManager_H_ */
