/*
 * ChatCompletionRequestMessageContentPart.h
 *
 * 
 */

#ifndef _ChatCompletionRequestMessageContentPart_H_
#define _ChatCompletionRequestMessageContentPart_H_


#include <string>
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

class ChatCompletionRequestMessageContentPart : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPart();
	ChatCompletionRequestMessageContentPart(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPart();

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

private:
	std::string type;
	std::string text;
	ChatCompletionRequestMessageContentPartImage_image_url image_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPart_H_ */
