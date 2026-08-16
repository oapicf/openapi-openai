
/*
 * ChatCompletionRequestMessageContentPartAudio.h
 *
 * Learn about [audio inputs](/docs/guides/audio). 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"

namespace Tiny {


/*! \brief Learn about [audio inputs](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartAudio{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestMessageContentPartAudio();
    ChatCompletionRequestMessageContentPartAudio(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestMessageContentPartAudio();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content part. Always `input_audio`.
	 */
	std::string getType();

	/*! \brief Set The type of the content part. Always `input_audio`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartAudio_input_audio getInputAudio();

	/*! \brief Set 
	 */
	void setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio);


    private:
    std::string type{};
    ChatCompletionRequestMessageContentPartAudio_input_audio input_audio;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartAudio_H_ */
