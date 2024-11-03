/*
 * MessageDeltaContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef _MessageDeltaContentImageFileObject_H_
#define _MessageDeltaContentImageFileObject_H_


#include <string>
#include "MessageDeltaContentImageFileObject_image_file.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief References an image [File](/docs/api-reference/files) in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentImageFileObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentImageFileObject();
	MessageDeltaContentImageFileObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentImageFileObject();

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
	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageDeltaContentImageFileObject_image_file  image_file);

private:
	int index;
	std::string type;
	MessageDeltaContentImageFileObject_image_file image_file;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentImageFileObject_H_ */
