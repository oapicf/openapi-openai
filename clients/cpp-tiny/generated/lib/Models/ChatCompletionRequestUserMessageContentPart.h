
/*
 * ChatCompletionRequestUserMessageContentPart.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestUserMessageContentPart_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestUserMessageContentPart_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestMessageContentPartAudio.h"
#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"
#include "ChatCompletionRequestMessageContentPartImage.h"
#include "ChatCompletionRequestMessageContentPartImage_image_url.h"
#include "ChatCompletionRequestMessageContentPartText.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestUserMessageContentPart{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestUserMessageContentPart();
    ChatCompletionRequestUserMessageContentPart(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestUserMessageContentPart();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content part.
	 */
	std::string getType();

	/*! \brief Set The type of the content part.
	 */
	void setType(std::string  type);
	/*! \brief Get The text content.
	 */
	std::string getText();

	/*! \brief Set The text content.
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartImage_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartAudio_input_audio getInputAudio();

	/*! \brief Set 
	 */
	void setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio);


    private:
    std::string type{};
    std::string text{};
    ChatCompletionRequestMessageContentPartImage_image_url image_url;
    ChatCompletionRequestMessageContentPartAudio_input_audio input_audio;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestUserMessageContentPart_H_ */
