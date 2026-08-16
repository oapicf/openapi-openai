
/*
 * CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_H_
#define TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h"
#include "Object.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssistantRequest_tool_resources_file_search_vector_stores_inner{
public:

    /*! \brief Constructor.
	 */
    CreateAssistantRequest_tool_resources_file_search_vector_stores_inner();
    CreateAssistantRequest_tool_resources_file_search_vector_stores_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::list<std::string> file_ids;
    CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy chunking_strategy;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_H_ */
