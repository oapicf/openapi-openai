/*
 * UploadPart.h
 *
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */

#ifndef _UploadPart_H_
#define _UploadPart_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The upload Part represents a chunk of bytes we can add to an Upload object. 
 *
 *  \ingroup Models
 *
 */

class UploadPart : public Object {
public:
	/*! \brief Constructor.
	 */
	UploadPart();
	UploadPart(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UploadPart();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	int created_at;
	std::string upload_id;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UploadPart_H_ */
