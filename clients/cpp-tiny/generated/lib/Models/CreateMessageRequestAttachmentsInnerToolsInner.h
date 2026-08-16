
/*
 * CreateMessageRequest_attachments_inner_tools_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_tools_inner_H_
#define TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_tools_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantToolsCode.h"
#include "AssistantToolsFileSearchTypeOnly.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateMessageRequest_attachments_inner_tools_inner{
public:

    /*! \brief Constructor.
	 */
    CreateMessageRequest_attachments_inner_tools_inner();
    CreateMessageRequest_attachments_inner_tools_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateMessageRequest_attachments_inner_tools_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of tool being defined: `code_interpreter`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `code_interpreter`
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_tools_inner_H_ */
