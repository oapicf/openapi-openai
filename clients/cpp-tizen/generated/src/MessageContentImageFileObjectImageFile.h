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

	/*! \brief Get The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
	 */
	std::string getFileId();

	/*! \brief Set The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	 */
	void setDetail(std::string  detail);

private:
	std::string file_id;
	std::string detail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentImageFileObject_image_file_H_ */
