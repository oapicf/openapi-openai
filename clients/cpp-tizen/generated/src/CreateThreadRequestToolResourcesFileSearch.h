/*
 * CreateThreadRequest_tool_resources_file_search.h
 *
 * 
 */

#ifndef _CreateThreadRequest_tool_resources_file_search_H_
#define _CreateThreadRequest_tool_resources_file_search_H_


#include <string>
#include "CreateThreadRequest_tool_resources_file_search_vector_stores_inner.h"
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

class CreateThreadRequest_tool_resources_file_search : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateThreadRequest_tool_resources_file_search();
	CreateThreadRequest_tool_resources_file_search(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateThreadRequest_tool_resources_file_search();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
	 */
	std::list<std::string> getVectorStoreIds();

	/*! \brief Set The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
	 */
	void setVectorStoreIds(std::list <std::string> vector_store_ids);
	/*! \brief Get A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
	 */
	std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner> getVectorStores();

	/*! \brief Set A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
	 */
	void setVectorStores(std::list <CreateThreadRequest_tool_resources_file_search_vector_stores_inner> vector_stores);

private:
	std::list <std::string>vector_store_ids;
	std::list <CreateThreadRequest_tool_resources_file_search_vector_stores_inner>vector_stores;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateThreadRequest_tool_resources_file_search_H_ */
