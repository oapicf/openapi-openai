
/*
 * VectorStoreFileBatchObject.h
 *
 * A batch of files attached to a vector store.
 */

#ifndef TINY_CPP_CLIENT_VectorStoreFileBatchObject_H_
#define TINY_CPP_CLIENT_VectorStoreFileBatchObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VectorStoreFileBatchObject_file_counts.h"

namespace Tiny {


/*! \brief A batch of files attached to a vector store.
 *
 *  \ingroup Models
 *
 */

class VectorStoreFileBatchObject{
public:

    /*! \brief Constructor.
	 */
    VectorStoreFileBatchObject();
    VectorStoreFileBatchObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VectorStoreFileBatchObject();


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
	/*! \brief Get The object type, which is always `vector_store.file_batch`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `vector_store.file_batch`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the vector store files batch was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the vector store files batch was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
	 */
	std::string getVectorStoreId();

	/*! \brief Set The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
	 */
	void setVectorStoreId(std::string  vector_store_id);
	/*! \brief Get The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
	 */
	std::string getStatus();

	/*! \brief Set The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	VectorStoreFileBatchObject_file_counts getFileCounts();

	/*! \brief Set 
	 */
	void setFileCounts(VectorStoreFileBatchObject_file_counts  file_counts);


    private:
    std::string id{};
    std::string object{};
    int created_at{};
    std::string vector_store_id{};
    std::string status{};
    VectorStoreFileBatchObject_file_counts file_counts;
};
}

#endif /* TINY_CPP_CLIENT_VectorStoreFileBatchObject_H_ */
