/*
 * CreateChatCompletionRequest_audio.h
 *
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
 */

#ifndef _CreateChatCompletionRequest_audio_H_
#define _CreateChatCompletionRequest_audio_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_audio : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest_audio();
	CreateChatCompletionRequest_audio(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest_audio();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
	 */
	std::string getVoice();

	/*! \brief Set The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
	 */
	void setVoice(std::string  voice);
	/*! \brief Get Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
	 */
	std::string getFormat();

	/*! \brief Set Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
	 */
	void setFormat(std::string  format);

private:
	std::string voice;
	std::string format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionRequest_audio_H_ */
