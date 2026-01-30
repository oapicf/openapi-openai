/*
 * ChatCompletionRequestUserMessageContentPart.h
 *
 * 
 */

#ifndef _ChatCompletionRequestUserMessageContentPart_H_
#define _ChatCompletionRequestUserMessageContentPart_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartAudio.h"
#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"
#include "ChatCompletionRequestMessageContentPartImage.h"
#include "ChatCompletionRequestMessageContentPartImage_image_url.h"
#include "ChatCompletionRequestMessageContentPartText.h"
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

class ChatCompletionRequestUserMessageContentPart : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestUserMessageContentPart();
	ChatCompletionRequestUserMessageContentPart(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestUserMessageContentPart();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	std::string text;
	ChatCompletionRequestMessageContentPartImage_image_url image_url;
	ChatCompletionRequestMessageContentPartAudio_input_audio input_audio;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestUserMessageContentPart_H_ */
