
/*
 * CreateVectorStoreRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateVectorStoreRequest_H_
#define TINY_CPP_CLIENT_CreateVectorStoreRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateVectorStoreRequest_chunking_strategy.h"
#include "Object.h"
#include "VectorStoreExpirationAfter.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateVectorStoreRequest{
public:

    /*! \brief Constructor.
	 */
    CreateVectorStoreRequest();
    CreateVectorStoreRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateVectorStoreRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::list<std::string> file_ids;
    std::string name{};
    VectorStoreExpirationAfter expires_after;
    CreateVectorStoreRequest_chunking_strategy chunking_strategy;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_CreateVectorStoreRequest_H_ */
