/*
 * CreateVectorStoreFileRequest.h
 *
 * 
 */

#ifndef _CreateVectorStoreFileRequest_H_
#define _CreateVectorStoreFileRequest_H_


#include <string>
#include "ChunkingStrategyRequestParam.h"
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

class CreateVectorStoreFileRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateVectorStoreFileRequest();
	CreateVectorStoreFileRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateVectorStoreFileRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string file_id;
	ChunkingStrategyRequestParam chunking_strategy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateVectorStoreFileRequest_H_ */
