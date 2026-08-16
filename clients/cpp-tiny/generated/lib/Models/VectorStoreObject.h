
/*
 * VectorStoreObject.h
 *
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */

#ifndef TINY_CPP_CLIENT_VectorStoreObject_H_
#define TINY_CPP_CLIENT_VectorStoreObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"
#include "VectorStoreExpirationAfter.h"
#include "VectorStoreObject_file_counts.h"

namespace Tiny {


/*! \brief A vector store is a collection of processed files can be used by the `file_search` tool.
 *
 *  \ingroup Models
 *
 */

class VectorStoreObject{
public:

    /*! \brief Constructor.
	 */
    VectorStoreObject();
    VectorStoreObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `vector_store`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `vector_store`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the vector store was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the vector store was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The name of the vector store.
	 */
	std::string getName();

	/*! \brief Set The name of the vector store.
	 */
	void setName(std::string  name);
	/*! \brief Get The total number of bytes used by the files in the vector store.
	 */
	int getUsageBytes();

	/*! \brief Set The total number of bytes used by the files in the vector store.
	 */
	void setUsageBytes(int  usage_bytes);
	/*! \brief Get 
	 */
	VectorStoreObject_file_counts getFileCounts();

	/*! \brief Set 
	 */
	void setFileCounts(VectorStoreObject_file_counts  file_counts);
	/*! \brief Get The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
	 */
	std::string getStatus();

	/*! \brief Set The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	VectorStoreExpirationAfter getExpiresAfter();

	/*! \brief Set 
	 */
	void setExpiresAfter(VectorStoreExpirationAfter  expires_after);
	/*! \brief Get The Unix timestamp (in seconds) for when the vector store will expire.
	 */
	int getExpiresAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the vector store will expire.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the vector store was last active.
	 */
	int getLastActiveAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the vector store was last active.
	 */
	void setLastActiveAt(int  last_active_at);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::string id{};
    std::string object{};
    int created_at{};
    std::string name{};
    int usage_bytes{};
    VectorStoreObject_file_counts file_counts;
    std::string status{};
    VectorStoreExpirationAfter expires_after;
    int expires_at{};
    int last_active_at{};
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreObject_H_ */
