
/*
 * ChatCompletionRequestAssistantMessage_audio.h
 *
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_audio_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_audio_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestAssistantMessage_audio{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestAssistantMessage_audio();
    ChatCompletionRequestAssistantMessage_audio(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestAssistantMessage_audio();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier for a previous audio response from the model. 
	 */
	std::string getId();

	/*! \brief Set Unique identifier for a previous audio response from the model. 
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_audio_H_ */
