
/*
 * CreateVectorStoreFileBatchRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateVectorStoreFileBatchRequest_H_
#define TINY_CPP_CLIENT_CreateVectorStoreFileBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChunkingStrategyRequestParam.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateVectorStoreFileBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CreateVectorStoreFileBatchRequest();
    CreateVectorStoreFileBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateVectorStoreFileBatchRequest();


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
	/*! \brief Get 
	 */
	ChunkingStrategyRequestParam getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy);


    private:
    std::list<std::string> file_ids;
    ChunkingStrategyRequestParam chunking_strategy;
};
}

#endif /* TINY_CPP_CLIENT_CreateVectorStoreFileBatchRequest_H_ */
