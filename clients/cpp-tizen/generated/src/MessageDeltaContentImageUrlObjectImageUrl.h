/*
 * MessageDeltaContentImageUrlObject_image_url.h
 *
 * 
 */

#ifndef _MessageDeltaContentImageUrlObject_image_url_H_
#define _MessageDeltaContentImageUrlObject_image_url_H_


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

class MessageDeltaContentImageUrlObject_image_url : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentImageUrlObject_image_url();
	MessageDeltaContentImageUrlObject_image_url(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentImageUrlObject_image_url();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
	 */
	std::string getUrl();

	/*! \brief Set The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
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

#endif /* _MessageDeltaContentImageUrlObject_image_url_H_ */
