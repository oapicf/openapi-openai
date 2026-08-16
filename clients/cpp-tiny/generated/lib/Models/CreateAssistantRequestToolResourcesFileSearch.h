
/*
 * CreateAssistantRequest_tool_resources_file_search.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_H_
#define TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateAssistantRequest_tool_resources_file_search{
public:

    /*! \brief Constructor.
	 */
    CreateAssistantRequest_tool_resources_file_search();
    CreateAssistantRequest_tool_resources_file_search(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssistantRequest_tool_resources_file_search();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	std::list<std::string> getVectorStoreIds();

	/*! \brief Set The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	void setVectorStoreIds(std::list <std::string> vector_store_ids);
	/*! \brief Get A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	std::list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> getVectorStores();

	/*! \brief Set A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	void setVectorStores(std::list <CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> vector_stores);


    private:
    std::list<std::string> vector_store_ids;
    std::list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> vector_stores;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_H_ */
