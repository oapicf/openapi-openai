/*
 * Embedding.h
 *
 * Represents an embedding vector returned by embedding endpoint. 
 */

#ifndef _Embedding_H_
#define _Embedding_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an embedding vector returned by embedding endpoint. 
 *
 *  \ingroup Models
 *
 */

class Embedding : public Object {
public:
	/*! \brief Constructor.
	 */
	Embedding();
	Embedding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Embedding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the embedding in the list of embeddings.
	 */
	int getIndex();

	/*! \brief Set The index of the embedding in the list of embeddings.
	 */
	void setIndex(int  index);
	/*! \brief Get The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
	 */
	std::list<long long> getEmbedding();

	/*! \brief Set The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
	 */
	void setEmbedding(std::list <long long> embedding);
	/*! \brief Get The object type, which is always \"embedding\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"embedding\".
	 */
	void setObject(std::string  object);

private:
	int index;
	std::list <long long>embedding;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Embedding_H_ */
