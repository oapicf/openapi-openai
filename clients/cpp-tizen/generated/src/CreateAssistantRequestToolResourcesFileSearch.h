/*
 * CreateAssistantRequest_tool_resources_file_search.h
 *
 * 
 */

#ifndef _CreateAssistantRequest_tool_resources_file_search_H_
#define _CreateAssistantRequest_tool_resources_file_search_H_


#include <string>
#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.h"
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

class CreateAssistantRequest_tool_resources_file_search : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssistantRequest_tool_resources_file_search();
	CreateAssistantRequest_tool_resources_file_search(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssistantRequest_tool_resources_file_search();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <std::string>vector_store_ids;
	std::list <CreateAssistantRequest_tool_resources_file_search_vector_stores_inner>vector_stores;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssistantRequest_tool_resources_file_search_H_ */
