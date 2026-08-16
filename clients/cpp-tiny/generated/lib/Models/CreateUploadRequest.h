
/*
 * CreateUploadRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateUploadRequest_H_
#define TINY_CPP_CLIENT_CreateUploadRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateUploadRequest{
public:

    /*! \brief Constructor.
	 */
    CreateUploadRequest();
    CreateUploadRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateUploadRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string filename{};
    std::string purpose{};
    int bytes{};
    std::string mime_type{};
};
}

#endif /* TINY_CPP_CLIENT_CreateUploadRequest_H_ */
