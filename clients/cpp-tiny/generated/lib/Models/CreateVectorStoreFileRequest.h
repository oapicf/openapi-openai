
/*
 * CreateVectorStoreFileRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateVectorStoreFileRequest_H_
#define TINY_CPP_CLIENT_CreateVectorStoreFileRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChunkingStrategyRequestParam.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateVectorStoreFileRequest{
public:

    /*! \brief Constructor.
	 */
    CreateVectorStoreFileRequest();
    CreateVectorStoreFileRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateVectorStoreFileRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
	 */
	std::string getFileId();

	/*! \brief Set A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get 
	 */
	ChunkingStrategyRequestParam getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy);


    private:
    std::string file_id{};
    ChunkingStrategyRequestParam chunking_strategy;
};
}

#endif /* TINY_CPP_CLIENT_CreateVectorStoreFileRequest_H_ */
