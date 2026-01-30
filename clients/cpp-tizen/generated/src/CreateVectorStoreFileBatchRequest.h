/*
 * CreateVectorStoreFileBatchRequest.h
 *
 * 
 */

#ifndef _CreateVectorStoreFileBatchRequest_H_
#define _CreateVectorStoreFileBatchRequest_H_


#include <string>
#include "ChunkingStrategyRequestParam.h"
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

class CreateVectorStoreFileBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateVectorStoreFileBatchRequest();
	CreateVectorStoreFileBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateVectorStoreFileBatchRequest();

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
	/*! \brief Get 
	 */
	ChunkingStrategyRequestParam getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy);

private:
	std::list <std::string>file_ids;
	ChunkingStrategyRequestParam chunking_strategy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateVectorStoreFileBatchRequest_H_ */
