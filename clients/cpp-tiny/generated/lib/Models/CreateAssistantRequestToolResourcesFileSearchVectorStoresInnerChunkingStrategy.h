
/*
 * CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h
 *
 * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
 */

#ifndef TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_
#define TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Auto_Chunking_Strategy.h"
#include "Static_Chunking_Strategy.h"
#include "Static_Chunking_Strategy_static.h"

namespace Tiny {


/*! \brief The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 *  \ingroup Models
 *
 */

class CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy{
public:

    /*! \brief Constructor.
	 */
    CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();
    CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    Static_Chunking_Strategy_static r_static;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy_H_ */
