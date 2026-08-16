
/*
 * CreateChatCompletionRequest_audio.h
 *
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
 */

#ifndef TINY_CPP_CLIENT_CreateChatCompletionRequest_audio_H_
#define TINY_CPP_CLIENT_CreateChatCompletionRequest_audio_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_audio{
public:

    /*! \brief Constructor.
	 */
    CreateChatCompletionRequest_audio();
    CreateChatCompletionRequest_audio(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatCompletionRequest_audio();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string voice{};
    std::string format{};
};
}

#endif /* TINY_CPP_CLIENT_CreateChatCompletionRequest_audio_H_ */
