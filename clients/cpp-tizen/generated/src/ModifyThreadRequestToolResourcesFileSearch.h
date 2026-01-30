/*
 * ModifyThreadRequest_tool_resources_file_search.h
 *
 * 
 */

#ifndef _ModifyThreadRequest_tool_resources_file_search_H_
#define _ModifyThreadRequest_tool_resources_file_search_H_


#include <string>
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

class ModifyThreadRequest_tool_resources_file_search : public Object {
public:
	/*! \brief Constructor.
	 */
	ModifyThreadRequest_tool_resources_file_search();
	ModifyThreadRequest_tool_resources_file_search(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModifyThreadRequest_tool_resources_file_search();

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

private:
	std::list <std::string>vector_store_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModifyThreadRequest_tool_resources_file_search_H_ */
