/*
 * MessageContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef _MessageContentImageFileObject_H_
#define _MessageContentImageFileObject_H_


#include <string>
#include "MessageContentImageFileObject_image_file.h"
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

class MessageContentImageFileObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentImageFileObject();
	MessageContentImageFileObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentImageFileObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageContentImageFileObject_image_file  image_file);

private:
	std::string type;
	MessageContentImageFileObject_image_file image_file;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentImageFileObject_H_ */
