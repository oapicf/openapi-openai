/*
 * VectorStoreFileBatchObject.h
 *
 * A batch of files attached to a vector store.
 */

#ifndef _VectorStoreFileBatchObject_H_
#define _VectorStoreFileBatchObject_H_


#include <string>
#include "VectorStoreFileBatchObject_file_counts.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A batch of files attached to a vector store.
 *
 *  \ingroup Models
 *
 */

class VectorStoreFileBatchObject : public Object {
public:
	/*! \brief Constructor.
	 */
	VectorStoreFileBatchObject();
	VectorStoreFileBatchObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VectorStoreFileBatchObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	std::string object;
	int created_at;
	std::string vector_store_id;
	std::string status;
	VectorStoreFileBatchObject_file_counts file_counts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VectorStoreFileBatchObject_H_ */
