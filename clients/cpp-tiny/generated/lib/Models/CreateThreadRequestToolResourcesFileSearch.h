
/*
 * CreateThreadRequest_tool_resources_file_search.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateThreadRequest_tool_resources_file_search_H_
#define TINY_CPP_CLIENT_CreateThreadRequest_tool_resources_file_search_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateThreadRequest_tool_resources_file_search_vector_stores_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateThreadRequest_tool_resources_file_search{
public:

    /*! \brief Constructor.
	 */
    CreateThreadRequest_tool_resources_file_search();
    CreateThreadRequest_tool_resources_file_search(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateThreadRequest_tool_resources_file_search();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<std::string> vector_store_ids;
    std::list<CreateThreadRequest_tool_resources_file_search_vector_stores_inner> vector_stores;
};
}

#endif /* TINY_CPP_CLIENT_CreateThreadRequest_tool_resources_file_search_H_ */
