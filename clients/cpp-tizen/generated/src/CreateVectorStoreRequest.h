/*
 * CreateVectorStoreRequest.h
 *
 * 
 */

#ifndef _CreateVectorStoreRequest_H_
#define _CreateVectorStoreRequest_H_


#include <string>
#include "CreateVectorStoreRequest_chunking_strategy.h"
#include "VectorStoreExpirationAfter.h"
#include <list>
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

class CreateVectorStoreRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateVectorStoreRequest();
	CreateVectorStoreRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateVectorStoreRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
	 */
	void setFileIds(std::list <std::string> file_ids);
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
	/*! \brief Get 
	 */
	CreateVectorStoreRequest_chunking_strategy getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(CreateVectorStoreRequest_chunking_strategy  chunking_strategy);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::list <std::string>file_ids;
	std::string name;
	VectorStoreExpirationAfter expires_after;
	CreateVectorStoreRequest_chunking_strategy chunking_strategy;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateVectorStoreRequest_H_ */
