/*
 * UpdateVectorStoreRequest.h
 *
 * 
 */

#ifndef _UpdateVectorStoreRequest_H_
#define _UpdateVectorStoreRequest_H_


#include <string>
#include "VectorStoreExpirationAfter.h"
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

class UpdateVectorStoreRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateVectorStoreRequest();
	UpdateVectorStoreRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateVectorStoreRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the vector store.
	 */
	std::string getName();

	/*! \brief Set The name of the vector store.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	VectorStoreExpirationAfter getExpiresAfter();

	/*! \brief Set 
	 */
	void setExpiresAfter(VectorStoreExpirationAfter  expires_after);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::string name;
	VectorStoreExpirationAfter expires_after;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateVectorStoreRequest_H_ */
