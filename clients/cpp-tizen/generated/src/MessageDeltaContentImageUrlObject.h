/*
 * MessageDeltaContentImageUrlObject.h
 *
 * References an image URL in the content of a message.
 */

#ifndef _MessageDeltaContentImageUrlObject_H_
#define _MessageDeltaContentImageUrlObject_H_


#include <string>
#include "MessageDeltaContentImageUrlObject_image_url.h"
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

class MessageDeltaContentImageUrlObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentImageUrlObject();
	MessageDeltaContentImageUrlObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentImageUrlObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the content part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the content part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `image_url`.
	 */
	std::string getType();

	/*! \brief Set Always `image_url`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url);

private:
	int index;
	std::string type;
	MessageDeltaContentImageUrlObject_image_url image_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentImageUrlObject_H_ */
