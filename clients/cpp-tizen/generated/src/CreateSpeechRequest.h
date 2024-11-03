/*
 * CreateSpeechRequest.h
 *
 * 
 */

#ifndef _CreateSpeechRequest_H_
#define _CreateSpeechRequest_H_


#include <string>
#include "CreateSpeechRequest_model.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateSpeechRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateSpeechRequest();
	CreateSpeechRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateSpeechRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
	 */
	std::string getVoice();

	/*! \brief Set The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
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
	long long getSpeed();

	/*! \brief Set The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
	 */
	void setSpeed(long long  speed);

private:
	CreateSpeechRequest_model model;
	std::string input;
	std::string voice;
	std::string response_format;
	long long speed;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateSpeechRequest_H_ */
