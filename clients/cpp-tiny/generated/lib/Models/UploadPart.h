
/*
 * UploadPart.h
 *
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */

#ifndef TINY_CPP_CLIENT_UploadPart_H_
#define TINY_CPP_CLIENT_UploadPart_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The upload Part represents a chunk of bytes we can add to an Upload object. 
 *
 *  \ingroup Models
 *
 */

class UploadPart{
public:

    /*! \brief Constructor.
	 */
    UploadPart();
    UploadPart(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UploadPart();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The upload Part unique identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The upload Part unique identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) for when the Part was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the Part was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the Upload object that this Part was added to.
	 */
	std::string getUploadId();

	/*! \brief Set The ID of the Upload object that this Part was added to.
	 */
	void setUploadId(std::string  upload_id);
	/*! \brief Get The object type, which is always `upload.part`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `upload.part`.
	 */
	void setObject(std::string  object);


    private:
    std::string id{};
    int created_at{};
    std::string upload_id{};
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_UploadPart_H_ */
