/*
 * ModifyThreadRequest.h
 *
 * 
 */

#ifndef _ModifyThreadRequest_H_
#define _ModifyThreadRequest_H_


#include <string>
#include "ModifyThreadRequest_tool_resources.h"
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

class ModifyThreadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ModifyThreadRequest();
	ModifyThreadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModifyThreadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ModifyThreadRequest_tool_resources getToolResources();

	/*! \brief Set 
	 */
	void setToolResources(ModifyThreadRequest_tool_resources  tool_resources);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	ModifyThreadRequest_tool_resources tool_resources;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModifyThreadRequest_H_ */
