
/*
 * Embedding.h
 *
 * Represents an embedding vector returned by embedding endpoint. 
 */

#ifndef TINY_CPP_CLIENT_Embedding_H_
#define TINY_CPP_CLIENT_Embedding_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Represents an embedding vector returned by embedding endpoint. 
 *
 *  \ingroup Models
 *
 */

class Embedding{
public:

    /*! \brief Constructor.
	 */
    Embedding();
    Embedding(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Embedding();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the embedding in the list of embeddings.
	 */
	int getIndex();

	/*! \brief Set The index of the embedding in the list of embeddings.
	 */
	void setIndex(int  index);
	/*! \brief Get The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
	 */
	std::list<long> getEmbedding();

	/*! \brief Set The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
	 */
	void setEmbedding(std::list <long> embedding);
	/*! \brief Get The object type, which is always \"embedding\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"embedding\".
	 */
	void setObject(std::string  object);


    private:
    int index{};
    std::list<long> embedding;
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_Embedding_H_ */
