/*
 * ChatCompletionRequestMessageContentPartImage_image_url.h
 *
 * 
 */

#ifndef _ChatCompletionRequestMessageContentPartImage_image_url_H_
#define _ChatCompletionRequestMessageContentPartImage_image_url_H_


#include <string>
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

class ChatCompletionRequestMessageContentPartImage_image_url : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestMessageContentPartImage_image_url();
	ChatCompletionRequestMessageContentPartImage_image_url(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestMessageContentPartImage_image_url();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Either a URL of the image or the base64 encoded image data.
	 */
	std::string getUrl();

	/*! \brief Set Either a URL of the image or the base64 encoded image data.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
	 */
	void setDetail(std::string  detail);

private:
	std::string url;
	std::string detail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestMessageContentPartImage_image_url_H_ */
