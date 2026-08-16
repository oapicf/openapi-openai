
/*
 * ModifyThreadRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ModifyThreadRequest_H_
#define TINY_CPP_CLIENT_ModifyThreadRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ModifyThreadRequest_tool_resources.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ModifyThreadRequest{
public:

    /*! \brief Constructor.
	 */
    ModifyThreadRequest();
    ModifyThreadRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModifyThreadRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ModifyThreadRequest_tool_resources getToolResources();

	/*! \brief Set 
	 */
	void setToolResources(ModifyThreadRequest_tool_resources  tool_resources);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    ModifyThreadRequest_tool_resources tool_resources;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_ModifyThreadRequest_H_ */
