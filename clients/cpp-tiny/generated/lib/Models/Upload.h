
/*
 * Upload.h
 *
 * The Upload object can accept byte chunks in the form of Parts. 
 */

#ifndef TINY_CPP_CLIENT_Upload_H_
#define TINY_CPP_CLIENT_Upload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OpenAIFile.h"

namespace Tiny {


/*! \brief The Upload object can accept byte chunks in the form of Parts. 
 *
 *  \ingroup Models
 *
 */

class Upload{
public:

    /*! \brief Constructor.
	 */
    Upload();
    Upload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Upload();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Upload unique identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The Upload unique identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the Upload was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the Upload was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The name of the file to be uploaded.
	 */
	std::string getFilename();

	/*! \brief Set The name of the file to be uploaded.
	 */
	void setFilename(std::string  filename);
	/*! \brief Get The intended number of bytes to be uploaded.
	 */
	int getBytes();

	/*! \brief Set The intended number of bytes to be uploaded.
	 */
	void setBytes(int  bytes);
	/*! \brief Get The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
	 */
	std::string getPurpose();

	/*! \brief Set The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
	 */
	void setPurpose(std::string  purpose);
	/*! \brief Get The status of the Upload.
	 */
	std::string getStatus();

	/*! \brief Set The status of the Upload.
	 */
	void setStatus(std::string  status);
	/*! \brief Get The Unix timestamp (in seconds) for when the Upload was created.
	 */
	int getExpiresAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the Upload was created.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get The object type, which is always \"upload\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"upload\".
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	OpenAIFile getFile();

	/*! \brief Set 
	 */
	void setFile(OpenAIFile  file);


    private:
    std::string id{};
    int created_at{};
    std::string filename{};
    int bytes{};
    std::string purpose{};
    std::string status{};
    int expires_at{};
    std::string object{};
    OpenAIFile file;
};
}

#endif /* TINY_CPP_CLIENT_Upload_H_ */
