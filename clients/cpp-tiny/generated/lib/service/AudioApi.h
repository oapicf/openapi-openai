#ifndef TINY_CPP_CLIENT_AudioApi_H_
#define TINY_CPP_CLIENT_AudioApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AudioResponseFormat.h"
#include "CreateSpeechRequest.h"
#include "CreateTranscriptionRequest_model.h"
#include "CreateTranscription_200_response.h"
#include "CreateTranslation_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudioApi : public Service {
public:
    AudioApi() = default;

    virtual ~AudioApi() = default;

    /**
    * Generates audio from the input text..
    *
    * 
    * \param createSpeechRequest  *Required*
    */
    Response<
                std::string
        >
    createSpeech(
            
            CreateSpeechRequest createSpeechRequest
            
    );
    /**
    * Transcribes audio into the input language..
    *
    * 
    * \param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
    * \param model  *Required*
    * \param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
    * \param responseFormat 
    * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    * \param timestampGranularitiesLeft_Square_BracketRight_Square_Bracket The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
    */
    Response<
                CreateTranscription_200_response
        >
    createTranscription(
            
            std::string file
            , 
            
            CreateTranscriptionRequest_model model
            , 
            
            std::string language
            , 
            
            std::string prompt
            , 
            
            AudioResponseFormat responseFormat
            , 
            
            long temperature
            , 
            std::list<std::string> timestampGranularitiesLeft_Square_BracketRight_Square_Bracket
            
            
    );
    /**
    * Translates audio into English..
    *
    * 
    * \param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  *Required*
    * \param model  *Required*
    * \param prompt An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
    * \param responseFormat 
    * \param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    */
    Response<
                CreateTranslation_200_response
        >
    createTranslation(
            
            std::string file
            , 
            
            CreateTranscriptionRequest_model model
            , 
            
            std::string prompt
            , 
            
            AudioResponseFormat responseFormat
            , 
            
            long temperature
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudioApi_H_ */