
/*
 * VectorStoreFileObject.h
 *
 * A list of files attached to a vector store.
 */

#ifndef TINY_CPP_CLIENT_VectorStoreFileObject_H_
#define TINY_CPP_CLIENT_VectorStoreFileObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VectorStoreFileObject_chunking_strategy.h"
#include "VectorStoreFileObject_last_error.h"

namespace Tiny {


/*! \brief A list of files attached to a vector store.
 *
 *  \ingroup Models
 *
 */

class VectorStoreFileObject{
public:

    /*! \brief Constructor.
	 */
    VectorStoreFileObject();
    VectorStoreFileObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreFileObject();


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
	/*! \brief Get The object type, which is always `vector_store.file`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `vector_store.file`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The total vector store usage in bytes. Note that this may be different from the original file size.
	 */
	int getUsageBytes();

	/*! \brief Set The total vector store usage in bytes. Note that this may be different from the original file size.
	 */
	void setUsageBytes(int  usage_bytes);
	/*! \brief Get The Unix timestamp (in seconds) for when the vector store file was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the vector store file was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
	 */
	std::string getVectorStoreId();

	/*! \brief Set The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
	 */
	void setVectorStoreId(std::string  vector_store_id);
	/*! \brief Get The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
	 */
	std::string getStatus();

	/*! \brief Set The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	VectorStoreFileObject_last_error getLastError();

	/*! \brief Set 
	 */
	void setLastError(VectorStoreFileObject_last_error  last_error);
	/*! \brief Get 
	 */
	VectorStoreFileObject_chunking_strategy getChunkingStrategy();

	/*! \brief Set 
	 */
	void setChunkingStrategy(VectorStoreFileObject_chunking_strategy  chunking_strategy);


    private:
    std::string id{};
    std::string object{};
    int usage_bytes{};
    int created_at{};
    std::string vector_store_id{};
    std::string status{};
    VectorStoreFileObject_last_error last_error;
    VectorStoreFileObject_chunking_strategy chunking_strategy;
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreFileObject_H_ */
