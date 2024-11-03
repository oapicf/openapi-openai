/*
 * MessageContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef _MessageContentImageFileObject_image_file_H_
#define _MessageContentImageFileObject_image_file_H_


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

class MessageContentImageFileObject_image_file : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentImageFileObject_image_file();
	MessageContentImageFileObject_image_file(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentImageFileObject_image_file();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The [File](/docs/api-reference/files) ID of the image in the message content.
	 */
	std::string getFileId();

	/*! \brief Set The [File](/docs/api-reference/files) ID of the image in the message content.
	 */
	void setFileId(std::string  file_id);

private:
	std::string file_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentImageFileObject_image_file_H_ */
