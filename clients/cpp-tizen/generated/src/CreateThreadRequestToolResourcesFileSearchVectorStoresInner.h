/*
 * CreateThreadRequest_tool_resources_file_search_vector_stores_inner.h
 *
 * 
 */

#ifndef _CreateThreadRequest_tool_resources_file_search_vector_stores_inner_H_
#define _CreateThreadRequest_tool_resources_file_search_vector_stores_inner_H_


#include <string>
#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h"
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

class CreateThreadRequest_tool_resources_file_search_vector_stores_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateThreadRequest_tool_resources_file_search_vector_stores_inner();
	CreateThreadRequest_tool_resources_file_search_vector_stores_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateThreadRequest_tool_resources_file_search_vector_stores_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
	 */
	void setFileIds(std::list <std::string> file_ids);
	/*! \brief Get 
	 */
	CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy  chunking_strategy);
	/*! \brief Get Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::list <std::string>file_ids;
	CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy chunking_strategy;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateThreadRequest_tool_resources_file_search_vector_stores_inner_H_ */
