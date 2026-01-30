/*
 * CreateMessageRequest_attachments_inner_tools_inner.h
 *
 * 
 */

#ifndef _CreateMessageRequest_attachments_inner_tools_inner_H_
#define _CreateMessageRequest_attachments_inner_tools_inner_H_


#include <string>
#include "AssistantToolsCode.h"
#include "AssistantToolsFileSearchTypeOnly.h"
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

class CreateMessageRequest_attachments_inner_tools_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMessageRequest_attachments_inner_tools_inner();
	CreateMessageRequest_attachments_inner_tools_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMessageRequest_attachments_inner_tools_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of tool being defined: `code_interpreter`
	 */
	std::string getType();

	/*! \brief Set The type of tool being defined: `code_interpreter`
	 */
	void setType(std::string  type);

private:
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMessageRequest_attachments_inner_tools_inner_H_ */
