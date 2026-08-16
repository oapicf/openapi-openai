
/*
 * UpdateVectorStoreRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateVectorStoreRequest_H_
#define TINY_CPP_CLIENT_UpdateVectorStoreRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"
#include "VectorStoreExpirationAfter.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateVectorStoreRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateVectorStoreRequest();
    UpdateVectorStoreRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateVectorStoreRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the vector store.
	 */
	std::string getName();

	/*! \brief Set The name of the vector store.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	VectorStoreExpirationAfter getExpiresAfter();

	/*! \brief Set 
	 */
	void setExpiresAfter(VectorStoreExpirationAfter  expires_after);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::string name{};
    VectorStoreExpirationAfter expires_after;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_UpdateVectorStoreRequest_H_ */
