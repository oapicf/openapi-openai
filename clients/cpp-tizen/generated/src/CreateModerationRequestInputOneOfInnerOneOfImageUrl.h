/*
 * CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h
 *
 * Contains either an image URL or a data URL for a base64 encoded image.
 */

#ifndef _CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_
#define _CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains either an image URL or a data URL for a base64 encoded image.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf_image_url : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
	CreateModerationRequest_input_oneOf_inner_oneOf_image_url(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest_input_oneOf_inner_oneOf_image_url();

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

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_ */
