/*
 * CreateUploadRequest.h
 *
 * 
 */

#ifndef _CreateUploadRequest_H_
#define _CreateUploadRequest_H_


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

class CreateUploadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateUploadRequest();
	CreateUploadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateUploadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the file to upload. 
	 */
	std::string getFilename();

	/*! \brief Set The name of the file to upload. 
	 */
	void setFilename(std::string  filename);
	/*! \brief Get The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
	 */
	std::string getPurpose();

	/*! \brief Set The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
	 */
	void setPurpose(std::string  purpose);
	/*! \brief Get The number of bytes in the file you are uploading. 
	 */
	int getBytes();

	/*! \brief Set The number of bytes in the file you are uploading. 
	 */
	void setBytes(int  bytes);
	/*! \brief Get The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
	 */
	std::string getMimeType();

	/*! \brief Set The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
	 */
	void setMimeType(std::string  mime_type);

private:
	std::string filename;
	std::string purpose;
	int bytes;
	std::string mime_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateUploadRequest_H_ */
