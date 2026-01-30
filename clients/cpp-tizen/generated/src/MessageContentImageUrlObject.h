/*
 * MessageContentImageUrlObject.h
 *
 * References an image URL in the content of a message.
 */

#ifndef _MessageContentImageUrlObject_H_
#define _MessageContentImageUrlObject_H_


#include <string>
#include "MessageContentImageUrlObject_image_url.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief References an image URL in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageContentImageUrlObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentImageUrlObject();
	MessageContentImageUrlObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentImageUrlObject();

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
	MessageContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageContentImageUrlObject_image_url  image_url);

private:
	std::string type;
	MessageContentImageUrlObject_image_url image_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentImageUrlObject_H_ */
