/*
 * CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */

#ifndef _CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_
#define _CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_


#include <string>
#include "Auto_Chunking_Strategy.h"
#include "Static_Chunking_Strategy.h"
#include "Static_Chunking_Strategy_static.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 *  \ingroup Models
 *
 */

class CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();
	CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `auto`.
	 */
	std::string getType();

	/*! \brief Set Always `auto`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	Static_Chunking_Strategy_static getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(Static_Chunking_Strategy_static  r_static);

private:
	std::string type;
	Static_Chunking_Strategy_static r_static;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_ */
