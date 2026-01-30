/*
 * ChatCompletionRequestMessageContentPartImage.h
 *
 * Learn about [image inputs](/docs/guides/vision). 
 */

#ifndef _ChatCompletionRequestMessageContentPartImage_H_
#define _ChatCompletionRequestMessageContentPartImage_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartImage_image_url.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Learn about [image inputs](/docs/guides/vision). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartImage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPartImage();
	ChatCompletionRequestMessageContentPartImage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPartImage();

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
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartImage_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url);

private:
	std::string type;
	ChatCompletionRequestMessageContentPartImage_image_url image_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPartImage_H_ */
