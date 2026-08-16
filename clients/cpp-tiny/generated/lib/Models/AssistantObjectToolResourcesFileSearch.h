
/*
 * AssistantObject_tool_resources_file_search.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssistantObject_tool_resources_file_search_H_
#define TINY_CPP_CLIENT_AssistantObject_tool_resources_file_search_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssistantObject_tool_resources_file_search{
public:

    /*! \brief Constructor.
	 */
    AssistantObject_tool_resources_file_search();
    AssistantObject_tool_resources_file_search(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantObject_tool_resources_file_search();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	std::list<std::string> getVectorStoreIds();

	/*! \brief Set The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
	 */
	void setVectorStoreIds(std::list <std::string> vector_store_ids);


    private:
    std::list<std::string> vector_store_ids;
};
}

#endif /* TINY_CPP_CLIENT_AssistantObject_tool_resources_file_search_H_ */
