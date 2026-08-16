
/*
 * CreateSpeechRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateSpeechRequest_H_
#define TINY_CPP_CLIENT_CreateSpeechRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateSpeechRequest_model.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateSpeechRequest{
public:

    /*! \brief Constructor.
	 */
    CreateSpeechRequest();
    CreateSpeechRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateSpeechRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CreateSpeechRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateSpeechRequest_model  model);
	/*! \brief Get The text to generate audio for. The maximum length is 4096 characters.
	 */
	std::string getInput();

	/*! \brief Set The text to generate audio for. The maximum length is 4096 characters.
	 */
	void setInput(std::string  input);
	/*! \brief Get The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
	 */
	std::string getVoice();

	/*! \brief Set The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
	 */
	void setVoice(std::string  voice);
	/*! \brief Get The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
	 */
	std::string getResponseFormat();

	/*! \brief Set The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
	 */
	void setResponseFormat(std::string  response_format);
	/*! \brief Get The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
	 */
	long getSpeed();

	/*! \brief Set The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
	 */
	void setSpeed(long  speed);


    private:
    CreateSpeechRequest_model model;
    std::string input{};
    std::string voice{};
    std::string response_format{};
    long speed{};
};
}

#endif /* TINY_CPP_CLIENT_CreateSpeechRequest_H_ */
